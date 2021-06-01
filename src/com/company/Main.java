package com.company;

import java.util.ArrayList;
import java.util.HashSet;

//Non-Bruteforce method
//
//Problem :
//Having an array of integers and a number X, find all pairs of integers in the array which have SUM equal to the number X.
//The array can have whole numbers from 1 to 100 and X = 62

public class Main {

    public static ArrayList<int[]> sumOfTwoEqlValueFrmArray(int[] array, int value){
        ArrayList<int[]> result = new ArrayList<>();
        HashSet<Integer> collectedSet = new HashSet<>();
        //only going through the each elements once
        //therefore time complexity drops from O(n^2) to O(n)
        for (int index = 0; index < array.length; index++) {
            int difference = value - array[index];
            if (collectedSet.contains(difference)){
                result.add(new int[]{array[index], difference});
            }
            collectedSet.add(array[index]);
        }
        return result;
    }
    public static void main(String[] args) {
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        int value = 9;
        ArrayList<int[]> results = sumOfTwoEqlValueFrmArray(array, value);
        if (results.isEmpty()){
            System.out.println("No Pairs were found!!!");
        }else{
            for (int[] result : results) {
                System.out.println(result[0] + "," + result[1]);
            }
        }
    }
}
