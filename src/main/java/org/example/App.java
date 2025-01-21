package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        String csvFile = "table.csv";
        List<Athlete> athletes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] column = line.split(",");
                int athleteNumber = Integer.parseInt(column[0]);
                String athleteName = column[1];
                String countryCode = column[2];
                String skiTime = column[3];
                String[] shootingRanges = Arrays.copyOfRange(column, 4, 7);

                Athlete athlete = new Athlete(athleteNumber, athleteName, countryCode, skiTime, shootingRanges);
                athletes.add(athlete);
            }
        } catch (IOException e) {
            System.err.println("The CSV file does not exist: " + e.getMessage());
        }

        // Sort athletes by final time
        athletes.sort(new AthleteComparator());

        // Output results
        if (athletes.size() >= 3) {
            System.out.println("Winner - " + athletes.get(0));
            System.out.println("Runner-up - " + athletes.get(1));
            System.out.println("Third Place - " + athletes.get(2));
        } else {
            System.out.println("Not enough athletes to determine top 3.");
        }

    }


}
