import java.util.Scanner;
public class menudriven {
    public static void main( String[] args ){
    Scanner sc = new Scanner(System.in);
    int choice;
    do{
        System.out.print("Enter the number 1 or 0");
        choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter your marks");
            int marks = sc.nextInt();
            if(marks >= 90){
                System.out.println("This is good");
            } else if(marks >= 60 && marks <= 89 ){
               System.out.println("This is also good");
            } else if(marks >= 0 && marks <= 59){
               System.out.println("This is good as well");
            }else {
               System.out.println("the marks is invalid");
            }
        }else if (choice != 0) {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        System.out.println("Program Ended.");
        sc.close();

        } 
    }
    
