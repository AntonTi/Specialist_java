package com.anti.specialist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YourName {

    public void inputYourName() throws IOException {
        System.out.print("Введите ваше имя: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.isEmpty()) {
            System.out.println("Привет, незнакомец!");
        } else System.out.printf("Привет, %s!\n", name);
    }
}
