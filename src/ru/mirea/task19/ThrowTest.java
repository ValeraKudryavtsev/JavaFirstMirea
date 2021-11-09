package ru.mirea.task19;

public class ThrowTest {
    // сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("B теле метода procA()");
            throw new NullPointerException("ДЕМОНСТАЦИЯ THROW");
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

    public static void main(String[] args) {
        System.out.println("Проверка работы исключений с throw.");
        System.out.println("Также обратите внимание на тестирование вложенных try.\n");

        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено " + e);
        } finally {
            System.out.println("Тест finally при наличии catch\n");
        }
        procB();

        System.out.println("\nПроверка завершена. Конец работы.");
    }
}
