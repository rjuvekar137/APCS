package com.richa;

public class AllStudents {

    int studentCounter = 0;
    final int MAX_STUDENTS = 15;
    StudentInfo[] studentInfo = null;

    public AllStudents() {
        studentInfo = new StudentInfo[MAX_STUDENTS];
    }

    public void addStudent(String name, int gradYear, double finalAvg) {

       if (studentCounter >= MAX_STUDENTS) {
           System.out.println("You have already input the maximum number of students allowed. ");
           return;
       }

       StudentInfo newStudent = new StudentInfo(name, gradYear, finalAvg);
       studentInfo[studentCounter] = newStudent;
       studentCounter++;
    }

    private void selectionSortByName() {

        int n = studentCounter;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (studentInfo[j].getName().compareToIgnoreCase(studentInfo[min_idx].getName()) < 0) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element
            StudentInfo temp = studentInfo[min_idx];
            studentInfo[min_idx] = studentInfo[i];
            studentInfo[i] = temp;
        }
    }

    private void selectionSortByFinalAverage() {

        int n = studentCounter;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the maximum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (studentInfo[j].getFinalAvg() < studentInfo[min_idx].getFinalAvg()) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element
            StudentInfo temp = studentInfo[min_idx];
            studentInfo[min_idx] = studentInfo[i];
            studentInfo[i] = temp;
        }
    }

    public void printAllStudentsByName() {

        if (studentCounter == 0) {
            System.out.println("There is currently no student info available. ");
            return;
        }

        selectionSortByName();

        for (int i = 0; i < studentCounter; i++) {
            StudentInfo student = studentInfo[i];
            System.out.format("%-25s %-6d %.0f %n", student.getName(), student.getGradYear(), student.getFinalAvg());
        }

    }

    public void printAllStudentsByFinalAverage() {

        if (studentCounter == 0) {
            System.out.println("There is currently no student info available. ");
            return;
        }

        selectionSortByFinalAverage();

        // print backwards to show descending final averages
        for (int i = studentCounter-1; i >= 0; i--) {
            StudentInfo student = studentInfo[i];
            System.out.format("%-25s %-6d %.0f %n", student.getName(), student.getGradYear(), student.getFinalAvg());
        }
    }

}
