package main.com.services;

public class Task3Service {
    public int doesPointBelong(double x, double y){
        int answer = 0;
        if((y<=x && x>=0 && y>=-1 && y>=1.5*x-1)||(x<=0 && y <= -x && y >=-1 && y >= -1.5*x - 1)){
            answer = 1;
        }
        return answer;
    }
}
