package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock <0 && clock >23 ) {
            return false;
        } else if (clock >=20 && clock<= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     
    }

    public static double area(double width, double height) {
       
    }

    public static double area(double radius) {
       
    }
}
