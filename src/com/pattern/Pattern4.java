package com.pattern;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int i = 1; i <= N; i++) 
            {
            	for(int j=2;j<=i;j++)
            	{
            		System.out.print("\t");
            	}
            	for (int j = 1; j <= N-i+1; j++) {
                    System.out.print("*");
               System.out.print("\t");
            }
            System.out.println();
        }

    }
}
