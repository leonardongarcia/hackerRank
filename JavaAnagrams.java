// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        String[] letrasA = new String[a.length()];

        for (int i = 0; i < a.length(); i++) {
            letrasA[i] = a.substring(i, i + 1);
        }

        String[] letrasB = new String[b.length()];

        for (int i = 0; i < b.length(); i++) {
            letrasB[i] = b.substring(i, i + 1);
        }
        String temp = "";

        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {
                int eMaior = letrasA[i].compareTo(letrasA[j]);
                if (eMaior > 0) {
                    temp = letrasA[i];
                    letrasA[i] = letrasA[j];
                    letrasA[j] = temp;
                }
            }
        }

        for (int i = 0; i < b.length(); i++) {
            for (int j = i + 1; j < b.length(); j++) {
                int eMaior = letrasB[i].compareTo(letrasB[j]);
                if (eMaior > 0) {
                    temp = letrasB[i];
                    letrasB[i] = letrasB[j];
                    letrasB[j] = temp;
                }
            }
        }

        String stringA = "";
        for (String s : letrasA) {
            stringA = stringA.concat(s);
        }

        String stringB = "";
        for (String s : letrasB) {
            stringB = stringB.concat(s);
        }

        if (stringA.compareTo(stringB) == 0) {
            return true;
        } else {
            return false;
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
