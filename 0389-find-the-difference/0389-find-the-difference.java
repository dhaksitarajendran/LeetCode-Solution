class Solution {
    public char findTheDifference(String s, String t) {
     int num =0;
     int num2=0;
     for(int i=0;i<s.length();i++){
        num += s.charAt(i);
     }  
      for(int i=0;i<t.length();i++){
        num2 += t.charAt(i);
     }  
     int v = num2 - num;
     return (char) v;
    }
}