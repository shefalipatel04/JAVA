import java.util.Scanner;
public class condition02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b");
        int b = sc.nextInt();
        if (a == b) {
            System.out.print("equal");
        }
       else if(a > b) {
            System.out.print("a is greater");
        }
        else {
            System.out.print("a is lesser");
            sc.close();
        }
    }
}
