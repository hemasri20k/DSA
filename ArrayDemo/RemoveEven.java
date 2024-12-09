package ArrayDemo;

public class RemoveEven {
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] removeEven(int[] arr){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] res=new int[oddCount];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                res[idx]=arr[i];
                idx++;
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        ArrayExample a=new ArrayExample();
        
        int[] arr={1,2,3,4,5};
        a.printArray(arr);
        System.out.println();
        int res[]=a.removeEven(arr);
        a.printArray(res);

       
    }
}
