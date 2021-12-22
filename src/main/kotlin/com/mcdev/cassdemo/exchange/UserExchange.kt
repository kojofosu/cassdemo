package com.mcdev.cassdemo.exchange

import com.mcdev.cassdemo.datatype.User
import com.mcdev.cassdemo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserExchange {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun createUser(user: User) {
        userRepository.save(user)
    }

    fun getUsers(): List<User> {
        return userRepository.findAll()
    }
}