// https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } 
        
        System.out.print(A.substring(0, 1).toUpperCase(Locale.ROOT).concat(A.substring(1)) + " ");
        System.out.print(B.substring(0, 1).toUpperCase(Locale.ROOT).concat(B.substring(1)));
    }
}
