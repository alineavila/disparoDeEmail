package com.alineavila.email;

import org.dhatim.fastexcel.reader.Cell;
import org.dhatim.fastexcel.reader.ReadableWorkbook;
import org.dhatim.fastexcel.reader.Row;
import org.dhatim.fastexcel.reader.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FastexcelHelper {

    public Map<Integer, List<String>> readExcel(String fileLocation) throws IOException {
        Map<Integer, List<String>> data = new HashMap<>(); // hashmap pra ser tipo uma chave-valor do excel
        // TODO provavelmente vou ter que mudar isso pra ser do tipo String String

        try(
                FileInputStream file = new FileInputStream(fileLocation);
                ReadableWorkbook wb = new ReadableWorkbook(file);
        ) {
            Sheet sheet = wb.getFirstSheet();
            try(Stream<Row> rows = sheet.openStream()) {
                rows.forEach(r -> {
                    data.put(r.getRowNum(), new ArrayList<>());

                    for (Cell cell: r) {
                        data.get(r.getRowNum()).add(cell.getRawValue());
                    }
                });
            }
        }
        return data;
    }


}
