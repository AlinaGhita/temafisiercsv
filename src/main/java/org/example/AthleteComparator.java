package org.example;

import java.util.Comparator;

public class AthleteComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete a1, Athlete a2) {
        return Integer.compare(a1.calculateFinalTime(), a2.calculateFinalTime());
    }
}
