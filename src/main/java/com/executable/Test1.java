package com.executable;

public class Test1 {

    public static void print(int[] input) {
        int size= input.length;
        for(int i=0; i<size; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }


    public static void incrementArray(int input[]) {
        for (int i = 0; i < input.length; i++) {
            input[i]++;
        }
    }

    public static void main(String[] args) {

//		set 1
        int i = 10;
        increment(i);
        System.out.println(i);

//		set 2
//		int arr[] = { 1, 2, 3, 4, 5 };
//		incrementArray(arr);
//		print(arr);

    }

    private static void increment(int i) {
        ++i;
    }

}
