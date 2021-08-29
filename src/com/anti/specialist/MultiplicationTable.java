package com.anti.specialist;

public class MultiplicationTable {
    public static void multiplTable_10x10() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }

    public static void multiplTable(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}
