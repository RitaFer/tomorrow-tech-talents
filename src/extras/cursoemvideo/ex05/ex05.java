package extras.cursoemvideo.ex05;

public class ex05 {
    public static void main(String[] args) {
        Account joaquim = new Account();
        joaquim.openAccount('C', "Joaquim da Silva Neto");
        System.out.println(joaquim.getAccountBalance());
        joaquim.withdrawMoney(50);
        System.out.println(joaquim.getAccountBalance());
        joaquim.depositMoney(2000);
        System.out.println(joaquim.getAccountBalance());
        joaquim.closeAccount();
        System.out.println("\n-----------------------------\nNome: " + joaquim.getAccountOwner() + "\nSaldo: " + joaquim.getAccountBalance() + "\nConta aberta? " + joaquim.isAccountStatus());
    }
}
