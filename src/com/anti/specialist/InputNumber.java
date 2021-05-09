package com.anti.specialist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {

    public void inputNumber() throws IOException {
        System.out.print("Введите число от 1 до 9: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        String s = "";
        switch (num) {
            case 1:
                s = "один";
                break;
            case 2:
                s = "два";
                break;
            case 3:
                s = "три";
                break;
            case 4:
                s = "четыре";
                break;
            case 5:
                s = "пять";
                break;
            case 6:
                s = "шесть";
                break;
            case 7:
                s = "семь";
                break;
            case 8:
                s = "восемь";
                break;
            case 9:
                s = "девять";
                break;
            default:
                s = "Вы ввели недопустимое число";
        }

        System.out.println(s);

    }
}
