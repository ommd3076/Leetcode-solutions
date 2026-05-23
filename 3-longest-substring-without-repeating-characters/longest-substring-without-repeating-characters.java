class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLen = 0;
        int start = 0; // left pointer of current window

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // If we saw this char before and it's inside current window
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= start) {
                start = lastSeen.get(c) + 1; // move start to right of last occurrence
            }

            lastSeen.put(c, end); // update last seen index
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}