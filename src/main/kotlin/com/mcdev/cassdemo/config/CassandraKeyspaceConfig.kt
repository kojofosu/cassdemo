package com.mcdev.cassdemo.config

import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.type.DataTypes
import com.datastax.oss.driver.api.querybuilder.SchemaBuilder
import com.datastax.oss.driver.api.querybuilder.schema.CreateKeyspace
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.net.InetSocketAddress

@Configuration
class CassandraKeyspaceConfig {

    val keyspace = "testkeyspace"
    val tableName = "users"
    private lateinit var session: CqlSession

    /*create connection*/
    @Bean
    fun configureCassandraDb() {
        session = CqlSession.builder()
            .addContactPoint(InetSocketAddress("localhost", 9042))
            .withLocalDatacenter("datacenter1")
            .build()

        val createKs = SchemaBuilder.createKeyspace(keyspace)
            .ifNotExists()
            .withSimpleStrategy(1)
            .build()

        val createTb = SchemaBuilder.createTable(keyspace, tableName)
            .ifNotExists()
            .withPartitionKey("id", DataTypes.UUID)
            .withColumn("username", DataTypes.TEXT)
            .withColumn("email", DataTypes.TEXT)
            .withColumn("phone", DataTypes.BIGINT)
            .build()

        session.execute(createKs) //create the keyspace
        session.execute(createTb) //create the table
    }

    @Bean
    fun session(): CqlSession {
        return this.session
    }

    @Bean
    fun close() {
        session.close()
    }
}