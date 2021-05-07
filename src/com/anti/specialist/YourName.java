package com.anti.specialist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YourName {

    public void inputYourName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        while (name.isEmpty()) {
            System.out.print("Введите ваше имя: ");
            name = reader.readLine();
        }
        System.out.printf("Привет, %s!\n", name);
    }
}
