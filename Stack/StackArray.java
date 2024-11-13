package Stack;
public class StackArray {
    
int top=-1;
static   int[] a=new int[3];
void push(int data){

    if(top == a.length-1)
    {
        System.out.println("Stack Full ");
        return;
    }
    top++;
    a[top]=data;
}
void pop(){
if(top<0){
    System.out.println("Empty Stack");
    return;
}
int res=a[top];

top--;
System.out.println("Popped  : " +res);
}
void display(){
    for(int t =0 ;t< top+1;t++){
        System.out.print(a[t]+ " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        StackArray l=new StackArray();
        l.push(5);
        l.push(7);
        l.push(3);
        l.push(4);
        l.display();
        l.pop();
        l.display();
        l.pop();
        l.display();
        
    }
}