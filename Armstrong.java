import java.util.*;

public class Armstrong {
    int n;
    
    Armstrong(){
        n=0;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        n = sc.nextInt();     
    }
    
    void calc(){
        int num = n;
        int d=0,r=0;
        
        while(num!=0){
            d = num % 10;
            r += Math.pow(d, 3);
            num /= 10;           
        }
        
        if(r == num)
            System.out.println("It Is An Armstrong Number");
        else
            System.out.println("It Is Not An Armstrong Number");
        
    }
    public static void main(String[] args) {
   	    Armstrong obj = new Armstrong();
        obj.input();
        obj.calc();
    }
}
