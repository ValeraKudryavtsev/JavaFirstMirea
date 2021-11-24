package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void test01() {
        List list = new ArrayList();
        list.add("Hello");
        String text = list.get(0) + ", world!";
        System.out.println(text + "\n");
    }

    public static void test02() {
        try {
            List list = new ArrayList();
            list.add("Hello!");
            list.add(123);
            for (Object str : list) {
                System.out.println((String) str);
            }
        } catch (Exception e) {
            System.out.println("Вот тут произошла ошибка, связанная с приведением типов данных: " + e + "\n");
        }
    }

    public static void test03() {
        List<String> list = new ArrayList<>();
        list.add("Hello!");
//        list.add(123);
//        Теперь компилятор не даст скомпилировать класс, пока мы не удалим добавление 123 в список,
//        т.к. это Integer. Он нам так и скажет.
        for (Object str : list) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        test01();
        test02();
        test03();
    }

//    В моем проекте можно использовать дженерики для упрощения хранения данных об операциях:
//    1) например, данные о кредитах будут хранится в списках типа String;
//    2) списки клиентов;
//    3) суммы на счетах клиетов;
//    4) прочие операции, которые были использованы в предыдущих заданиях, касаемо проекта.

}
