class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int a : nums) {
            if (!seen.add(a)) {
                return true;
            }
        }

        return false;
    }
}