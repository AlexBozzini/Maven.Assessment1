package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String makeStringCapital = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        return makeStringCapital;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder builder = new StringBuilder(str);
        String reverse = builder.reverse().toString();
        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder builder = new StringBuilder(str);
        String reverse = builder.reverse().toString();
        String reverseThenCaps = Character.toUpperCase(reverse.charAt(0)) + reverse.substring(1);
        return reverseThenCaps;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String removeFirstChar = str.substring(1);
        String output = removeFirstChar.replace(removeFirstChar.substring(removeFirstChar.length() -1), "");
        return output;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++){
            char letter = characters[i];
            if (Character.isUpperCase(letter)){
                characters[i] = Character.toLowerCase(letter);
            } else if (Character.isLowerCase(letter)){
               characters[i] = Character.toUpperCase(letter);
            }
        }
        return new String(characters);
    }
}
