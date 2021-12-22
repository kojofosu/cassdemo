package com.mcdev.cassdemo.datatype

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.*

@Table(value = "users")
data class User(@PrimaryKey var id: UUID){
    var username: String? = null
    var email: String? = null
    var phone: Long? = 0L
}
