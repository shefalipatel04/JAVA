import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner cal = new Scanner(System.in);
        System.out.print("Enter the value of a");
        int a = cal.nextInt();
        System.out.print("Enter the value of b");
        int b = cal.nextInt();
        System.out.println("choose the operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication)");
        System.out.println("4.Division");
        System.out.println("5.Modulo ");
        System.out.print("Enter your choice (1-5)");
        int choice = cal.nextInt();
        switch(choice){
        case 1 :      
        System.out.println("result" + (a + b) );
        break;
        case 2 :
             System.out.println("result" + (a - b));
         break;
        case 3 :
             System.out.println("result" + (a * b));
        break;
        case 4:
            if(b != 0)
                 System.out.println("result" + (a / b));
                else
                     System.out.println("number is not allow with zero");
                    break;
        case 5 :
            if(b != 0)
                 System.out.println("result" + (a % b));
                else
                     System.out.println("number is not allow with zero");
                    break;
        default:
             System.out.println("Invalid choice!");
             cal.close();
             }
    }
}



                    

 






    

