package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
            HashSet<Integer> set = new HashSet<>();
        for (Integer x: sourceList) {
            if(x%2==0){
                do{
                    set.add(x);
                    x/=2;
                }while(x%2==0);
                set.add(x);
            }else{
                set.add(x);
                set.add(x*2);
            }
        }
            return set;
    }
}
