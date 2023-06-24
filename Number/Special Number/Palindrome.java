import java.util.*;

public class Palindrome {
    int n;

    Palindrome(){
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
            r=(r*10)+d;
            num/=10;
        }

        if(r==n)
            System.out.println("It Is A Palindrome Number");
        else
            System.out.println("It Is Not A Palindrome Number");

    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.input();
        obj.calc();
    }
}
