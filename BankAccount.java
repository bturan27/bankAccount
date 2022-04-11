public class BankAccount {

    private double checkingBal;
    private double savingsBal;

    //need to track total amount of accounts
    static int numOfAccounts;

    //need to track all moneys stored in every account
    static double totalMonies;

    public BankAccount () {
        // track all accounts as they are created
        
    }
    public void  transaction(String type, String account, int amt) {
        if(type =="deposit"){
            if(account == "checking" ) {
                this.checkingBal += amt;
                System.out.println("you have made a deposit to  your checking account in the amount of" + amt + 
                ". Your current checking balance is now"+ this.checkingBal);
            }
            else if(account == "savings") {
                this.savingsBal += amt;
                System.out.println("You have made a deposit to your saving account in the amount of" + amt
                + "your current saving balance is now"+ this.savingsBal);
            }
            else{
                System.out.println("Must enter either checking or savings to make a deposit!");
            }
        }
        else if (type =="withdrawal"){
            if(account == "checking" ) {
                if(this.checkingBal < amt ){
                    System.out.println("ah ah ah!!! you dont get the money that you dont have");
                    return;
                }
                System.out.println("you have taken a withdraw to  your checking account in the amount of" + amt + 
                ". Your current checking balance is now"+ this.checkingBal);
            }
            else if(account == "savings") {
                if(this.savingsBal < amt){;
                    System.out.println("ah ah ah!!!You have taken a withdraw to your saving account in the amount of" + amt +"your current saving balance is now"+ this.savingsBal);
                    return;
                }
                this.savingsBal -= amt;
                System.out.println("ah ah ah!!!You have taken  moneys from  your saving account in the amount of" + amt +"your current saving balance is now"+ this.savingsBal);
            }
            else{
                System.out.println("Must enter either checking or savings to make a taking monies out!");
            }
        }
        else {
            System.out.println("must enter deposit or withdraw in order to complete the transaction");
        }
    }

    ///////method to deposit in etiher the checking or saving account
    public void  deposit(String account, int amt) {
        if(account == "checking" ) {
            this.checkingBal += amt;
            System.out.println("you have made a depoit to  your checking account in the amount of" + amt + 
            ". Your current checking balance is not"+ this.checkingBal);
        }
        else if(account == "savings") {
            this.savingsBal += amt;
            System.out.println("You have made a deposit to your saving account in the amount of" + amt
            + "your current saving balance is now"+ this.savingsBal);

        }
        else{
            System.out.println("Must enter either checking or savings to make a deposit!");
        }
    }
    public void  withdrawal(String account, int amt) {
        if(account == "checking" ) {
            this.checkingBal -= amt;
            System.out.println("you have taken a withdraw to  your checking account in the amount of" + amt + 
            ". Your current checking balance is not"+ this.checkingBal);
        }
        else if(account == "savings") {
            this.savingsBal -= amt;
            System.out.println("You have taken a withdraw to your saving account in the amount of" + amt
            + "your current saving balance is now"+ this.savingsBal);

        }
        else{
            System.out.println("Must enter either checking or savings to make a taking monies out!");
        }
    }

    ///  method to see both checking and saving balances
    public void allBal(){
        double all = this.checkingBal+this.savingsBal;
        System.out.println("total balance from Checking and Saving: " +all);
    }

///////////////SETTER FOR THE CHECKING BALANCE
    public void setCheckingBal(double amt) {
        this.checkingBal = amt;
    }
//////////////SETTER FOR THE SAVING BALANCE
    public void setSavingsBal(double amt) {
        this.savingsBal = amt;
    }
    //getter for the checking balance
    public double getCheckingBal() {
        System.out.println("Checking account balance:" + this.checkingBal);
        return this.checkingBal;
    }
    //getter for the savings balance
    public double getSavingsBal() {
        System.out.println("Saving account balance:" + this.savingsBal);
        return this.savingsBal;
    }


}