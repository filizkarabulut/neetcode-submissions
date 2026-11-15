class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        int total = 1;
        for (int i=0; i<nums.length; i++) {
            prefix[i] = total;
            total *= nums[i];
        }

        System.out.println("......");
        total = 1;
        for (int i=nums.length-1; i>=0; i--) {
            suffix[i] = total;
            total *= nums[i];
        }

        int[] output = new int[nums.length];
        for (int i=0; i<output.length; i++) {
            output[i] = prefix[i]*suffix[i];
        }
        return output;
    }
}  
