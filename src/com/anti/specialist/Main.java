package com.anti.specialist;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        st1.data = "Hello";
        System.out.println(st2.data);

    }

}
