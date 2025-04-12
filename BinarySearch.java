import java.util.*;
class BinarySearch{

    public static int binarySearchNumber(int arr[], int key){
        int si = 0;
        int ei = arr.length -1;
        
        while(si<=ei){
            int mid = si + (ei - si)/2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        int i,idx,key;
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        // Inputer in the array
        System.out.println("Enter any five intergers ");
        for(i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter number to search ");
        key = sc.nextInt();
        idx = binarySearchNumber(arr, key);
        if(idx != -1){
            System.out.println("Element are found at " + (idx+1));
    }else{
        System.out.println("Element are not found");
    }
        
    // Print the array
        for(i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    sc.close();
    }
}