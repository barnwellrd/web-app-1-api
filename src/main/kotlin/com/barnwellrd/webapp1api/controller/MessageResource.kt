package com.barnwellrd.webapp1api.controller

import com.barnwellrd.webapp1api.domain.Message
import com.barnwellrd.webapp1api.service.MessageService
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://localhost:4200"])
@RestController
class MessageResource(val service: MessageService) {
    @GetMapping
    fun index(): List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}