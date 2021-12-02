package main.com.services;

public class Task1Service {
    public double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    private final double ACCELERATION = 9.81;

    public double getLength(double speed, double angle, String radianOrDegree){
        double length;
        speed = (speed*1000)/3600; //because we should use meters per sec
        if(radianOrDegree.equalsIgnoreCase("degree")){
            length = (speed*speed*Math.sin(2*Math.toRadians(angle)))/ACCELERATION;
        }
        else{
            length = (speed*speed*Math.sin(2*angle))/ACCELERATION;
        }



        return round(length, 2);
    }
}
