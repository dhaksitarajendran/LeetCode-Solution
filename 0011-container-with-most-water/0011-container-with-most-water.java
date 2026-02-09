class Solution {
    public int maxArea(int[] height) {
        int water =0, left =0 , right = height.length-1;
        int d;
       int maxi = Integer.MIN_VALUE;
        int area=1;
        while(left<right){
            d=right-left;
            water = Math.min(height[left],height[right]);
            area=d*water;
           maxi = Math.max(maxi,area);
            if(height[left]<height[right])
            left ++;
            else
            right--;
        }
        return maxi;
    }
}