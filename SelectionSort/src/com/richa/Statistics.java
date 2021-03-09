package com.richa;

public class Statistics {

    double[] quarterAverages = null;

    public Statistics () {
    }

    public void addQuarterAverages(double q1Avg, double q2Avg, double q3Avg, double q4Avg) {
        if (quarterAverages == null) {
            quarterAverages = new double[4]; // add the provided into array
        } else {
            // add given averages to new array and copy over
            double[] newArray = new double[quarterAverages.length+4];
            for (int i=0; i<quarterAverages.length; i++) {
                newArray[i] = quarterAverages[i];
            }
            quarterAverages = newArray; // replace array
        }
        quarterAverages[quarterAverages.length-4] = q1Avg;
        quarterAverages[quarterAverages.length-3] = q2Avg;
        quarterAverages[quarterAverages.length-2] = q3Avg;
        quarterAverages[quarterAverages.length-1] = q4Avg;
    }

    public int getCount() {
        if ( quarterAverages == null ) {
            return 0;
        }
        return quarterAverages.length;
    }

    public double[] getQuarterAverages() {
        return quarterAverages;
    }

    public void setQuarterAverages(double[] quarterAverages) {
        this.quarterAverages = quarterAverages;
    }

    void printStatistics() {
        if ( quarterAverages == null ) {
            System.out.println("There are no quarter averages in the list");
        } else {
            System.out.println("Quarterly Average Statistics:");
            System.out.format("Mean:     %.2f%n",getMean());
            System.out.format("Median:   %.2f%n",getMedian());
            System.out.format("Mode:     ");
            double[] mode = getMode();
            if ( mode == null || mode.length == 0 ) {
                System.out.println("None");
            } else {
                for (int i=0; i<mode.length; i++) {
                    System.out.print(mode[i]+" ");
                }
                System.out.println();
            }
            System.out.format("Std Dev:  %.2f%n",getStandardDeviation());
        }

    }

    private double getMean() {
        if ( getCount() == 0 ) {
            return 0; // no numbers
        }

        // calculate the mean (sum/n)
        double mean = 0;
        for (int i=0; i<quarterAverages.length; i++) {
            mean += quarterAverages[i]; // add up numbers
        }
        mean = mean/quarterAverages.length; // divide by count
        return mean;
    }

    private double getMedian() {
        if ( getCount() == 0 ) {
            return 0; // no numbers
        } else if ( getCount() == 1 ) {
            return quarterAverages[0]; // only one number
        }

        // sort the numbers
        InsertionSort insertionSort = new InsertionSort(quarterAverages);
        double[] sorted = insertionSort.insertionSort();

        // calculate the median
        double median = 0;
        if (sorted.length % 2 == 1) { //odd count
            median = sorted[sorted.length/2]; // middle number
        } else {
            median = (sorted[sorted.length/2-1] + sorted[sorted.length/2])/2.0; // average of middle numbers
        }
        return median;
    }

    private double[] getMode() {
        if ( getCount() == 0 ) {
            return null; // no numbers
        } else if ( getCount() == 1 ) {
            return null; // only one number
        }

        // sort the numbers
        InsertionSort insertionSort = new InsertionSort(quarterAverages);
        double[] sorted = insertionSort.insertionSort();

        // calculate frequency of numbers
        int[] frequency = new int[sorted.length];
        for (int i=0; i< sorted.length; ) {
            frequency[i] = 1;
            for(int j=i+1; j< sorted.length; j++) {
                if (sorted[i] == sorted[j]) { // this means repeating
                    frequency[i]++;
                    frequency[j]=0;
                    continue;
                } else {
                    break; // not repeating so stop
                }
            }
            i += frequency[i];
        }

        // calculate the most frequent number count
        int max = 1;
        for ( int i=0; i<frequency.length; i++ ) {
            if (frequency[i] > max) {
                max = frequency[i];
            }
        }
        if ( max == 1 ) {
            return null; // no modes if all repeat only once
        }

        // find how many modes
        int numModes = 0;
        for ( int i=0; i<frequency.length; i++ ) {
            if (frequency[i] == max) {
                numModes++;
            }
        }

        // find and return all modes
        double[] modes = new double[numModes];
        int modeCount = 0;
        for ( int i=0; i<frequency.length; i++ ) {
            if (frequency[i] == max) {
                modes[modeCount] = sorted[i];
                modeCount++;
            }
        }
        return modes;
    }

    private double getStandardDeviation() {
        if ( getCount() == 0 ) {
            return 0; // no numbers
        }

        // calculate the standard deviation
        double stdDev = 0;
        double mean = getMean();
        for (int i=0; i<quarterAverages.length; i++) {
            stdDev += ((quarterAverages[i]-mean)*(quarterAverages[i]-mean)); // add up squares of difference from mean
        }
        stdDev = Math.sqrt(stdDev/quarterAverages.length); // divide by n then square root
        return stdDev;
    }

}
