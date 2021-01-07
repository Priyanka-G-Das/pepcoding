package com.recursion;

import java.util.Scanner;

public class PrintZigzag {
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		printZigzag(N);
	}
	public static void printZigzag(int N)
	{
		if(N==1)
		{
		System.out.print("1 1 1 ");
		return;
		}
		
		System.out.print(N +" ");
		printZigzag(N-1);

		System.out.print(N +" ");
		printZigzag(N-1);
		
		System.out.print(N +" ");
	

	}

}
