package ArrayDemo;

public class Palindrome {
    public boolean isPalindrome(String word){
        char[] charArray=word.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
    public static void main(String[] args) {
        String word="Nope";
        Palindrome p=new Palindrome();
        if(p.isPalindrome(word)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
