package com.recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int x = scn.nextInt();
        System.out.println(power(N, x));

    }

    public static int power(int N, int x) {
        if (x == 1)
            return N;
        return N * power( N , x-1);
    }


}
