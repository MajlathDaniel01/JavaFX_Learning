package com.dani;

public class TwoDimensionalArray {

    public static void main (String[] args){

        int arr[][][] = { {{2,7,9},{3,6,1}}, {{2,7,9}}, {{2,7,9},{3,6,1},{4,7,0}} };

        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr[i].length; j++ ) {
                for ( int z = 0; z < arr[i][j].length; z++ ) {
                    System.out.print(arr[i][j][z] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(arr[2][2][2]);//should be '0'
    }

}

