package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] testArr = {1, 2, 3}; // 0 = 1 , 1 = 2 , 2 = 3

        for (int i = 0; i < testArr.length ; i++ ){
            System.out.println(testArr[i]);
        }
        System.out.println("--------------");

        System.out.println(testArr[1]);
        testArr[1] = 22;
        System.out.println(testArr[1]);
        int[] arrayNew = Arrays.copyOf(testArr, testArr.length + 1); // 0 = 1 , 1 = 22 , 2 = 3, 3 = 50
        arrayNew[arrayNew.length-1] = 50;
        System.out.println("--------------");


        System.out.println(arrayNew.length);
        System.out.println("----------------");

        for (int i=0; i<arrayNew.length; i++ ){
            System.out.println(arrayNew[i]);
        }



    }
}
