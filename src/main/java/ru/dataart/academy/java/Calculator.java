package ru.dataart.academy.java;

import java.util.*;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int firstVal = 0;
        int secondVal = 0;
        for (int i = 0; i < firstNumber.size(); i++) {
            firstVal += firstNumber.get(i) * Math.pow(10, i);
        }
        for (int i = 0; i < secondNumber.size(); i++) {
            secondVal += secondNumber.get(i) * Math.pow(10, i);
        }
        return firstVal + secondVal;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i+= 2) {
            resultList.add(list.get(i));
        }
        return resultList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.size() == 0)
            return Collections.emptyList();
        else
            return list.size() > 1 ?
                    Arrays.asList(list.get(0), list.get(list.size() - 1)) : list;
    }
}
