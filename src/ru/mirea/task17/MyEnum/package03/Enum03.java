package ru.mirea.task17.MyEnum.package03;

enum Bank {
    Credit(9), Deposit(3), Hypothec(5), Loan(7), NewCard(2);

    //В переменной num хранится информация о процентах
    //либо переплаты, если речь идет, например, о кредите,
    //либо прибыли, если мы говорим о каладе.
    //В случае банковской карты указывается процент ежемесечного кэшбека.
    private int num;

    Bank(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

public class Enum03 {
    public static void main(String[] args) {
        System.out.println("Операция " + Bank.valueOf("Credit") + " в банке НеНаМели имеет процентную ставку "
                + Bank.valueOf("Credit").getNum() + "%");

        System.out.println();
        for(Bank tmp : Bank.values())
            System.out.println(tmp + " " + tmp.getNum());
    }
}
