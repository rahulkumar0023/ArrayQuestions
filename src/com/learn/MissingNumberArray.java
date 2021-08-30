package com.learn;

//Missing number - array

public class MissingNumberArray {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,8,9,10};

        MissingNumberArray missingNumberArray = new MissingNumberArray();
        missingNumberArray.missingNumber(arr);

    }

    public void missingNumber(int array[]){

        int sumofN = (10 * ( 10 + 1 ) ) / 2;
        int sumArray = 0;

        for(int i : array){
            sumArray += i;
        }

        int diff =  sumofN - sumArray;

        System.out.println("Missing number is : " + diff);
    }
}
