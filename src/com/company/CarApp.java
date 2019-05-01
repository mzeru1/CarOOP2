// this is where you create an object of the Car class you created
package com.company;

public class CarApp {

    public static void main(String [] args){
        //
        Car c1 = new Car();
        System.out.println("The color of my car c1 is " + c1.getColor());

        Car c2 = new Car("toyota", "suv", 2019, "white");

        Car c3 = new Car("purple");
        c3.setModel("toyota");

        Car c4 = new Car(2020);
        Car c5 = new Car();
        System.out.println(c5.getColor() + " here we go color");


        c1.setSpeed(50);
        //  is going 50 mph
        System.out.println(c1.showSpeed());
        // The red porsche is going 50 mph
        c1.setColor("red");
        c1.setModel("porsche");
        System.out.println("The " + c1.getColor() + " " +
                c1.getModel() + c1.showSpeed());
        // The red Porsche is accelerating
        System.out.println("The " + c1.getColor() + " " +
                c1.getModel() + c1.accel());

        /*
        * The red Porsche is starting
The blue Jetta is starting
The red Porsche is accelerating
The blue Jetta is accelerating
The blue Jetta has stopped to have its emissions checked
The blue Jetta passes its emission test
The red Porsche is going 50 mph
The red Porsche is stopped
The blue Jetta just passed the red Porsche*/
        c2.setColor("blue");
        c2.setModel("jetta");




    }



}
