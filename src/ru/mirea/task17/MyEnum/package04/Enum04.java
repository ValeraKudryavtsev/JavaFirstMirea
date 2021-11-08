package ru.mirea.task17.MyEnum.package04;

enum Bank {
    Credit, Deposit, Hypothec, Loan, NewCard;
}

public class Enum04 {
    public static void main(String[] args) {
        Bank b1, b2, b3;

        System.out.println("Получить все константы и их порядковые значения:");
        for(Bank b : Bank.values()) {
            System.out.println(b + " " + b.ordinal());
        }

        b1 = Bank.Credit;
        b2 = Bank.Loan;
        b3 = Bank.Credit;

        System.out.println("\nПродемонстрировать применение метода compareTo():");
        if (b1.compareTo(b2) < 0)
            System.out.println(b1 + " предшествует " + b2);
        if (b1.compareTo(b2) > 0)
            System.out.println(b2 + " предшествует " + b1);
        if (b1.compareTo(b3) == 0)
            System.out.println(b1 + " равно " + b3);

        System.out.println("\nПродемонстрировать применение метода equals():");
        if (b1.equals(b2))
            System.out.println("Ошибка!");
        if (b1.equals(b3))
            System.out.println(b1 + " равно " + b3);

        System.out.println("\nСравнить на равенство:");
        if (b1 == b3)
            System.out.println(b1 + " == " + b3);
    }
}
