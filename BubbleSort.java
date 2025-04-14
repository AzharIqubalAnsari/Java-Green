 class BubbleSort {

    void bubbleSortArray(int arr[]){
        int i,j,temp,swap;

        // Sort in ascending order
        for(i = 0; i < arr.length-1; i++){
            swap = 0;
            for(j = 0; j < (arr.length-1-i); j++){
                // swap
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;    
                }
            }
           if(swap == 0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();

        int arr[] = {5,4,1,2,3};
        obj.bubbleSortArray(arr);

        // Print the sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
