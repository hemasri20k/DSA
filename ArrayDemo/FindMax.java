package ArrayDemo;

public class FindMax {
    public int findMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        FindMax fm=new FindMax();
        int[] a={10,4,2,20};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(fm.findMax(a));

    }
}
