package com.recursion;

import java.util.Scanner;

public class PrintDecreasing {
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        printDecreasing(N);
    }

    public static void printDecreasing(int N) {
        if (N == 0)
            return;
        System.out.println(N);
        printDecreasing(N - 1);

    }

}
