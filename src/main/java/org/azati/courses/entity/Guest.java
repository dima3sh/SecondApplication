package org.azati.courses.entity;

import java.time.LocalDateTime;


public class Guest extends Person {

    private Long guestId;
    private Room guest_room_id;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Integer invoice;


    public Room getGuestRoomId() {
        return guest_room_id;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setGuestRoomId(Room roomId) {
        this.guest_room_id = roomId;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "room_id=" + guest_room_id.getRoomId() +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", invoice=" + invoice +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return guest_room_id.equals(guest.guest_room_id) && departureTime.equals(guest.departureTime)
                && arrivalTime.equals(guest.arrivalTime) && invoice.equals(guest.invoice) && super.equals(o);
    }

    @Override
    public int hashCode() {
        int result = guest_room_id.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + Integer.hashCode(invoice);
        result = 31 * result + super.hashCode();
        return result;
    }

}
