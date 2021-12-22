package com.mcdev.cassdemo.controller

import com.mcdev.cassdemo.datatype.User
import com.mcdev.cassdemo.exchange.UserExchange
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController(value = "/users")
class UserController {

    @Autowired
    private lateinit var userExchange: UserExchange


    @PostMapping
    fun addUser(@RequestBody user: User) {
        userExchange.createUser(user)
    }

    @GetMapping
    fun fetchUsers(): List<User> {
        return userExchange.getUsers()
    }
}