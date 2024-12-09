package ArrayDemo;

public class FindSecondMax {
    public int findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax & arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        FindSecondMax fsm=new FindSecondMax();
        int[] a={2,30,29,30,4};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(fsm.findSecondMax(a));
    }
}
