package com.anti.specialist;

public class MatrixYourName {
    private String name = "";
    private int row = 0;
    private int col = 0;

    public void matrixYourName(String name, int row, int col) {
        this.name = name;
        this.row = row;
        this.col = col;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(name + " ");
            }
            System.out.println();
        }

    }
}
