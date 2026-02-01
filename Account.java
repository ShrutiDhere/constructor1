// program 6:- Write a class Account with Account_no and balance.

package constructor;             

public class Account {
   Account(){
	   System.out.println("Account Deatil :-");
   }
   public void Detail(int Acc_no,int balance) {
	   System.out.println("Account Number = " + Acc_no + " & Balance = " + balance);
   }
   

   
   public static void main(String[]args) {
	   Account A = new Account();
	   A.Detail(2,50000);
   }
}
