import java.util.*;

public class Lead {
    int n;

    Lead(){
        n=0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        n = sc.nextInt();     
    }

    void calc(){
        int num = n;
        int d=0,sum_E=0,sum_O=0;

        while(num!=0){
            d = num % 10;

            if(d%2==0){
                sum_E+=d;
            }else{
                sum_O+=d;
            }
            num/=10;
        }

        if(sum_E == sum_O)
            System.out.println("It Is A Lead Number");
        else
            System.out.println("It Is Not A Lead Number");

    }

    public static void main(String[] args) {
        Lead obj = new Lead();
        obj.input();
        obj.calc();
    }
}
