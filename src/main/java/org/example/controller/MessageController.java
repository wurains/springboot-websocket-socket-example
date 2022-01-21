package org.example.controller;

import org.example.component.SocketServer;
import org.example.model.MessageBodyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
    /** 消息发送工具对象 */
    @Autowired
    private SimpMessageSendingOperations simpMessageSendingOperations;

    /** 广播发送消息，将消息发送到指定的目标地址 */
    @MessageMapping("/test")
    public void sendTopicMessage(MessageBodyModel messageBody) {
        simpMessageSendingOperations.convertAndSend(messageBody.getDestination(), messageBody);
    }

    @GetMapping("/startSocket")
    public void startSocket() {
//        socketServer.openSelector();
    }

    @GetMapping("/closeSocket")
    public void closeSocket() {
//        socketServer.stopSelector();
    }
}
