class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int difference = target - nums[i];

            if (arr.containsKey(difference)) {
                return new int[]{arr.get(difference), i};
            }

            arr.put(nums[i], i);
        }

        return new int[]{};
    }
}
