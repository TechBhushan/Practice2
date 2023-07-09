package com.stringandarrays;

public class ArraysWithoutDuplicates {
    public static void main(String[] args) {

        int[] nums={1,2,2,3,4,5,5,5};

        for(int i=0;i<nums.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.println(nums[i]+" ");
            }
        }
    }
}
