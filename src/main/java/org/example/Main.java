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

        System.out.println();

        double var1 = 20.00;
        double var2 = 80.00;

        double var3 = var1 + var2 * 100;
        System.out.println("Var3 = " + var3);

        double var4 = var3%40.00;
        System.out.println("Remainder = " + var4);

        boolean zeroRemainder = var4 == 0 ? true : false;

        System.out.println("zeroRemainder = " + zeroRemainder);

        if (!zeroRemainder) {
            System.out.println("Got some remainder");
        }




    }
}