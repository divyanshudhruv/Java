import java.util.*;

public class BubbleSort {
    int n,f=0;
    Scanner sc = new Scanner(System.in);

    BubbleSort(){
        n=0;
    }

    void input(){
        System.out.print("Enter The Number Of Elements In An Array: ");
        n = sc.nextInt();
    }

    void calc(){
        int a[]=new int[n];
        System.out.println("Enter The Elements In An Array:");

        for(int i=0;i<a.length;i++){ 
            System.out.print("a[" +i+"]: ");
            n = sc.nextInt();
            a[i] = n;
        }

        System.out.print("Array Before Sorting: ");
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");

        }

        System.out.println();

        for(int i = 0; i < a.length; i++)    
        {    
            for(int j = i+1; j < a.length; j++)    
            {    
                if(a[j] < a[i])    
                {    
                    int temp = a[i];    
                    a[i] = a[j];    
                    a[j] = temp;     
                }     
            }     
        }  

        System.out.print("Array After Sorting : ");

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        obj.input();
        obj.calc();
    }
}
