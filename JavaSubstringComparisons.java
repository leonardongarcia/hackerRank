// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int d = k - 1;
        String temp = "";

        String[] subStrings = new String[s.length() - d];
        for (int i = 0; i < (s.length() - d); i++) {            
            String subString = s.substring(i, k++);
            subStrings[i] = (subString);
        }
        
        for (int i = 0; i < subStrings.length; i++) {
            for (int j = i + 1; j < subStrings.length; j++) {
                int eMaior = subStrings[i].compareTo(subStrings[j]);
                if (eMaior > 0) {
                    temp = subStrings[i];
                    subStrings[i] = subStrings[j];
                    subStrings[j] = temp;
                }
            }
        }
        
        smallest = subStrings[0];
        largest = subStrings[(s.length() -d) -1 ];
        
        return smallest + "\n" + largest;
    }
