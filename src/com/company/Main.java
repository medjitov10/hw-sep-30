package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private int maxOfTwoNumbers(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    private int maxOfThree(int a, int b, int c) {
        int result = a > b ? a > c ? a : c : b > c ? b : c;
        return result;
    }

    private boolean isCharacterAVowel(char a) {
        String newA = String.valueOf(a);
        return "aeiou".contains(newA);
    }

    private String reverseString(String string) {
        String result = "";
        for ( int i = 0; i < string.length(); i++ ) {
            result += string.charAt(string.length() - i - 1);
        }
        return result;
    }

    private int findLongestWord(String[] arr) {
        int max = arr[0].length();
        for(int i = 1; i < arr.length; i++ ) {
            if (max < arr[i].length()) max = arr[i].length();
        }
        return max;
    }

    public List<String> filterLongWords(String[] arr, int filter) {
        List<String> result = new ArrayList<String>();
        for( int i = 0; i < arr.length; i++ ) {
            if (arr[i].length() > filter ) result.add(arr[i]);
        }
        return result;
     }

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        String[] string = {"qwe", "qweqwe", "q"};
        System.out.println(main.filterLongWords(string, 2));
        System.out.println(main.findLongestWord(string));
        System.out.println(main.reverseString("qweqweqwe"));
        System.out.println(main.isCharacterAVowel('q'));
        System.out.println(main.maxOfTwoNumbers(4,3));
        System.out.println(main.maxOfThree(12, 5, 4));
    }
}
