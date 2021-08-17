package com.company;

import java.util.Scanner;

public class Knapsack {
    static int Napsack(int W,int []val,int n,int[] wt){
        int i,w;
        int [][]M = new int[n+1][W+1];
        for(i=0 ; i <= n ;i++){
            for(w=0 ; w<= W;w++){
                    if (i == 0 && w==0)
                    M[i][w] = 0;
                    else if(wt[i - 1]<=w)
                    M[i][w] = Math.max(val[i-1]+M[i-1][w-wt[i-1]],M[i-1][w]);
                    else
                    M[i][w] = M[i-1][w];

            }
        }
        i = n;
        int k = W;
        System.out.println("item on knapsack : ");
        while(i>0&&k>0){
            if(M[i][k] != M[i-1][k]){
                System.out.println(i  + " ");
                i=i-1;
                k=k-wt[i];
            }else
                i=i-1;
        }
        return M[n][W];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the max Weight : ");
        int W = s.nextInt();
        System.out.println("enter the number of items : ");
        int n = s.nextInt();
        System.out.println("enter the weight and value of each Item : ");
        int []wt= new int[n];
        int []val = new int[n];
        for (int i = 0 ; i < n ;i++){
            wt[i] = s.nextInt();
            val[i] = s.nextInt();
        }
        System.out.println("\tMax value + " + Napsack(W,val,n,wt));

    }
}
