package org.javaexercises.cabby;

public class CabRide {
    private static final int FARE_PER_KM = 10;

    private final int distanceTravelled;

    public CabRide(int distanceTravelledInKm) {
        this.distanceTravelled = distanceTravelledInKm;
    }

    public int fare() {
        return distanceTravelled * FARE_PER_KM;
    }
}
