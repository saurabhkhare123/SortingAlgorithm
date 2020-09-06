import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size,i,j ,temp;
        size= sc.nextInt();
        int [] a= new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<size-1;i++)
        {
           int flag=0;
           for(j=0;j<size-i-1;j++)
           {
               if(a[j]>a[j+1])
               {

                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   flag=1;


               }

           }
            if(flag==0)
                break;

        }
        for( i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }

    }



}
