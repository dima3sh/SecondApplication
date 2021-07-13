package org.azati.courses.jms;

import org.azati.courses.entity.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.List;

@Component
public class Sender {

    public static Logger log = LoggerFactory.getLogger(Listener.class);

    @Autowired
    JmsTemplate jmsTemplate;



    @SendTo("queue.out")
    public String sendMessage(final String queueName, final List<Room> message) {
        log.info("send message from second application");
        //jmsTemplate.convertAndSend(queueName, queueName);
        return "message";
    }

}
