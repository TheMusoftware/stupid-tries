package dreamcar.main;

import dreamcar.cars.Cars;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        //First car info by constructs
        Cars car1 = new Cars("Mercedes-Benz","S600L",1996,"Black","14.000 $");

        // Second car info by getter and setter
        Cars car2 = new Cars();
        car2.setBrand("BMW");
        car2.setModel("/// M5 ");
        car2.setYear((int) 2009);
        car2.setColor("White");
        car2.setPrice("25.000 $");

        //Third car info by class constructs
        Cars car3 = new Cars("Rolls Royce");

        car1.showinfo();
        car2.showinfo();
        car3.showinfo();

    }
}