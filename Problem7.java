//Wi-Fi Network project in java
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password:");
        int p = sc.nextInt();
        if(p==1234){
             System.out.println("Connected");
        }else{
            System.out.println("not connected");
        }
    }
    
}
