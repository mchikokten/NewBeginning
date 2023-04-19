package com.ua.robot.Lesson28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        try {
            Files.writeString(Paths.get("test1.txt"), "xasdajdal");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path path = Paths.get("test1.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
