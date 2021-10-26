package com.testing;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Lens lensOne = new Lens(
                "sony",
                "85",
                true);

        Lens lensTwo = new Lens(
                "sony",
                "30",
                true);

        Lens lensThree = new Lens(
                "canon",
                "25-95",
                false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLenght);
        System.out.println(lensOne.isprime);
        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLenght);
        System.out.println(lensTwo.isprime);
        System.out.println();

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLenght);
        System.out.println(lensThree.isprime);
    }

    static class Lens {
        String brand;
        String focalLenght;
        boolean isprime;

        Lens(String brand, String focalLenght, boolean isprime){
            this.brand = brand;
            this.focalLenght = focalLenght;
            this.isprime = isprime;
        }
    }
}




