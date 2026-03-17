package model;

import validateData.GetData;

import java.util.Scanner;

public class Patient {
    private static int currentId = 1;
    private int id;
    private String name;
    private String disease;
    private int age;

    public Patient() {
    }

    public Patient (int id, String name, String disease, int age) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String name) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputData(Scanner scanner){
        this.id = currentId++;
        this.name = GetData.getString(scanner, "Nhập tên bệnh nhân: ");
        this.disease = GetData.getString(scanner, "Nhập tên bệnh: ");
        this.age = GetData.getInteger(scanner, "Nhập tuổi: ");
    }

    public void displayData(){
        System.out.printf("| ID: %-5d | Name: %-20s | Bệnh: %-20s | Tuổi: %-5d|\n", id, name, disease, age);
    }
}
