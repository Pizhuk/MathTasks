package main.com.services;

public class Task4Service {
    public double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    private static double E = 2.718;
    public String getZ(double x){
        String answer;
        double z = ((6*Math.log(Math.sqrt(Math.pow(E, x+1)+2*Math.pow(E, x)*Math.cos(x))))/Math.log(x-Math.pow(E, x+1)*Math.sin(x))) + Math.abs((Math.cos(x)/Math.pow(E, Math.sin(x))));
        if(Math.pow(E, x+1)+2*Math.pow(E, x)*Math.cos(x) <= 0 ||
                Math.log(x-Math.pow(E, x+1)*Math.sin(x)) == 0 || x-Math.pow(E, x+1)*Math.sin(x) <= 0 ||
                Math.pow(E, Math.sin(x)) == 0){
            answer = "It's impossible";
        }
        else {
            z = round(z, 5);
            answer = z+"";
        }
        return answer;
    }
}
