import java.util.Scanner;

public class Special {
    int n;

    public Special() {
        n = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        n = sc.nextInt();
    }

    void calc() {
        int num = n;
        int s=0,d=0,p=1;
        
        while (num != 0)  {  
            d = num % 10;  
            int f=1;  
            for(int i=1; i<=d; i++){  
                f*=i;            
            }  
            s+=f;  
            num/=10;              
        }  
        
        if(n==s)         
            System.out.println("It Is A Special Number");            
        else   
            System.out.println("It Is Not A Special Number");   
        
    }

    public static void main(String[] args) {
        Special obj = new Special();
        obj.input();
        obj.calc();
    }
}
