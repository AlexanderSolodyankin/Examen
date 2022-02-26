package com.company;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfMonth());


    }
}
