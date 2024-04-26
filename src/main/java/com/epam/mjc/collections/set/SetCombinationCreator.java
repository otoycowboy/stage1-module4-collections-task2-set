package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> intersectionOfFirstAndSecond = firstSet.stream()
                .filter(secondSet::contains)
                .filter(e -> !thirdSet.contains(e))
                .collect(Collectors.toSet());

        Set<String> onlyInThirdSet = thirdSet.stream()
                .filter(e -> !firstSet.contains(e) && !secondSet.contains(e))
                .collect(Collectors.toSet());

        return Stream.concat(intersectionOfFirstAndSecond.stream(), onlyInThirdSet.stream())
                .collect(Collectors.toSet());
    }
}
