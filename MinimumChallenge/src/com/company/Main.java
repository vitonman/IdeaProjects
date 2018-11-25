package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter count:");
        int count = scanner.nextInt();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("The minimum is " + returnedMin);

    }

    public static int[] readIntegers(int count){
        System.out.println("Enter: " + count + " integer values.\r");

        int[] array = new int[count];

        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println("The index  was "+ i + ", number of index: "+ array[i] +  ".");
        }
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            //should return minimum array
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;

    }

}
