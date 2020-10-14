package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("hihi", 13, "CG");
        Student s2 = new Student("assa", 34, "SG");
        Student s3 = new Student("blabla", 53, "GD");
        Student s4 = new Student("leuleu", 20, "QD");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for(Student student : list){
            System.out.println(student.toString());
        }
    }
}
