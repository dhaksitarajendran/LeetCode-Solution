/*class Solution {
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public int trailingZeroes(int n) {
     int num = factorial(n);
     int count =0;
     int x = num;
     while(x!=0){
      if(x%10==0){
        count++;
      }
     x=x/10;
     
    }
    return count;
}*/
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;

        while(n > 0){
            n = n / 5;
            count += n;
        }

        return count;
    }
}