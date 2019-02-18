package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer count = 0;
        for (int i = 0; i < Integer.valueOf(ints.length); i++){

            if (ints[i-count] % 2 == 0){
                Integer[] endOfTheArray = Arrays.copyOfRange(ints, i-count+1, ints.length);
                for(int j = 0; j < endOfTheArray.length; j++) {
                    ints[i-count + j] = endOfTheArray[j];
                }
                count++;
            }
        }
        return Arrays.copyOf(ints, ints.length - count);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer count = 0;
        for (int i = 0; i < Integer.valueOf(ints.length); i++){

            if (ints[i-count] % 2 == 1){
                Integer[] endOfTheArray = Arrays.copyOfRange(ints, i-count+1, ints.length);
                for(int j = 0; j < endOfTheArray.length; j++) {
                    ints[i-count + j] = endOfTheArray[j];
                }
                count++;
            }
        }
        return Arrays.copyOf(ints, ints.length - count);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer count = 0;
        for (int i = 0; i < Integer.valueOf(ints.length); i++){

            if (ints[i-count] % 3 == 0){
                Integer[] endOfTheArray = Arrays.copyOfRange(ints, i-count+1, ints.length);
                for(int j = 0; j < endOfTheArray.length; j++) {
                    ints[i-count + j] = endOfTheArray[j];
                }
                count++;
            }
        }
        return Arrays.copyOf(ints, ints.length - count);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer count = 0;
        for (int i = 0; i < Integer.valueOf(ints.length); i++){

            if (ints[i-count] % multiple == 0){
                Integer[] endOfTheArray = Arrays.copyOfRange(ints, i-count+1, ints.length);
                for(int j = 0; j < endOfTheArray.length; j++) {
                    ints[i-count + j] = endOfTheArray[j];
                }
                count++;
            }
        }
        return Arrays.copyOf(ints, ints.length - count);
    }
}
