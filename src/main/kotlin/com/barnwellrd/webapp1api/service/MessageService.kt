package com.barnwellrd.webapp1api.service

import com.barnwellrd.webapp1api.dao.MessageRepository
import com.barnwellrd.webapp1api.domain.Message
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }
}