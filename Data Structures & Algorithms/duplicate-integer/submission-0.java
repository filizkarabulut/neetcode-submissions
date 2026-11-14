class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> appears = new HashSet<>();

        for (int num : nums) {
            if (appears.contains(num)) {
                return true;
            }

            appears.add(num);
        }

        return false;
    }
}