package org.azati.courses.entity;

import org.azati.courses.enums.StatusRoom;

import java.util.List;


public class DirectoryStatus {

    private Integer linkId;

    private String varcharRoomStatus;

    private StatusRoom statusRoom;

    private List<Room> rooms;

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getVarcharRoomStatus() {
        return varcharRoomStatus;
    }

    public void setVarcharRoomStatus(String varcharRoomStatus) {
        this.varcharRoomStatus = varcharRoomStatus;
    }

    public StatusRoom getStatusRoom() {
        return statusRoom;
    }

    public void setStatusRoom(StatusRoom statusRoom) {
        this.statusRoom = statusRoom;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
