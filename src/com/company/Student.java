package com.company;

import com.company.randomParametr.RandomString;

import java.util.Random;

public class Student {
    private int id;
    private String name;
    private Integer averRat;
    private int age;
    private boolean gender;

    public Student(int id) {
        Random ran = new Random();
        this.id = id;
        this.gender = ran.nextBoolean();
        if(this.gender){this.name = RandomString.getName_Male();
        }else this.name = RandomString.getName_Woman();
        this.averRat = ran.nextInt(101);
        this.age = ran.nextInt(30 - 16 + 1) + 16;
    }

    public Student(int id, String name, Integer averRat, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.averRat = averRat;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAverRat() {
        return averRat;
    }

    public void setAverRat(Integer averRat) {
        this.averRat = averRat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
                "\nИндефикационный номер: %s, \n" +
                "Имя: %s,\n" +
                "Средняя оценка: %s,\n" +
                "Возраст: %s,\n" +
                "Пол: %s.\n",
                id, name, averRat, age,
                gender? "Мужчина": "Женщина");
    }
}
