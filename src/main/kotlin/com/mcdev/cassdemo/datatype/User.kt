package com.mcdev.cassdemo.datatype

import java.util.*

data class User(var id: UUID){
    var username: String? = null
    var email: String? = null
    var phone: Long? = 0L
}
