package com.idot;

public class HIndex {
    //a b c d e f g h i
    //1 4 1 4 2 1 3 5 6

    public int returnHIndex(int[] arr){

        for(int i=0; i<arr.length; i++){

            if(arr[i]>=i){

            }

        }

        // find current h-index.
        // at-least h citations are cited h times.
        //9 citations: 1 publication.  Current h-index is one.
        //2 citations: 6 publications. Updated h-index is 2.
        //3 citations: 5 publications. Updated h-index is 3.
        //4 citations: 4 publications. Updated h-index is 4.
        //5 citations: 2 publications. As soon as number of citations grow more than citation, abort.
        //return highest h-index (i.e. 4)

        //approach #2: sort the array.

        return 0;


    }


}
