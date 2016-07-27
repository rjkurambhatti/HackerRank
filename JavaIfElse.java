package com.practise.hackerRank;

/**
 * Created by RushikeshK on 7/26/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n<=5 && n>=2)
                ans = "Not Weird";
            if (n<=20 && n>=6)
                ans = "Weird";
            else
                ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
