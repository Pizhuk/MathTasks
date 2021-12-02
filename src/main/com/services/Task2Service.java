package main.com.services;

public class Task2Service {

    public double getDistance(double speedOfFirstCar,
                              double speedOfSecondCar,
                              double firstDistanceBetweenCars,
                              double time){
        double secondDistanceBetweenCars = firstDistanceBetweenCars + speedOfFirstCar*time + speedOfSecondCar*time;
        return secondDistanceBetweenCars;
    }
}
