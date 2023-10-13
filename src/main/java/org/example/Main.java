package org.example;

public class Main {
    public static void main(String[] args) {

        String makeOfCar = "Ford";
        boolean isJapanese = makeOfCar == "Toyota" ? true : false;

        if (isJapanese) {
            System.out.println("This car is a Japanese brand");
        } else {
            System.out.println("This car is not a Japanese brand");
        }

        System.out.println();


        String s = (isJapanese) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        System.out.println();

        int ageOfCar = 29;

        String ageText = ageOfCar >= 10 ? "older" : "newer";
        System.out.println("The car is " + ageText);

    }
}