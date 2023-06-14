import java.util.*;

public class ISBN {
    int n;

    ISBN(){
        n=0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A ISBN Code: ");
        n = sc.nextInt();     
    }

    void calc(){
        int num = n;
        int d=0,i=1,sum=0;
        String s =Integer.toString(n);

        if(s.length()==10){
            while(num!=0){
                d = num%10;
                sum+=(d*i);
                i++;
                num/=10;
            }
            if(sum%11 == 0)
                System.out.println("It Is A Valid ISBN Code.");
            else{
                System.out.println("Error! Illegal ISBN");
                System.exit(0);
            }
        }else{
            System.out.println("Error! Illegal ISBN");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        ISBN obj = new ISBN();
        obj.input();
        obj.calc();
    }
}
