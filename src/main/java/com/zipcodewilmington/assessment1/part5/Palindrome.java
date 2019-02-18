package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        char[] letters = input.toCharArray();
        Integer numOfChars = letters.length;
        Integer numOfDoubles = 0;
        for (int i = 0; i < letters.length - 1; i++){
            if (letters[i] == letters[i + 1]){
                numOfDoubles++;
            }
        }
        Integer numOfTriples = 0;
        for (int i = 1; i < letters.length - 1; i++){
            if (letters[i-1] == letters[i + 1]){
                numOfTriples++;
            }
        }
        Integer numOfQuads = 0;
        for (int i = 1; i < letters.length - 2; i++){
            if (letters[i] == letters[i + 1] && letters[i - 1] == letters[i + 2]){
                numOfQuads++;
            }
        }
        Integer numOfSixes = 0;
        for (int i = 2; i < letters.length - 3; i++){
            if (letters[i] == letters[i + 1] && letters[i - 1] == letters[i + 2] && letters[i - 2] == letters[i + 3]){
                numOfSixes++;
            }
        }
        Integer numOfPalindromes = numOfChars + numOfDoubles + numOfTriples + numOfQuads +numOfSixes;
        return numOfPalindromes;
    }
}
