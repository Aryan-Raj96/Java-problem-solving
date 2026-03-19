class BankAccount {
    private int accountnumber;
    private String accountholdername;
    private Double balance;

    void setaccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    void setaccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }

    void setbalance(Double balance) {
        this.balance = balance;
    }

    int getaccountnumber() {
        return accountnumber;
    }

    String getaccountholdername() {
        return accountholdername;
    }

    Double getbalance() {
        return balance;
    }
}

public class seterandgeter {
    public static void main(String[] args) {
        BankAccount Person1 = new BankAccount();
        BankAccount Person2 = new BankAccount();
        BankAccount person3 = new BankAccount();
        BankAccount person4 = new BankAccount();

        Person1.setaccountnumber(1542454248);
        Person1.setaccountholdername("ram");
        Person1.setbalance(1005040.0);

        System.out.println(Person1.getaccountholdername());
        System.out.println(Person1.getaccountnumber());
        System.out.println(Person1.getbalance());

        Person2.setaccountnumber(1585152415);
        Person2.setaccountholdername("Shardha kahapra");
        Person2.setbalance(581814785.0);

        System.out.println("person 2 accountholder name" + Person2.getaccountholdername());
        System.out.println("Person2 accountnumber" + Person2.getaccountnumber());
        System.out.println("Person 2 bank balance" + 544549254.0);

        person3.setaccountholdername("aman dhatterwal");
        System.out.println("person3 name " + person3.getaccountholdername());

    }
}