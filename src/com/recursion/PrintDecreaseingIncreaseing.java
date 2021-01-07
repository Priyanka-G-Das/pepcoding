package com.recursion;

import java.util.Scanner;

public class PrintDecreaseingIncreaseing {
	public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        pdi(N);
    }

    public static void pdi(int N) {
        if (N == 0)
            return;
        System.out.println(N);
        pdi(N - 1);
        System.out.println(N);

    }

}
