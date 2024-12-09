package ArrayDemo;
import java.util.Scanner;
public class ReverseArray {
    public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ReverseArray r=new ReverseArray();
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        r.printArray(a);
        reverseArray(a,0,n-1);
        r.printArray(a);
    }
}
