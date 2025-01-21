package org.example;
import java.io.*;
import java.util.*;

public class Athlete {
    int athleteNumber;
    String athleteName;
    String countryCode;
    String skiTime;
    String[] shootingRanges;
    int totalPenaltySeconds;
    int finalTimeInSeconds;

    public Athlete(int athleteNumber, String athleteName, String countryCode, String skiTime, String[] shootingRanges) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTime = skiTime;
        this.shootingRanges = shootingRanges;
        this.totalPenaltySeconds = calculatePenalty();
        this.finalTimeInSeconds = calculateFinalTime();
    }

    private int calculatePenalty() {
        int penalty = 0;
        for (String range : shootingRanges) {
            for (char shot : range.toCharArray()) {
                if (shot == 'o') {
                    penalty += 10;
                }
            }
        }
        return penalty;
    }

    int calculateFinalTime() {
        String[] time = skiTime.split(":");
        int minutes = Integer.parseInt(time[0]);
        int seconds = Integer.parseInt(time[1]);
        return (minutes * 60) + seconds + totalPenaltySeconds;
    }

    public String getFormattedFinalTime() {
        int minutes = finalTimeInSeconds / 60;
        int seconds = finalTimeInSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        return athleteName + " " + getFormattedFinalTime() + " (" + skiTime + " + " + totalPenaltySeconds + ")";
    }
}

