package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int min = Math.min(leftBorder,rightBorder);
        int max = Math.max(leftBorder,rightBorder);
        return IntStream.rangeClosed(min,max).filter(num->num%2==0).sum();

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int min = Math.min(leftBorder,rightBorder);
        int max = Math.max(leftBorder,rightBorder);
        return IntStream.rangeClosed(min,max).filter(num->num%2!=0).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
//        List<String> arrayBefore = Arrays.asList("a", "b", "c", "d");
//        List<String> arrayAfter = arrayBefore.stream() .map(String::toUpperCase) .collect(toList());
        return arrayList.stream().map(s -> 3*s);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
