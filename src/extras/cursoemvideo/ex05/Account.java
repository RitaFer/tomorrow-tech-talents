package extras.cursoemvideo.ex05;

public class Account {
    public int accountNumber;
    private double accountBalance;
    protected char type;
    private String accountOwner;
    private boolean accountStatus;

    public Account(){
        this.accountBalance = 0;
        this.accountStatus = false;
    }

    public void openAccount(char t, String name, int n){
        if(t == 'C'){
            this.accountBalance = 50;
        } else if(t == 'P'){
            this.accountBalance = 150;
        } else {
            System.out.println("Não foi possível abrir a conta, opção inválida.");
            System.exit(0);
        }
        this.accountOwner = name;
        this.accountStatus = true;
        this.type = t;
        this.accountNumber = n;
    }

    public void closeAccount(){
        if(accountBalance >= 0){
            this.withdrawMoney(accountBalance);
            this.accountStatus = false;
        } else {
            System.out.println("Não foi possível fecher essa conta, pois constam débitos, favor fazer um depósito e tentar novamente.");
        }
    }

    public void depositMoney(double deposit){
        if(accountStatus){
            this.accountBalance += deposit;
        } else {
            System.out.println("Não foi possível depositar o valor, essa conta não está aberta.");
        }
    }

    public void withdrawMoney(double withdrawValue){
        if(accountStatus){
            if(accountBalance < withdrawValue){
                System.out.println("Não foi possível sacar o valor solicitado, essa conta não possui saldo suficiente.");
            } else {
                accountBalance -= withdrawValue;
            }
        } else {
            System.out.println("Não foi possível sacar o valor solicitado, essa conta não existe.");
        }
    }

    public void monthlyFee(){
        if(this.type == 'C'){
            this.accountBalance -= 12;
        }else{
            this.accountBalance -= 20;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public char getType() {
        return type;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }
}
