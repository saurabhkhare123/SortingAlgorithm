import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hole,value,i,size=0;
        size=sc.nextInt();
        int[] a= new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<size;i++)
        {
            hole=i;
            value=a[i];
            while ((hole>0) && (a[hole - 1]>value))
            {
               a[hole]=a[hole-1];
               hole=hole-1;
            }
            a[hole]=value;
        }
        for( i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }

    }
}
