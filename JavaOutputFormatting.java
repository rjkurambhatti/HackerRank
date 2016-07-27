package com.practise.hackerRank;

import java.util.Scanner;

/**
 * Created by RushikeshK on 7/26/2016.
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
       /* for(int i=0;i<3;i++) {
            String[] s1 = new String[i];
            int[] x= new int[i];
            if((s1[i].length() < 10) && (x[i] >0 && x[i]<999))
            {
               System.out.printf("%-15s%03d%n", s1[i], x[i]);
            }
        }*/
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
