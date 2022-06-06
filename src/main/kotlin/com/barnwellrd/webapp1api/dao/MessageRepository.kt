package com.barnwellrd.webapp1api.dao

import com.barnwellrd.webapp1api.domain.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {

    @Query("select * from \"messages\"")
    fun findMessages(): List<Message>
}