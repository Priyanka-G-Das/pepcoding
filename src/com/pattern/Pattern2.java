package com.pattern;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++) {
				if(i+j<=N+1)
				{
				System.out.print("*");
				System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
