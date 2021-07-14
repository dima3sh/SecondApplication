package org.azati.courses.utils;

import java.util.ArrayList;
import java.util.List;

import org.azati.courses.entity.DirectoryStatus;
import org.azati.courses.entity.Room;

public class RoomUtil {

    public static List<Room> getAllRoom() {
        List<Room> list= new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            DirectoryStatus directoryStatus = new DirectoryStatus();
            directoryStatus.setLinkId(1);
            Room room = new Room();
            room.setRoomId((i + 2L));
            room.setFreeRoom(true);
            room.setDirectoryStatus(directoryStatus);
            room.setCostPerHour(12);
            room.setNumberOfBeds(2);
            list.add(room);
        }
        return list;
    }
}
