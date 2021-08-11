package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
//this is just a priority Queue test
public class Main {

    public static void main(String[] args) {

        PriorityQueue<String> student = new PriorityQueue<>();

        student.add("John");
        student.add("John");
        student.add("David");
        student.add("Peter");
        student.add("Rascal");

        System.out.println(student);

    }
}
