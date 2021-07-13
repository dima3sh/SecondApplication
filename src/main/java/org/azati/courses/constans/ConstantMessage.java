package org.azati.courses.constans;

import javassist.NotFoundException;
import org.azati.courses.entity.Room;
import org.azati.courses.utils.RoomUtil;

import java.util.List;

public class ConstantMessage {

    public static List<Room> checkConstantMessage(String message) throws NotFoundException {
        if(message.equals("getAllRooms")) {
            return RoomUtil.getAllRoom();
        }
        throw new NotFoundException("Method for message constant not found");
    }
}
