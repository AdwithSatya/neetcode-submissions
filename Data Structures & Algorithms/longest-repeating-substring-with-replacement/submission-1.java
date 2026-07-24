class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, maxCount = 0, maxLen = 0;
        char[] ch = s.toCharArray();

        for (int right = 0; right < ch.length; right++) {
            count[ch[right] - 'A']++;
            maxCount = Math.max(maxCount, count[ch[right] - 'A']);

            while ((right - left + 1) - maxCount > k) {
                count[ch[left] - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}