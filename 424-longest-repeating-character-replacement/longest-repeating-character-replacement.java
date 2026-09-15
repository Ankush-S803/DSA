class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxWindow = 0;
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;

            // Maximum frequency of any character in current window
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int windowLength = right - left + 1;

            // Characters that need to be replaced
            if (windowLength - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            windowLength = right - left + 1;

            // Store maximum valid window
            maxWindow = Math.max(maxWindow, windowLength);
        }

        return maxWindow;
    }
}