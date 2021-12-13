package ru.mirea.task30;

import org.junit.Test;

//тестирование прошло успешно

public class BankCustomerTest {

    @Test
    public void testToString() {
        //создаем тестовые данные
        BankCustomer c1 = new BankCustomer("David", 23, 'M', 4321);
        BankCustomer c2 = new BankCustomer("Jack", 41, 'M', 3654);

        //проводим тестирование
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

    @Test
    public void testEquals() {
        //создаем тестовые данные
        BankCustomer c1 = new BankCustomer("David", 23, 'M', 4321);
        BankCustomer c2 = new BankCustomer("Jack", 41, 'M', 3654);

        //проводим тестирование метода equals
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
    }

    @Test
    public void testHashCode() {
        //создаем тестовые данные
        BankCustomer c1 = new BankCustomer("David", 23, 'M', 4321);
        BankCustomer c2 = new BankCustomer("Jack", 41, 'M', 3654);

        //проводим тестирование работы метода hashCode
        System.out.println(c1.hashCode() == c2.hashCode());
        System.out.println("Тестирование при одинаковых номерах банковских счетов: ");
        //намеренно сделаем ошибку для наглядности
        c2.setAccountNumber(4321);
        System.out.println(c1.hashCode() == c2.hashCode());
    }
}