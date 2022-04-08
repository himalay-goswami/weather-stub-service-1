package com.idot;

public class Binary {

    public void searchBinary(int[] arr, int element){

        // 1,2,5,7,8,9,12,[*],14,15,17,18,21,25

        int length = arr.length;
        int l = arr[0];
        int r = arr[length-1];

        int mid = (l+r)/2;
        if(mid>element){
             r = mid;
        }






    }
}
