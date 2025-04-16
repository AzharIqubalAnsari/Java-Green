import java.util.*;
class StringBuilders {



    public static void main(String[] args) {
        
        StringBuilders obj = new StringBuilders();

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" Whats up");
        String str = sb.toString();
        System.out.println(str);
        sb.reverse();
        String str1String = sb.toString();
        System.out.println(str1String);
        System.out.println(sb.capacity());


    }
    
}
