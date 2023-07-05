package com.alineavila.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CfguEmailApplication {

    static FastexcelHelper fastexcelHelper = new FastexcelHelper();

    public static void main(String[] args) throws IOException {
        SpringApplication.run(CfguEmailApplication.class, args);
        lerExcel();
    }

    public static void lerExcel() throws IOException {
        System.out.println(fastexcelHelper.readExcel("C:/Users/liine/Documents/cfgu/testeTecnofit.xlsx"));
    }
}
