package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
    public static void main(String[] args) {
//        Протестируем работу регулярных выражений

        String text = "Петр Пират Енот Иволга Пенициллинотерапия";
        Pattern pattern = Pattern.compile("П.+а", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Совпадения с шаблоном: ");
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
