package com.inputoutput;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.math.*;

public class MixedInput {
    public static void main(String args[]) {
//        Scanner scanner=new Scanner(System.in);
//        int integerValue=scanner.nextInt();
//        float floatValue=scanner.nextFloat();
//        char charaterValue=scanner.next().charAt(0);
//        System.out.printf("%d$%.2f$%c",integerValue,floatValue,charaterValue);
       // System.out.println(Long.MAX_VALUE);
    	Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-- > 0){
          String n1 = scanner.next();
          String n2 = scanner.next();
          BigInteger num1 = new BigInteger(n1);
          BigInteger num2 = new BigInteger(n2);
          System.out.println(num1.multiply(num2).toString());
        }
        
       }

}