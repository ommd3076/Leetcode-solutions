class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int best = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr = n, streak = 1;
                while (set.contains(curr + 1)) { curr++; streak++; }
                best = Math.max(best, streak);
            }
        }
        return best;
    }
}