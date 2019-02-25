package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (int i = 0; i < objectArray.length; i ++){
            if (objectArray[i] == objectToCount){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer count = 0;
        for (int i = 0; i < Integer.valueOf(objectArray.length); i++){

            if (objectToRemove.equals(objectArray[i-count])){
                Object[] endOfTheArray = Arrays.copyOfRange(objectArray, i-count+1, objectArray.length);
                for(int j = 0; j < endOfTheArray.length; j++) {
                    objectArray[i-count + j] = endOfTheArray[j];
                }
                count++;
            }
        }
        return Arrays.copyOf(objectArray, objectArray.length - count);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer count = 1, tempCount;
        Object mode = objectArray[0];
        Object temp;
        for (int i = 0; i < objectArray.length - 1; i++){
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++){
                if (temp == objectArray[j]){
                    tempCount++;
                }
            }
            if (tempCount > count){
                mode = temp;
                count = tempCount;
            }
        }
        return mode;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommonElement = objectArray[0];
        for (int i = 1; i < objectArray.length; i++){
           if (ArrayUtils.getNumberOfOccurrences(objectArray, objectArray[i]) < ArrayUtils.getNumberOfOccurrences(objectArray, leastCommonElement)){
               leastCommonElement = objectArray[i];
           }
        }
        return leastCommonElement;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        Integer firstLength = objectArray.length;
        Integer secondLength = objectArrayToAdd.length;

        Integer[] mergedArray = new Integer[firstLength + secondLength];
        for (int i = 0; i < firstLength; i++){
            mergedArray[i] = objectArray[i];
        }
        for (int i = 0; i < secondLength; i++){
            mergedArray[i + firstLength] = objectArrayToAdd[i];
        }
        return mergedArray;
    }
}
