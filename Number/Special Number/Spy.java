import java.util.Scanner;

public class Spy {
    int n;

    public Spy() {
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
        
        while (num > 0) {
            d = num % 10;
            s += d;
            p *= d;
            num /= 10;
        }

        if (s==p)
            System.out.println("It Is A Spy Number");
        else
            System.out.println("It Is Not A Spy Number");

    }

    public static void main(String[] args) {
        Spy obj = new Spy();
        obj.input();
        obj.calc();
    }
}
