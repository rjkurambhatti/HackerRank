package com.practise.hackerRank;

/**
 * Created by RushikeshK on 7/27/2016.
 */

import java.util.*;
import java.lang.Math.*;

public class JavaLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int t=in.nextInt();
        /*for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum =0;
            sum = loopfunc(a,b,n);
            System.out.println(sum);
            }
        in.close();
        }

    private static int loopfunc(int a, int b, int n) {
        if(n<=1)
            return b;
        else
        {
            for (int i=2;i<n;++i)
            {
                System.out.printf(" "+(a+Math.pow(2,n-1)*b));
               return (int) (a+Math.pow(2,n-1)*b);
            }
        }
        return 0;*/
        int n = in.nextInt();
        while (n != 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int sum = a;
            for (int i = 0; i < c; i++) {
               sum = sum + (int) (Math.pow(2, i)) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
           n--;
        }
    }
}
