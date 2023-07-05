package com.alineavila.email;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CfguEmailApplicationTests {

    FastexcelHelper fastexcelHelper = new FastexcelHelper();

    @Test
    void contextLoads() {
    }
//    @Test
//    public void whenParsingExcelFile_thenCorrect() throws IOException {
//        Map<Integer, List<String>> data = fastexcelHelper.readExcel("fileLocation");
//
//        assertEquals("Name", data.get(1).get(0));
//        assertEquals("Age", data.get(1).get(1));
//
//        assertEquals("John Smith", data.get(3).get(0));
//        assertEquals("20", data.get(3).get(1));
//    }


}
