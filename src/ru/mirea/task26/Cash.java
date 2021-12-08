package ru.mirea.task26;

public class Cash implements MoneyStrategy {
    @Override
    public void paymentKind() {
        System.out.println("Оплата наличными!");
    }
}
