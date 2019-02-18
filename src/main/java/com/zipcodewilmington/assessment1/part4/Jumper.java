package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        Integer typeOneJumps = k / j;
        Integer typeTwoJumps = k % j;
        return typeOneJumps + typeTwoJumps;
    }
}
