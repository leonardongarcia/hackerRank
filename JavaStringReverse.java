// https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        
        String response = "";
        
        StringBuilder reverseString = new StringBuilder(A).reverse();
        
        if (reverseString.toString().equals(A)) {
            response = "Yes";
        } else {
            response = "No";
        }
        
        System.out.println(response);
    }
}
