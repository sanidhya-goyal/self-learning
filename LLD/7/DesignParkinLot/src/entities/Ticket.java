package src.entities;

class Ticket {
    long entryTime;
    Vehicle vehicle;
//    ParkingSpot parkingSpot;


    // Getters & setters

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

//    public ParkingSpot getParkingSpot() {
//        return parkingSpot;
//    }
//
//    public void setParkingSpot(ParkingSpot parkingSpot) {
//        this.parkingSpot = parkingSpot;
//    }
}

