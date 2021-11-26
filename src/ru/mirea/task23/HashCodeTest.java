package ru.mirea.task23;

public class HashCodeTest {
//    В случае с банкоской системой функцию hashCode
//    применить очень легко:
//    человек не может быть клиентом банка, если не откроет в нем счет,
//    номер счета всегда индивидуален и повторяться не может

//    Приведу простой пример для наглядности

    public static void main(String[] args) {
        BankCustomer c1 = new BankCustomer("David", 23, 'M', 4321);
        BankCustomer c2 = new BankCustomer("Jack", 41, 'M', 3654);

        System.out.println("Тестирование метода equals: ");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        System.out.println("Попытка сравнить объект с самим собой: ");
        System.out.println(c1.equals(c1));
        System.out.println(c2.equals(c2));
        System.out.println("Тестирование работы метода hashCode: ");
        System.out.println(c1.hashCode() == c2.hashCode());
        System.out.println("Тестирование при одинаковых номерах банковских счетов: ");
//        намеренно сделаем ошибку для наглядности
        c2.setAccountNumber(4321);
        System.out.println(c1.hashCode() == c2.hashCode());
    }
}
