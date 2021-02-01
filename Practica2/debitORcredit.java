import java.util.Scanner;

public class debitORcredit {

    static Scanner ints = new Scanner (System.in);
    static Scanner strs = new Scanner (System.in);

    static int[] debit = new int[30];
    static int[] credit = new int [30];
    static int choice = 0;
    static String enter;
    static int numberC = 0;
    static int numberD = 0;

    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static int totalSum (int[] arr)
    {
        int total = 0;
        for (int i = 0; i <arr.length; i++)
        {
            int num = arr[i];
            total = num + total;
        }
        return total;
    }

    public static int balance ()
    {
        return totalSum(debit) - totalSum(credit);
    }

    public static int average ()
    {
        return totalSum(debit)/numberD;
    }

    public static int highestNumber ()
    {
        int max = debit[0];
        for (int i = 0; i < debit.length; i++)
        {
            if (max < debit[i])
            {
                max = debit[i];
            }
        }
        return max;
    }

    public static void print(int arr[])
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            count = count + 1;
            if (arr[i] != 0)
            {
               System.out.print("\n" + count + ". " + arr[i]); 
            }
            else 
            {
                i = arr.length;
            }
        }
    }

    public static int[] deleteCredit (int index)
    {
        
        if (credit == null || index < 0 || index >= credit.length)
        {
            return credit;
        }
        int[] credit2 = new int [credit.length - 1];

        for (int i = 0, j = 0; i < credit.length; i++)
        {
            if (i == index)
            {
                continue;
            }
            credit2[j++] = credit[i];
        }
        return credit2; 
    }

    public static void main(String[] args)
    {
        System.out.println("\n\nWELCOME TO YOUR BANK!!\n\nFirst you'll need to enter your debits and credits, the debits should be more than 10 and credis more than 5.\n\nWhen you finish entering press 0.\nEnter debits: ");
        for (int i = 0; i < debit.length; i++)
        {
            debit[i] = ints.nextInt();
            numberD = numberD + 1;
            if (debit[i] == 0)
            {
                if (i < 10)
                {
                    System.out.println("You need at least 10 values, please continue entering values");
                    i = i -1;
                }
                else
                {
                    numberD = numberD - 1;
                    i = debit.length;
                }
            }


        }
        System.out.println("\nTHANK YOU!\nIt's time for the credits\n\nEnter credits: ");
        for (int i = 0; i < credit.length; i++)
        {
            credit[i] = ints.nextInt();
            numberC = numberC + 1;
            if (credit[i] == 0)
            {
                if (i < 5)
                {
                    System.out.println("You need at least 5 values, please continue entering values");
                    i = i -1;
                }
                else
                {
                    numberC = numberC - 1;
                    i = credit.length;
                }
            }
        }
        while (choice != 9)
        {
            clearScreen();
            System.out.println("\n           MENU");
            System.out.println("\n1. Show total of debits");
            System.out.println("\n2. Show total of credits");
            System.out.println("\n3. Show balance");
            System.out.println("\n4. Show average of debits");
            System.out.println("\n5. Show highest value in debit account");
            System.out.println("\n6. Quantity of debits and credits");
            System.out.println("\n7. Show all values of both accouts");
            System.out.println("\n8. Delete credits");
            System.out.println("\n9. Exit");
            System.out.println("\nEnter your menu option: ");
            choice = ints.nextInt();

            if (choice == 1)
            {
                clearScreen();
                System.out.println("\nDEBIT ACCOUNT TOTAL: "+ totalSum(debit));
                System.out.println("\n\nPress enter to continue: ");
                enter = strs.nextLine();

            }
            else if (choice == 2)
            {
                clearScreen();
                System.out.println("\nCREDIT ACCOUNT TOTAL: "+ totalSum(credit));
                System.out.println("\n\nPress enter to continue: ");
                enter = strs.nextLine();
            }
            else if (choice == 3)
            {
                clearScreen();
                System.out.println("\nBALANCE: "+ balance());
                System.out.println("\n\nPress enter to continue: ");
                enter = strs.nextLine();
            }
            else if (choice == 4)
            {
                clearScreen();
                System.out.println("\nAVERAGE CREDIT ACCOUNT: "+ average());
                System.out.println("\n\nPress enter to continue: ");
                enter = strs.nextLine();
            }
            else if (choice == 5)
            {
                clearScreen();
                System.out.println("\nHIGHEST VALUE IN DEBIT ACCOUNT: "+ highestNumber());
                System.out.println("\n\nPress enter to continue: ");
                enter = strs.nextLine();
            }
            else if (choice == 6)
            {
                clearScreen();
                System.out.println("\nNumber of debit operations: " + numberD);
                System.out.println("\nNumber of credit operations: " + numberC);
                System.out.println("\n\nPress enter to continue: ");
                enter = strs.nextLine();
            }
            else if (choice == 7)
            {
                clearScreen();
                System.out.println("\nDEBIT");
                System.out.println("--------------");
                print(debit);
                System.out.println("\n\nCREDIT");
                System.out.println("--------------");
                print(credit);
                System.out.println("\n\nPress enter to continue: ");
                enter = strs.nextLine();
            }
            else if (choice == 8)
            {
                clearScreen();
                System.out.println("CREDIT");
                System.out.println("--------------");
                print(credit);
                System.out.println("\nEnter the index of the credit balance you want to delete");
                int index = ints.nextInt();
                index = index - 1;
                numberC = numberC - 1;
                credit = deleteCredit(index);
                System.out.println("\nSuccess!! The balance selected has been deleted!");
                System.out.println("\n\nPress enter to continue: ");
                enter = strs.nextLine();
            }
        }
    }
}