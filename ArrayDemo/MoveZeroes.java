package ArrayDemo;

public class MoveZeroes {
    public void moveZeros(int[] arr){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            
                if(arr[i]!=0 && arr[j]==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                if(arr[j]!=0){
                    j++;
                }
            }
        }

    
    public static void main(String[] args) {
        int[] a={2,4,0,4,0,7,0,8};
        MoveZeroes mz=new MoveZeroes();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        mz.moveZeros(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
