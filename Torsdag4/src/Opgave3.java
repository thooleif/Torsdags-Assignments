void main(){

    BankAccount b1 = new BankAccount("Thor", 10000);
    b1.getBalance();
    b1.deposit(2300);
    b1.withdraw(800);
    b1.withdraw(15000);
    b1.getBalance();
    b1.printTransactionHistory();

}

class Transaction{
    String type;
    double amount;

    Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;

    }

    public String toString(){
        return type + ": " + amount + " kr";
    }
}

class BankAccount{
    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    BankAccount(String owner, double startBalance){
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
        transactions.add(new Transaction("Deposit", startBalance));
        System.out.println();
    }

    void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("You deposited: " + amount + "kr to your account.");
            System.out.println("You now have: " + balance + " kr");
            System.out.println();
        }
    }

    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("You withdrew: " + amount + "kr from your account.");
            System.out.println("You now have: " + balance + " kr");
            System.out.println();
        }else if(amount > balance){
            System.out.println("Not enough money in account");
        }
    }

    void printTransactionHistory(){
        System.out.println("--- Transaction history for " + owner + " ---");
        for(Transaction t : transactions){
            System.out.println(t);
        }
    }

    void getBalance(){
        System.out.println("You have: " + balance + " kr");
        System.out.println();
    }
}