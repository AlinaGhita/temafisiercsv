package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testCSVName() {
        String csvFile = "table.csv";

        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(11, "Umar Jorgson", "SK", "30:27", new String[]{"xxxox", "xxxxx", "xxoxo"}));
        athletes.add(new Athlete(1, "Jimmy Smiles", "UK", "29:15", new String[]{"xxoox", "xooxo", "xxxxo"}));
        athletes.add(new Athlete(27, "Piotr Smitzer", "CZ", "30:10", new String[]{"xxxxx", "xxxxx", "xxxxx"}));

        assertEquals(3, athletes.size());
        assertEquals("Umar Jorgson", athletes.get(0).athleteName);
        assertEquals("Jimmy Smiles", athletes.get(1).athleteName);
        assertEquals("Piotr Smitzer", athletes.get(2).athleteName);
    }


    @Test
    public void testCSVCountry() {
        String csvFile = "table.csv";

        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(11, "Umar Jorgson", "SK", "30:27", new String[]{"xxxox", "xxxxx", "xxoxo"}));
        athletes.add(new Athlete(1, "Jimmy Smiles", "UK", "29:15", new String[]{"xxoox", "xooxo", "xxxxo"}));
        athletes.add(new Athlete(27, "Piotr Smitzer", "CZ", "30:10", new String[]{"xxxxx", "xxxxx", "xxxxx"}));

        assertEquals(3, athletes.size());
        assertEquals("SK", athletes.get(0).countryCode);
        assertEquals("UK", athletes.get(1).countryCode);
        assertEquals("CZ", athletes.get(2).countryCode);
    }

}
