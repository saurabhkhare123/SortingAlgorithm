import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        int size,i,j ,temp;
        Scanner sc = new Scanner(System.in);
        size= sc.nextInt();
        int [] a= new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
           int min=i;
           for(j=i;j<size;j++)
           {
               if(a[j]<=a[i])
               {
                   min=j;
               }
               temp=a[i];
               a[i]=a[min];
               a[min]=temp;
           }
        }
        for( i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}
