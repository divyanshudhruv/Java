import java.util.*;

public class Duck {
    int n;

    Duck(){
        n=0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        n = sc.nextInt();     
    }

    void calc(){
        int num = n;
        int d=0,f=0;

        while(num!=0){
            d = num % 10;

            if(d==0){
                f = 1;
            break;
            }
            num/=10;
        }

        if(f==1)
            System.out.println("It Is A Duck Number");
        else
            System.out.println("It Is Not A Duck Number");

    }

    public static void main(String[] args) {
        Duck obj = new Duck();
        obj.input();
        obj.calc();
    }
}
