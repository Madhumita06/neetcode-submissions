class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int  left=0,k=s1.length();
        int s1count[] = new int[26];
        int[] window = new int[26];

        for(char c : s1.toCharArray()){
            s1count[c-'a']++;
        }
        for(int right=0;right<s2.length();right++){
            window[s2.charAt(right)-'a']++;

            if(right>=s1.length()){
                window[s2.charAt(right-s1.length())-'a']--;
            }

            if(Arrays.equals(s1count,window)){
                return true;
            }
        }

        return false;


    }
}
