import java.util.Scanner;  
    public class atm  
    {     
        public static void main(String args[] )  
        {  
            //declare and initialize balance, withdraw, and deposit  
            int balance = 10000, withdraw, deposit,transfer;  
              
            Scanner sc = new Scanner(System.in);  
              
            while(true)  
            {  
                System.out.println("Automated Teller Machine");  
                System.out.println("Choose 1 for Withdraw");  
                System.out.println("Choose 2 for Deposit");  
                System.out.println("Choose 3 for Check Balance");  
                System.out.println("Choose 4 for Transfer");
                System.out.println("Choose 5 for EXIT");   
                System.out.print("Choose the operation you want to perform:");  
                    
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:  
            System.out.print("Enter money to be withdrawn:");  
            withdraw = sc.nextInt();  
                          
            //check whether the balance is greater than or equal to the withdrawal amount  
            if(balance >= withdraw)  
            {  
                //remove the withdrawl amount from the total balance  
                balance = balance - withdraw;  
                System.out.println("Please collect your money");  
            }  
            else  
            {  
                //show custom error message   
                System.out.println("Insufficient Balance");  
            }  
            System.out.println("");  
            break;  
       
                    case 2:  
                    System.out.print("Enter money to be deposited:");   
                    deposit = sc.nextInt();  
                          
            //add the deposit amount to the total balanace  
            balance = balance + deposit;  
            System.out.println("Your Money has been successfully deposited");  
            System.out.println("");  
            break;  
       
                    case 3:  
            //displaying the total balance of the user  
            System.out.println("Balance : "+balance);  
            System.out.println("");  
            break;  
            
            //Transffering the Money
                    case 4:
                    System.out.println("Enter the amount you want to transfered");
                    transfer= sc.nextInt();
            balance= balance -transfer; 
            System.out.println("Your money has been successfully transferred");
            System.out.println("Remaining balance is "+balance);
            System.out.println("");
            break;       
       
                    case 5:  
            //exit from the menu  
            System.exit(0);  
                }  
            }  
        }  
    }  

