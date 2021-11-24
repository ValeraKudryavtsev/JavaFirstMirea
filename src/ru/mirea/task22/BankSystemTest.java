package ru.mirea.task22;

enum BankOperation {
    CREDIT, DEPOSIT, HYPOTHEC, LOAN, NEWCARD;
}

public class BankSystemTest {
    public class Credit extends Bank{}
    public class Deposit extends Bank{}
    public class Hypothec extends Bank{}
    public class Loan extends Bank{}
    public class NewCard extends Bank{}

    public Bank newOperation(BankOperation operation) {
        Bank bank = null;
        switch (operation) {
            case CREDIT:
                bank = new Credit();
                break;
            case DEPOSIT:
                bank = new Deposit();
                break;
            case HYPOTHEC:
                bank = new Hypothec();
                break;
            case LOAN:
                bank = new Loan();
                break;
            case NEWCARD:
                bank = new NewCard();
                break;
            default:
                break;
        }
        bank.fillInTheData();
        bank.processingData();
        bank.operationApproval();

        System.out.println("Операция " + operation + " одобрена!");

        return bank;
    }

    public static void main(String[] args) {
        BankOperation operation = BankOperation.CREDIT;
        BankSystemTest bst = new BankSystemTest();
        bst.newOperation(operation);
    }
}
