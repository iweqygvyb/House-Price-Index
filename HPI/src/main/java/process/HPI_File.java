package process;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HPI_File {
    public List<String[]> getPrices() {
        String csvFile = "UK-HPI-full-file-2024-04.csv";
        String[] record;
        List<String[]> filteredRecords = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            while ((record = reader.readNext()) != null) {
                // Example filter: Only include records where the second column (Age) is greater than 20
                if (record[1].equals("Sutton")) {
                    String[] prices = new String[4];
                    prices[0] = record[0];
                    prices[1] = record[10];
                    prices[2] = record[14];
                    prices[3] = record[18];
                    filteredRecords.add(prices);
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        // Process filtered records
        /*for (String[] filteredRecord : filteredRecords) {
            System.out.println(String.join(", ", filteredRecord));
        }*/
        return filteredRecords;
    }
}
