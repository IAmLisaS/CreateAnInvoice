// Lisa Sinn
// Intro to Java - CSCI 1146 
// CSCI 1146-241
// Unit 6, Exercise #14b
// CreatePurchase.java

import java.util.Scanner;

class CreatePurchase
{
    public static void main(String args[])
    {
        Purchase purchase=new Purchase();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the details >> ");
        while(true)
        {
            System.out.print("Enter invoice number [between 1000 and 8000]: ");
            int i=s.nextInt();
            if(i>=1000 && i<=8000){purchase.setInvoiceNumber(i);break;}
            else System.out.println("Wrong entry, enter again");
        }
        while(true)
        {
            System.out.print("Enter amount of sale [should be non-negative]: ");
            int i=s.nextInt();
            if(i>=0){purchase.setAmountOfSales(i);break;}
            else System.out.println("Wrong entry, enter again");
        }
        purchase.display();
    }
}