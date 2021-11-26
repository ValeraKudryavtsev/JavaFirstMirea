package ru.mirea.task23;

import java.util.Objects;

public class BankCustomer {
    private String name;
    private int age;
    private char sex; //пол (M/F)
//    ...
    private int accountNumber;

    public BankCustomer(String name, int age, char sex, int accountNumber) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.accountNumber = accountNumber;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankCustomer that = (BankCustomer) o;
        return age == that.age && sex == that.sex && accountNumber == that.accountNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
