package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> firstAndSecondSet = new HashSet<>(firstSet);
        firstAndSecondSet.addAll(secondSet);

        firstSet.retainAll(secondSet);
        firstSet.removeAll(thirdSet);

        thirdSet.removeAll(firstAndSecondSet);

        firstSet.addAll(thirdSet);

        return firstSet;
    }
}
