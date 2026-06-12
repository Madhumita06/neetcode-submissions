class Solution {
    public int characterReplacement(String s, int k) {
        int l=0, maxLength=0,maxCount=0;
        int[] count = new int[26];
        for(int r=0;r<s.length();r++){
            count[s.charAt(r)-'A']++;
            maxCount= Math.max(maxCount, count[s.charAt(r)-'A']);

            while((r-l+1) - maxCount > k){
                count[s.charAt(l) - 'A']--;
                l++;
            }

            maxLength = Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }
}
