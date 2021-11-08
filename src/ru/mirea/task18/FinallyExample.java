package ru.mirea.task18;

public class FinallyExample {
    // сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("B теле метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }

    // возвратить управление из блока оператора try
    static void procB() {
        try {
            System.out.println("B теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB()");
        }
    }

    // выполнить блок try, как обычно
    static void procC() {
        try {
            System.out.println("B теле метода procC()");
        } finally {
            System.out.println("Блок оператора finally в методе procC()");
        }
    }

    public static void main(String[] args) {
        System.out.println("Проверка работы исключений с finally.\n");

        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено " + e);
        } finally {
            System.out.println("Тест finally при наличии catch\n");
        }
        procB();
        System.out.println();
        procC();

        System.out.println("\nПроверка завершена. Конец работы.");
    }
}
