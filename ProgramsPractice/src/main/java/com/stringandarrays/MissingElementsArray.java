package com.stringandarrays;

public class MissingElementsArray {

    public static void main(String[] args) {

        int[] arr={1,2,4,5,7,8,9,12,15};
        int j=0;
        for(int i=1;i<arr[arr.length-2];i++){
            if(i==arr[j]){
                j++;
            }else
                System.out.println(" "+i);
        }
    }
}
