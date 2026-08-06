public class function03 {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0){
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args){
        int num = 29;
        if(isprime(num)){
            System.out.println(num + "is a prime number");

        } else{
            System.out.print(num + "is not a prime number");
        }
    }
    
}
