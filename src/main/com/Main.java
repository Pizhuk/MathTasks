package main.com;

import main.com.services.Task1Service;
import main.com.services.Task2Service;
import main.com.services.Task3Service;
import main.com.services.Task4Service;

public class Main {
    public static void main(String[] args) {
        Task1Service task1Service = new Task1Service();
        System.out.println(task1Service.getLength(122, 0.96, ""));

        Task2Service task2Service = new Task2Service();
        System.out.println(task2Service.getDistance(50, 60, 10, 1));

        Task3Service task3Service = new Task3Service();
        System.out.println(task3Service.doesPointBelong(-0.5, 0.6));

        Task4Service task4Service = new Task4Service();
        System.out.println(task4Service.getZ(4));
    }
}
