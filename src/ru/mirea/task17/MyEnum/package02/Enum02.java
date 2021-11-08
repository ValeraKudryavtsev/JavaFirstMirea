package ru.mirea.task17.MyEnum.package02;

enum Bank {
    Credit, Deposit, Hypothec, Loan, NewCard;
}

public class Enum02 {
    public static void main(String[] args) {
        Bank b;

        //Для перечисления используется функция values() и массив значений перечислимого типа
        System.out.println("Константы пречислимого типа Bank: ");
        Bank bb[] = Bank.values();
        //Пробежимся по массиву для вывода значений в одну строку, разделяя пробелом
        for(Bank tmp : bb)
            System.out.println(tmp + " ");

        //Для перечисления используется функция values()
        //Массив значений перечислимого типа не используется
        System.out.println("\nКонстанты пречислимого типа Bank: ");
        //Пробежимся по массиву для вывода значений, каждое с новой строки
        for(Bank tmp : Bank.values())
            System.out.println(tmp);
        System.out.println();

        //Метод valueOf() возвращает значение перечислимого типа, связанное с именем константы того же типа,
        //передаваемым этому методу в виде символьной строки.
        b = Bank.valueOf("Deposit");
        System.out.println("b = " + b);
    }
}
