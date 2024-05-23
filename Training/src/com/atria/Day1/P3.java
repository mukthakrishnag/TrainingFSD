package com.atria.Day1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, USN, address, and phone:");
        String name = sc.nextLine();
        String usn = sc.nextLine();
        String address = sc.nextLine();
        long phone = sc.nextLong();
        sc.close();

        System.out.printf("The student details are:\nName: %s\nUSN: %s\nAddress: %s\nPhone: %d\n", name, usn, address, phone);
    }
}
