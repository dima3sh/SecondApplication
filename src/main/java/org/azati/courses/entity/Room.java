package org.azati.courses.entity;

import java.util.List;


public class Room {

    private Long roomId;
    private Boolean isFreeRoom;
    private Integer numberOfBeds;
    private Integer costPerHour;
    private DirectoryStatus directoryStatus;
    private List<Equipment> equipments;
    private List<Guest> guests;


    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long idRoom) {
        this.roomId = idRoom;
    }

    public Boolean getFreeRoom() {
        return isFreeRoom;
    }

    public void setFreeRoom(Boolean freeRoom) {
        isFreeRoom = freeRoom;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Integer getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Integer costPerHour) {
        this.costPerHour = costPerHour;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public DirectoryStatus getDirectoryStatus() {
        return directoryStatus;
    }

    public void setDirectoryStatus(DirectoryStatus directoryStatus) {
        this.directoryStatus = directoryStatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idRoom=" + roomId +
                ", isFreeRoom=" + isFreeRoom +
                ", numberOfBeds=" + numberOfBeds +
                ", costPerHour=" + costPerHour +
                ", equipments=" + equipments +
                ", guest=" + guests +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return roomId.equals(room.roomId) && isFreeRoom.equals(room.isFreeRoom)
                && numberOfBeds.equals(room.numberOfBeds) && costPerHour.equals(room.costPerHour)
                && equipments.equals(room.equipments);
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(roomId);
        result = 31 * result + isFreeRoom.hashCode();
        result = 31 * result + Integer.hashCode(numberOfBeds);
        result = 31 * result + Integer.hashCode(costPerHour);
        result = 31 * result + equipments.hashCode();
        return result;
    }
}
