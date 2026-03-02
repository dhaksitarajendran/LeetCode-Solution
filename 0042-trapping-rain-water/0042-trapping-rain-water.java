class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==0)
        return 0;
    int left =0;
    int right =n-1;
    int leftMax=0;
    int rightMax=0;
    int water =0;
    while(left<right){
        if(height[left]<height[right]){
            if(leftMax < height[left]){
              leftMax=height[left];
     }
     else{
        water += leftMax-height[left];
     }
     left++;
    }
    else {
          if(height[left]>=height[right]){
            if(rightMax < height[right]){
              rightMax=height[right];
    }
    else{
      water += rightMax-height[right];  
    }
    right--;
    }
    }
    }
    return water;
}
    }
    