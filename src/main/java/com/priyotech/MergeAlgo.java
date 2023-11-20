package com.priyotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeAlgo {
    public static void main(String[] args) {

        List<Integer> l1=Arrays.asList(2,5,8,12,17,18);
        List<Integer> l2=Arrays.asList(1,4,6,7,9,10,12,13,16,22,23);
        List<Integer> mergedList=mergeTwoList(l1,l2,l1.size(),l2.size());
        System.out.println(mergedList);

        Arrays.asList(1,4,6,7,9,10,12,13,16,22,23).stream().forEach(System.out::println);
    }

    public static List<Integer> mergeTwoList(List<Integer> A,List<Integer> B,int m,int n){
        List<Integer> C=new ArrayList<>(20);

        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if (A.get(i) < B.get(j)) {
                System.out.println("cond 1: "+k+", "+C.size());
                C.add(k,A.get(i));
                k++;
                i++;
            } else {
                System.out.println("cond 2: "+k+", "+C.size());
                C.add(k,B.get(j));
                k++;
                j++;
            }
        }
        System.out.println("Remaining Elements Count:: "+i+","+j);
        for (; i < m; i++) {
            C.add(k,A.get(i));
            k++;
        }

        for (; j < n; j++) {
            C.add(k,B.get(j));
            k++;
        }


        return C;

    }
}
