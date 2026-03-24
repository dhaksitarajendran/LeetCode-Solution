class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[128];
        int start =0;
        int move =0;
        int max=0;
        while(move<s.length()){
        char ch = s.charAt(move);
        freq[ch]++;

        while(freq[ch]>1){
            freq[s.charAt(start)]--;
            start ++;
        }
        int length = move-start+1;
        max = Math.max(max,length);
        move++;
        }

       return max;
    }
}


             