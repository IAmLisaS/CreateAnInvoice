// Lisa Sinn
// Intro to Java - CSCI 1146 
// CSCI 1146-241
// Unit 6, Exercise #14a
// Purchase.java

class Purchase
{
    int invoiceNumber;
    int amountOfSales;
    double amountOfSalesTax;
    static double rate = 7.5;
    public void setInvoiceNumber(int i)
    {
        invoiceNumber=i;
    }
    public void setAmountOfSales(int a)
    {
        amountOfSales = a;
        amountOfSalesTax = (7.5 * a)/100;
    }
    public void display()
    {
        System.out.println("The details are >> ");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Amount of Sales: " + amountOfSales);
        System.out.println("Amount of sales tax: " + amountOfSalesTax);
    }
}