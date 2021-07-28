package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Car carReference = new Car();
        carReference.name ="Ferrari";
        carReference.maxSpeed = 300;
        carReference.fuelLevel = 60;
        carReference.mileage = 10.5;
        carReference.damaged =true;
        carReference.totalTreveledDistance = 0;
        carReference.doorCount=1;
        carReference.color ="Red";

        System.out.println("Properties of car " + carReference.name);
        System.out.println("Max speed :" + carReference.maxSpeed);
        System.out.println("Fuel Level :" + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Car is damaged :" + carReference.damaged);
        System.out.println("Total Treveld Distance : "+ carReference.totalTreveledDistance);
        System.out.println("Door Count:" + carReference.doorCount);
        System.out.println("Color: " + carReference.color);

        Car car2 = new Car();
        car2.name = "BMW";
        car2.fuelLevel=70;
    }
}
