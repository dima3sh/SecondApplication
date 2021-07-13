package org.azati.courses.utils;

import java.util.ArrayList;
import java.util.List;
import org.azati.courses.entity.Room;
import org.azati.courses.enums.StatusRoom;

public class RoomUtil {

    public static List<Room> getAllRoom() {
        List<Room> list= new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            Room room = new Room();
            room.setRoomId((i + 2L));
            room.setFreeRoom(true);
            room.setStatusRoom(StatusRoom.clean);
            room.setCostPerHour(12);
            room.setNumberOfBeds(2);
            list.add(room);
        }
        return list;
    }
}
