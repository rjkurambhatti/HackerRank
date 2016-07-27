package com.practise.hackerRank;

import java.util.Scanner;

/**
 * Created by RushikeshK on 7/26/2016.
 */
public class JavaStdinandStdoutII {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        String as = scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
