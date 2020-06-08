package com.synowa.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int k = scanner.nextInt();

        if (k <= n * m && (k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
