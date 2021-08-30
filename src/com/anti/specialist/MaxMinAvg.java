package com.anti.specialist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinAvg {
    public static void maxMinAvg() throws IOException {
        // Попросить пользователя ввести 4 числа.
        // Вывести среднее, максимальное и минимальное значение.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] m = new int[4];
        for (int i = 0; i < m.length; i++) {
            System.out.printf("m[%d]= ", i);
            m[i] = Integer.parseInt(reader.readLine());
        }

        int max = m[0], min = m[0];
        int sum = 0;
        double avg;

        for (int n : m) {
            sum += n;
            if (max < n) max = n;
            if (min > n) min = n;
        }

        avg = (double) sum / m.length;
        System.out.printf("Среднее значение: %.2f\nМаксимальное: %d\nМинимальное: %d", avg, max, min);
    }

}
