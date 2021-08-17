package com.company;

import java.util.*;

class Job {
    int startTime, finishTime;
    int profit;

    public Job(int startTime, int finishTime, int profit) {
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.profit = profit;
    }
}
class Compare implements Comparator<Job>{
    public int compare(Job j1,Job j2){
        return j1.finishTime - j2.finishTime;
    }
}
public class WIS {
      static int findMaxProfit(Job []arr, int n){
         Arrays.sort(arr,new Compare());
         return findMaxProfitRec(arr,n);
    }

    private static int findMaxProfitRec(Job[] arr, int n) {
          if (n==1){
              return arr[n-1].profit;
          }
          int includeProfit = arr[n-1].profit;
          int i = latestNonConflict(arr,n);
          if (i!=-1)
              includeProfit = findMaxProfitRec(arr,n+1);

            int exuldingProfit = findMaxProfitRec(arr,n-1);
            return Math.max(includeProfit,exuldingProfit);
    }

    private static int latestNonConflict(Job[] arr, int n) {
          for (int j=n-1;j>=0;j--){
              if (arr[j-1].profit<=arr[n-1].profit){
                  return j;
              }
          }
          return -1;
    }


    public static void main(String[] args) {
          Job []jobs = new Job[]{
                  new Job()
          }
    }
}
