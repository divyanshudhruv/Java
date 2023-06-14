import java.util.*;

public class Pronic{
    int n;
    
    Pronic(){
        n=0;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        n = sc.nextInt();   
    }
    void calc() {
        int f = 0;
        
        for (int i = 1; i <=n; i++) {
            if (i * (i + 1) == n) {
                f = 1;
                break;
            }
        }       
        
        if (f == 1)
            System.out.println("It Is a Pronic Number");
        else
            System.out.println("It Is Not A Pronic Number"); 

    }
    
    public static void main(String[] args) {
        Pronic obj = new Pronic();
        obj.input();
        obj.calc();
    }
}
