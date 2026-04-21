package br.com.nerdstore.domain;

public class Customer {
    private String name;
    private int age;
    private char gender;

    public Customer() {
    }

    public void printInfo() {
        System.out.printf("Nome: %s%nIdade: %d%nGênero: %c%n", this.name, this.age, this.gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
