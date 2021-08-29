package com.anti.specialist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessTheNumber {
    public static void guessNumber() throws IOException {
        // Введите число от 1 до 100
        int num = 0;
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int rnum = random.nextInt(100) + 1;

        while (rnum != num) {
            //System.out.println(rnum);
            count++;
            System.out.print("Чтобы сдаться нажмите: 0\nВведите целое число от 1 до 100: ");
            num = Integer.parseInt(reader.readLine());
            if (num == 0) {
                System.out.println("Вы сдались!");
                break;
            }
            if (rnum < num) {
                System.out.println("Меньше");
            } else if (rnum > num) {
                System.out.println("Больше");
            } else System.out.printf("Вы выиграли, поздравляем !!!\nКоличество попыток: %d", count);
        }

    }
}
