package com.company;


import java.util.*;
public class CernerTemperature {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        double ftemp = sc.nextDouble();
        System.out.println(" input is :" +ftemp );
        //creating object for class temperature
        Temperature temp = new Temperature(ftemp);

        System.out.println(" F is:" + temp.getFahrenheit());
        System.out.println(" F to celsius:" + temp.getCelsius());
        System.out.println(" F to kelvin:" + temp.getKelvin());
        temp.setFaherenheit(40);
        System.out.println("New F is :" +temp.tempf);
        System.out.println(" F to celsius:" + temp.getCelsius());
    }
}

// for changing fahrenheit to celsius, kelvin
class Temperature {

    double tempf;
    //constructor for temperature class
    Temperature(double f){
        this.tempf = f;
    }
    double getFahrenheit(){
        return tempf;
    }
    double getCelsius(){
        return ((double)5/9*(tempf-32));
    }
    double getKelvin(){
        return  ((double)5/9*(tempf-32)+273);
    }
    void setFaherenheit(double f){
        this.tempf = f;
    }

}