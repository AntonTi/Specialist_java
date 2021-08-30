package com.anti.specialist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class EnterNamesSort {
    public static void enterNamesSort() throws IOException {
        //Вводить имена до тех пор, пока не будет введена пустая строка.
        //Вывести имена в алфавитном порядке
        System.out.println("Enter names: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        String name;

        do {
            name = reader.readLine();
            if (!name.isEmpty())
                list.add(name);
        } while (!name.isEmpty());

        Object[] arr = list.toArray();
        Arrays.sort(arr);

        for (Object s : arr)
            System.out.print(s + " ");
    }

}
