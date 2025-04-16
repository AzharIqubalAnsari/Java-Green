import java.util.*;
class StringBuilders {



    public static void main(String[] args) {
        
        StringBuilders obj = new StringBuilders();
        // String Builder object
        StringBuilder sb = new StringBuilder("Hi");
        // using append function to add new string
        sb.append(" Whats up");
        // Convert into string
        String str = sb.toString();
        System.out.println(str);
        sb.reverse();
        String str1String = sb.toString();
        System.out.println(str1String);
        System.out.println(sb.capacity());


    }
    
}
