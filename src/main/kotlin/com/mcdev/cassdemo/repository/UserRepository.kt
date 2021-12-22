package com.mcdev.cassdemo.repository

import com.mcdev.cassdemo.datatype.User
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CassandraRepository<User, Long> {
}