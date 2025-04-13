class SelectionSort {
    
    public static void selectionSortArray(int arr[]){
        int i,j,max,c;

        for(i = 0; i< arr.length-1 ; i++){
            max = i;
            c = 0;
            for(j = i+1; j<arr.length; j++){

                if(arr[max] > arr[j]){
                    max = j;
                    c++;
                }
            }
            if(c != 0){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {4,3,1,2,5};
        selectionSortArray(arr);

        // Print sorted array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
