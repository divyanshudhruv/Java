import java.util.*;

public class Niven {
    int n;

    Niven(){
        n=0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        n = sc.nextInt();     
    }

    void calc(){
        int num = n;
        int d=0,s=0,r=0;

        while (num > 0)
        {
            r = num % 10;
            s = s + r;
            num = num / 10;
        }

        if (n % s == 0)
            System.out.println("It Is A Niven Number");
        else
            System.out.println("It Is Not A Niven Number");
    }

    public static void main(String[] args) {
        Niven obj = new Niven();
        obj.input();
        obj.calc();
    }
}
