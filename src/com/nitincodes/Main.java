package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	int[] nums = {12,5,72,7896,453};
        System.out.println(FindDigits(nums));
    }
    static int FindDigits(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
static boolean even(int num){
        int noOfDigits = digits(num);
        if(num%2==0){
            return true;
        }
        return false;

}
static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;

}


}
