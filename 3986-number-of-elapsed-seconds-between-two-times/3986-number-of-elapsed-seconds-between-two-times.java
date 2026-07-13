class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

           String[] start = startTime.split(":"); 
           String[] end = endTime.split(":");
           int count =0;
           int count2 =0;
            count += Integer.parseInt(start[0])*60*60;
            count +=  Integer.parseInt(start[1])*60;
            count +=  Integer.parseInt(start[2]);
         
          count2 +=  Integer.parseInt(end[0])*60*60;
          count2 +=  Integer.parseInt(end[1])*60;
          count2 += Integer.parseInt(end[2]);

          return count2-count;
            
    }
}