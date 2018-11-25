package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a array lenght: ");

        //the count you add self
        int count = scanner.nextInt();
        int[] array = readArray(count);
        System.out.println("You have entered all arays. sum of: " + array.length);
        printArray(array);

        int[] reversedArray = reverseArray(array);
        printArray(reversedArray);
    }
    
    public static int[] readArray(int count){
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {

            System.out.println("Enter " + i + " array: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static void printArray(int[]array){
        //print array method
        System.out.println("The numbers what you added to your Array.");
        for (int i = 0; i < array.length; i++) {
            System.out.println("The " + i + " index of array is: " + array[i]);
        }

    }

    public static int[] reverseArray(int[]array){
        System.out.println("There are your array in reverse mode");
        int new_array[] = new int[array.length];
        int count = array.length;
        for (int i = 0; i < new_array.length ; i++) {
            count--;
            new_array[i] = array[count];
        }
        return new_array;
    }











}
