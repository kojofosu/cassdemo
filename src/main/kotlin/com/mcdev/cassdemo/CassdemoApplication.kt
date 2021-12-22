package com.mcdev.cassdemo

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration
import org.springframework.boot.runApplication

//@EnableAutoConfiguration(exclude = [CassandraDataAutoConfiguration::class, CassandraAutoConfiguration::class])
@SpringBootApplication
class CassdemoApplication

fun main(args: Array<String>) {
	runApplication<CassdemoApplication>(*args)
}
