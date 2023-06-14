import java.util.*;

public class Harshad {
    int n;

    Harshad(){
        n=0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        n = sc.nextInt();     
    }

    void calc(){
        int num = n;
        int d=0,s=0;

        while(num!=0){
            d = num % 10;
            s+=d;
            num/=10;
        }

        if(n%s==0)
            System.out.println("It Is A Harshad Number");
        else
            System.out.println("It Is Not A Harshad Number");

    }

    public static void main(String[] args) {
        Harshad obj = new Harshad();
        obj.input();
        obj.calc();
    }
}
