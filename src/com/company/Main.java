package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /////////////////////////////////////// Task A ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(1));
        studentsList.add(new Student(2));
        studentsList.add(new Student(3));
        studentsList.add(new Student(4));
        studentsList.add(new Student(5));
        studentsList.add(new Student(6));
        studentsList.add(new Student(7));
        studentsList.add(new Student(8));
        studentsList.add(new Student(9));
        studentsList.add(new Student(10));
        studentsList.add(new Student(11));
        studentsList.add(new Student(12));
        studentsList.add(new Student(13));
        studentsList.add(new Student(14));
        studentsList.add(new Student(15));

        List<String> nameStudents = studentsList.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(nameStudents);

        List<String> nameByAgeStudents =
                studentsList.stream().filter(x -> x.getAge() > 20).map(x -> x.getName()).collect(Collectors.toList());
        System.out.println("Возраст старше 20 лет: \n " + nameByAgeStudents);

        studentsList.stream().forEach(x-> System.out.println("ID: " + x.getId() + " Средняя оценка: " + x.getAverRat()));

        List<String> nameFerstLetterList = studentsList.stream()
                .map(x -> x.getName().charAt(0) +""+ x.getName().length())
                .collect(Collectors.toList());
        System.out.println(nameFerstLetterList);


        ////////////////////////////////////////////////// Task B |||||||||||||||||||||||||||||||||||||||||||||||||||||||


        TaskBThread thread1 = new TaskBThread("Java");
        TaskBThread thread2 = new TaskBThread("Python");
        TaskBThread thread3 = new TaskBThread("Go");
        TaskBThread thread4 = new TaskBThread("JavaScript");
        TaskBThread thread5 = new TaskBThread("PHP");

        try {
            thread1.start();
            thread1.join();

            thread2.start();
            thread2.join();

            thread3.start();
            thread3.join();

            thread4.start();
            thread4.join();

            thread5.start();
            thread5.join();
        }catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }




    }
}
