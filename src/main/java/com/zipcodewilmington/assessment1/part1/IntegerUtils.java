package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer product = 1;
        for (int i = 1; i <= n; i++){
            product = product * i;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String tempIntString = val.toString();
        StringBuilder builder = new StringBuilder(tempIntString);
        String reversedIntString = builder.reverse().toString();
        Integer reversedVal = Integer.parseInt(reversedIntString);
        return reversedVal;




        /*Integer reversedInt = val;
        while (val != 0){
            reversedInt = reversedInt * 10 + val % 10;
            val = val / 10;
        }
        String temp = val.toString();
        String temp2 = temp.substring(val);
        Integer output = Integer.parseInt(temp2);
        return output;*/
    }
}
