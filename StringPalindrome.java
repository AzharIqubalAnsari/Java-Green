import java.util.Scanner;
class StringPalindrome {
    public static boolean palindrome(String str){
        int i,n;

        n =str.length();

        for(i = 0; i < n/2; i++){

            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        String str = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any word in lowercase to check palindrome");
        str = sc.next().trim().toLowerCase();

        if(palindrome(str) != false){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

        sc.close();
    }
}
