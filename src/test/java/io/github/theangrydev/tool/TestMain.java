package io.github.theangrydev.tool;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestMain {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("test-tool.properties"));

        System.out.println("Test main with property=" + properties.getProperty("some.property"));
    }
}
