package com.mcdev.cassdemo

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration
import org.springframework.boot.runApplication
import kotlin.reflect.KClass

@SpringBootApplication
@EnableAutoConfiguration(exclude = [CassandraDataAutoConfiguration::class, CassandraAutoConfiguration::class])
class CassdemoApplication

fun main(args: Array<String>) {
	runApplication<CassdemoApplication>(*args)
}
