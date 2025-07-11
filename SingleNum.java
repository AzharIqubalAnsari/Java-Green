package Array2;
class SingleNum {
    public static int singleNumber(int[] nums) {
        int i,s = 0;
        for(i = 0;i < nums.length; i++){
            s = s^nums[i];
        }
        
        return s;
    }
    public static void main(String[] args) {
        int nums[] = {5,3,5,7,3};
        System.out.println(singleNumber(nums));
    }
}
