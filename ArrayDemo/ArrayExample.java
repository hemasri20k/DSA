package ArrayDemo;

public class ArrayExample {
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    /*public int[] resize(int[] arr, int capacity){
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        
        return temp;
    }*/
    public int findMissingNum(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
        }
        return sum;
    }
    /*public void arrayDemo(){
        
        /*int[] arr=new int[5];
        arr[0]=5;
        arr[1]=4;
        arr[2]=3;
        arr[3]=2;
        arr[4]=1;
        arr[3]=10;
        
        

    }*/
    public static void main(String[] args) {
        ArrayExample a=new ArrayExample();
        
        int[] arr={1,5,4,6};
        /*int[] original=new int[]{1,2,3,4,5};
        
        System.out.println("The size of original array is" + original.length);
        original=a.resize(original,original.length*2);
        System.out.println("The size of array after resizing: " + original.length);*/
        System.out.println("The missing number is:" + a.findMissingNum(arr));

       

       
    }
  
}
