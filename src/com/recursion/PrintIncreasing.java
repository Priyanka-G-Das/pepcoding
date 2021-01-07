package com.recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N=  scanner.nextInt();
        printIncreasing(N);
    }

    public static void printIncreasing(int N) {
        
        if(N==0)
        return;
        printIncreasing(N-1);
        System.out.println(N);

    }


}
