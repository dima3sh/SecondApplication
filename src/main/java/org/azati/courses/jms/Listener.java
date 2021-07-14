package org.azati.courses.jms;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import javassist.NotFoundException;
import org.azati.courses.constans.ConstantMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.azati.courses.entity.Room;

@Component
public class Listener {

    public static Logger log = LoggerFactory.getLogger(Listener.class);

    @JmsListener(destination = "queue.in")
    @SendTo("queue.out")
    public String getMessage(final Message jsonMessage) throws JMSException {
        List<Room> rooms = new ArrayList<>();
        log.info("get message from queue.in");
        if(jsonMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)jsonMessage;
            try {
                rooms = ConstantMessage.checkConstantMessage(textMessage.getText());
            } catch (NotFoundException e) {
                log.info(e.getMessage() + "; Stack trace : " + Arrays.toString(e.getStackTrace()));
            }
        }

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Type  foo = new TypeToken<List<Room>>(){}.getType();
        log.info("send message into queue.out");
        return gson.toJson(rooms, foo);
    }

}