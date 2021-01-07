package com.recursion;

import java.util.Scanner;

public class PowerLogarithim {
	public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        System.out.println(power(n, x));
    }

    public static int power(int n, int x) {
        if (x == 0)
            return 1;

        return n * power(n, x - 1);
    }
}
