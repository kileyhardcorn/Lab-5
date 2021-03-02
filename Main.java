/*
Lab 5
Partners: Kiley Hardcorn and Alec Rezelj
Date: 3/2/21
*/

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    Student student1 = new Student();
    student1.name = "Arnold Spielberg";
    student1.gpa = 4.0;
    student1.major = "Electrical Engineering";
    student1.print();

    Student student2 = new Student();
    student2.name = "Kiley Hardcorn";
    student2.gpa = 4.3;
    student2.major = "Information Systems";
    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();

    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double sum = 0;

    for (double num : gpas){
      sum+=num;
    }

    System.out.println("The average GPA is " + sum / gpas.size());
  }
}