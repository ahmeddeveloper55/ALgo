package com.company;//package com.company;
//
//import java.util.Scanner;
//
//public class mergeSort {
//    public static void mergeSort(int arr[],int p , int r){
//            if(p<r){
//               int q = p+(r-p)/2;
//               mergeSort(arr,p,q);
//               mergeSort(arr,q+1,r);
//               merge(arr,p,q,r);
//            }
//
//    }
//    public static void merge(int[] arr, int p, int q, int r){
//        int n1=q-p+1;
//        int n2 =r-q;
//        int[] l1 = new int[n1];
//        int[] m = new int[n2];
//        for(int i1=0;i1<n1;i1++){
//            l1[i1] = arr[p+1];
//        }
//        for (int j1 = 0; j1 < n2; j1++) {
//            m[j1] = arr[q+1+j1];
//        }
//        int i=0;
//        int j=0;
//        int k = p;
//        while (i<n1 && j<n2){
//            if (l1[i] <= m[j]) {
//                arr[k] = l1[i];
//                i++;
//            }else {
//                arr[k] = m[j];
//                j++;
//            }
//            k++;
//        }
//        while (i<n1){
//            arr[k] = l1[i];
//            i++;
//            k++;
//        }
//        while (j<n2){
//            arr[k]=m[j];
//            j++;
//            k++;
//        }
//
//    }
//    public static void printA(int a[]){
//        int n2 = a.length;
//        for (int i=0; i<n2;i++) {
//            System.out.println(a[i] + " ");
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the size of array : ");
//        int n = in.nextInt();
//        int[] a2 = new int[n];
//        System.out.println("enter the elements : ");
//        for(int i = 0 ;i<n;i++){
//            a2[i]=in.nextInt();
//        }
//        System.out.println("unSorted  : ");
//        printA(a2);
//        long start = System.nanoTime();
//        mergeSort(a2,0,a2.length-1);
//        long end = System.nanoTime();
//        System.out.println("time taken by function is : " + (end-start) + "ns");
//        System.out.println("sorted : ");
//        printA(a2);
//
//    }
//}
/* Java program for Merge Sort */
import java.time.*;
import java.util.*;
class MergeSort
{

 public static void mergeSort(int a[],int l ,int r){
     if(l < r){
         int q = l+(r-l)/2;
         mergeSort(a,l,q);
         mergeSort(a,q+1,r);
         merge(a,l,q,r);
     }

 }
 public static void merge(int arr[],int l,int q,int r){
     //l[],m[]
     int n1= q-l+1;
     int n2 = r-q;
     int [] l1 = new int[n1];
     int []m = new int[n2];
     for(int i = 0 ; i<n1;i++){
         l1[i]=arr[l+i];

     }
     for (int j = 0; j < n2; j++) {
         m[j] = arr[q+1+j];
     }
     int i ,j,k;
     i=0;
     j=0;
     k=l;
     while (i<n1 && j <n2) {
         if (l1[i] <= m[j]) {
             arr[k] = l1[i];
             i++;
         } else {
             arr[k] = m[j];
             j++;
         }
         k++;
     }
     while (i<n1){
         arr[k] = l1[i];
         i++;
         k++;
     }
     while (j<n2){
         arr[k]=m[j];
         j++;
         k++;
     }


 }
 public static void printArray(int arrayA[]){
     for (int i = 0; i <arrayA.length ; i++) {
         System.out.println();
         System.out.println(arrayA[i] + " ");
     }
     System.out.println();
 }

    // Driver code
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       System.out.println("enter the length :  ");
       int n  = s.nextInt();
        int []sA = new int[n];
        System.out.println("enter the elements : ");
       for( int i = 0 ; i <n;i++){
           sA[i] = s.nextInt();
       }
       System.out.println("given Array : ");
       printArray(sA);
       long st = System.nanoTime();
       mergeSort(sA,0,sA.length - 1);
       long end = System.nanoTime();
       System.out.println("time taken is  : " + (end - st));
       System.out.println("sorted : ");
       printArray(sA);

    }
}

