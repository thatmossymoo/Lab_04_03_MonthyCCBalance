//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
    double currentBalance = 5000.00;
    double interestRate = 0.17;
    double firstInterest = 0.00;
    double secondInterest = 0.00;
    firstInterest = currentBalance * interestRate;
    secondInterest = (currentBalance + firstInterest)*interestRate;
    System.out.println("Your interest after 1 month is: " + firstInterest);
    System.out.println("Your interest after 2 months is: " + secondInterest);
    }
}