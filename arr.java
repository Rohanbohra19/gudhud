import java.util.Scanner;
class Example{
    public static void main(String args[]){
        int a[]=new int[10];
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println("sum= "+sum);
    }
}