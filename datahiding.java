class Account
{
    private double balance;
    public double getBalance(double balance)
    {
        boolean res=validate("Akanksha","AK2012");
        if(res==true)
        {
            this.balance=this.balance-balance;
            return balance;
        }
        else{
            System.out.println("invalid username/password....");
            return 0.0;
        }
    }

    public void setBalance(double balance)
    {
        boolean res=validate("Akanksha","AK2012");
        if(res==true)
        {
            this.balance=this.balance+balance;
           // System.out.println("credited to the account");
        }
    }

    private boolean validate(String username,String password)
    {
        return username.equalsIgnoreCase("Akanksha")&&password.equals("AK2012");
    }
}

public class datahiding {
    public static void main(String[] args) {
        Account acc=new Account();

        acc.setBalance(1000.0);
        double balance =acc.getBalance(500.0);
        System.out.println("credited to the account...");
        System.out.println("withdrawing:: "+balance+" amount...");
    }
}
/*Here is given the 6 usage of java <this> keyword.
                                    
this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.*/