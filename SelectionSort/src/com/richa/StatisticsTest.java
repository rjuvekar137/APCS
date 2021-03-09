package com.richa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : rjuvekar
 * @created : 3/8/21, Monday
 **/
class StatisticsTest {

    Statistics statistics = new Statistics();

    @BeforeEach
    void setUp() {
        statistics.addQuarterAverages(69.2, 88.2, 78.3, 99.5);
        statistics.addQuarterAverages(78.2, 87.9, 88.7, 93.3);
        statistics.addQuarterAverages(89.5, 78.2, 72.3, 79.5);
        statistics.addQuarterAverages(79.4, 98.5, 76.8, 89.6);
    }

    @Test
    void printStatistics() {
        statistics.printStatistics();
    }
}