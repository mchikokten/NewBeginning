package com.ua.robot.Lesson27;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (OutputStream out = new FileOutputStream("test.txt");
            OutputStreamWriter outWriter = new OutputStreamWriter(out)) {
                String a = "asdhasijd";
                outWriter.write(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream input = new FileInputStream("test.txt");
            InputStreamReader inReader = new InputStreamReader(input)) {
                byte [] a = input.readAllBytes();
                String b = new String(a);
                System.out.println(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}