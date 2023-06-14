import java.util.*;

public class Abundant {
    int n;

    Abundant(){
        n=0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        n = sc.nextInt();     
    }

    void calc(){
        int s=0;

        for(int i=1;i<n;i++){
            if(n%i==0)
                s+=i;
        }

        if(s>n)
            System.out.println("It Is An Abundant Number");
        else
            System.out.println("It Is Not An Abundant Number");

    }

    public static void main(String[] args) {
        Abundant obj = new Abundant();
        obj.input();
        obj.calc();
    }
}
