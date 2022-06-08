package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {
        BankAccount fAccount= new BankAccount();
        fAccount.setInfo("Yasin", 123432009);
        System.out.println(fAccount);

        fAccount.deposit(1000);
        fAccount.checkBalance();

        fAccount.withdraw(700);
        fAccount.checkBalance();

        fAccount.deposit(-1000);

        fAccount.checkBalance();

        fAccount.withdraw(5000);

        fAccount.checkBalance();


        System.out.println("-------------------------------------------");

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount();

        account1.setInfo("Sebastian", 789456123);

        account2.setInfo("Umran", 456789123);


        account1.deposit(5000);
        account2.deposit(10000);

        System.out.println(account1);
        System.out.println(account2);


        account1.withdraw(1000);


        System.out.println(account1);
        System.out.println(account2);



    }
}
