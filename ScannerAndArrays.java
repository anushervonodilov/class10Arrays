package com.class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers = new int[5];

//        numbers[0] = 10;
//        numbers[1] = 70;
//        numbers[2] = 40;
//        numbers[3] = 20;
//        numbers[4] = 30;

//        numbers[0] = input.nextInt();
//        numbers[1] = input.nextInt();
//        numbers[2] = input.nextInt();
//        numbers[3] = input.nextInt();
//        numbers[4] = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(numbers));


    }
}
