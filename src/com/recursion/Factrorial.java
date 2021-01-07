package com.recursion;

import java.util.Scanner;

public class Factrorial {
	
	public static void main(String args[])
	{
	 Scanner scn = new Scanner(System.in);
     int N = scn.nextInt();
       System.out.println(factorial(N));
 }

 public static int factorial(int N) {
     if (N == 1)
         return 1;
     return N * factorial(N - 1);

 }

}
