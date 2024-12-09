package ArrayDemo;

public class FindMin {
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        FindMin f=new FindMin();
        int arr[]={5,7,10,1,4,0};
        f.printArray(arr);
        
        System.out.println(findMin(arr));
    }
}
