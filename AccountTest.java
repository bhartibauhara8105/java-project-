class Account
{
String name;
protected double balance;
Account(String str,double amt)
{
name=str;
balance=amt;
}
String getName()
{
return name;
}
double getBalance()
{
return balance;
}
 void deposit(double amt)
 {
 balance+=amt;
 System.out.println("Depositing: "+amt);
 }
 void withdrow(double amt)
 {
 balance-=amt;
 System.out.println("withdrowing :"+amt);
 }
}
class SavingAccount extends Account
{
double interestRate;
SavingAccount(String str,double amt,double rate)
{
super(str,amt);
interestRate=rate;
}
}
class CheckingAccount extends Account
{
double overDraft;
CheckingAccount(String str,double amt)
{
super(str,amt);
}
CheckingAccount(String str,double amt,double draft)
{
super(str,amt);
overDraft=draft;
}
void withdrow(double amt)
{
System.out.println("OverDraft amount:"+overDraft);
if(amt<=balance)
{
balance-=amt;
System.out.println("withdrowing :"+amt);
}
else if((amt > balance) && (amt >(balance+overDraft)))
{
System.out.println("sorry! you cannot withdrow");
}
else
{
double result=amt-balance;
overDraft -=result;
balance=0;
System.out.println("Withdrowing:"+amt);
System.out.println("Current OverDraft Amount:"+overDraft);
}
}
}
class AccountTest
{
public static void main(String [] args)
{
SavingAccount s=new SavingAccount("john",500,4);
System.out.println("\n Saving Account Details");
System.out.println("-------------------------");
System.out.println(""+s.getName()+"has an initial balance of:"+s.getBalance());
s.deposit(200);
s.withdrow(200);
System.out.println(""+s.getName()+"at the end of transaction has a balance of: "+s.getBalance());
System.out.println("\n Checking Account Details");
System.out.println("---------------------------");
CheckingAccount c=new CheckingAccount("abhishek",200,200);
System.out.println(""+c.getName()+"has an initial balance of:"+c.getBalance());
c.deposit(200);
c.withdrow(500);
System.out.println(""+c.getName()+"at the end of transaction has a balance of: "+c.getBalance());
}
}