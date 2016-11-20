package com.epam.tamentoring.preselection.Collections;

import java.util.*;

/*
Проверить скорость работы (добавление, поиск элемента, удаление) следующих коллекций:
NOTE: Для наглядности рекомендуется использовать от 10000+ элементов в коллекции
1. Lists (ArrayList vs LinkedList);
2. Sets (HashSet vs TreeSet);
3. Maps (HashMap vs TreeMap).
 */
public class RunnerCollections {
    public static void main(String[] args) {
        int n = 1000000;
        compareLists(n);
        compareSets(n);
        compareMaps(n);
    }

    private static void compareMaps(int n){
        //add elements
        long startTime1 = System.nanoTime();
        HashMap<Integer, String> hashMap = setHashMap(n);
        long endTime1 = System.nanoTime();
        long addTimeHashMap = endTime1 - startTime1;
        System.out.println("--addTimeHashMap = " + addTimeHashMap);

        long startTime2 = System.nanoTime();
        TreeMap<Integer, String> treeMap = setTreeMap(n);
        long endTime2 = System.nanoTime();
        long addTimeTreeMap = endTime2 - startTime2;
        System.out.println("--addTimeTreeMap = " + addTimeTreeMap);

        if(addTimeHashMap < addTimeTreeMap){
            System.out.println("HashMap is faster than TreeMap for adding n = "+ n + " elements");
        }
        else{
            System.out.println("TreeMap is faster than HashMap for adding n = "+ n + " elements");
        }

        //find element
        int element = new Random().nextInt(n);
        long startTime3 = System.nanoTime();
        hashMap.get(element);
        long endTime3 = System.nanoTime();
        long findTimeHashMap = endTime3 - startTime3;
        System.out.println("--findTimeHashMap = " + findTimeHashMap);

        long startTime4 = System.nanoTime();
        treeMap.get(element);
        long endTime4 = System.nanoTime();
        long findTimeTreeMap = endTime4 - startTime4;
        System.out.println("--findTimeTreeMap = " + findTimeTreeMap);

        if(findTimeHashMap < findTimeTreeMap){
            System.out.println("HashMap is faster than TreeMap for finding in n = "+ n + " elements");
        }
        else{
            System.out.println("TreeMap is faster than HashMap for finding in n = "+ n + " elements");
        }

        //remove element
        long startTime5 = System.nanoTime();
        hashMap.remove(element);
        long endTime5 = System.nanoTime();
        long removedTimeHashSet = endTime5 - startTime5;
        System.out.println("--removedTimeHashSet  = " + removedTimeHashSet);

        long startTime6 = System.nanoTime();
        treeMap.remove(element);
        long endTime6 = System.nanoTime();
        long removedTimeTreeSet = endTime6 - startTime6;
        System.out.println("--removedTimeTreeSet  = " + removedTimeTreeSet);

        if(removedTimeHashSet < removedTimeTreeSet){
            System.out.println("HashMap is faster than TreeMap for removing in n = "+ n + " elements");
        }
        else{
            System.out.println("TreeMap is faster than HashMap for removing in n = "+ n + " elements");
        }

        System.out.println("");
    }
    private static HashMap <Integer, String> setHashMap(int n){
        HashMap <Integer, String> hashMap = new HashMap<Integer, String>();
        for (int i = 0; i < n; i++) {
            hashMap.put(i, i+"");
        }
        return hashMap;
    }
    private static TreeMap <Integer, String> setTreeMap(int n){
        TreeMap <Integer, String> treeMap = new TreeMap<Integer, String>();
        for (int i = 0; i < n; i++) {
            treeMap.put(i, i+"");
        }
        return treeMap;
    }

    private static void compareSets(int n){
        //add elements
        long startTime1 = System.nanoTime();
        HashSet<Integer> hashSet = setHashSet(n);
        long endTime1 = System.nanoTime();
        long addTimeHashSet = endTime1 - startTime1;
        System.out.println("--addTimeHashSet = " + addTimeHashSet);

        long startTime2 = System.nanoTime();
        TreeSet<Integer> treeSet = setTreeSet(n);
        long endTime2 = System.nanoTime();
        long addTimeTreeSet = endTime2 - startTime2;
        System.out.println("--addTimeTreeSet = " + addTimeTreeSet);

        if(addTimeHashSet < addTimeTreeSet){
            System.out.println("HashSet is faster than TreeSet for adding n = "+ n + " elements");
        }
        else{
            System.out.println("TreeSet is faster than HashSet for adding n = "+ n + " elements");
        }

        //find element
        int element = new Random().nextInt(n);
        long startTime3 = System.nanoTime();
        hashSet.contains(element);
        long endTime3 = System.nanoTime();
        long findTimeHashSet = endTime3 - startTime3;
        System.out.println("--findTimeHashSet = " + findTimeHashSet);

        long startTime4 = System.nanoTime();
        treeSet.contains(element);
        long endTime4 = System.nanoTime();
        long findTimeTreeSet = endTime4 - startTime4;
        System.out.println("--findTimeTreeSet = " + findTimeTreeSet);

        if(findTimeHashSet < findTimeTreeSet){
            System.out.println("HashSet is faster than TreeSet for finding in n = "+ n + " elements");
        }
        else{
            System.out.println("TreeSet is faster than HashSet for finding in n = "+ n + " elements");
        }

        //remove element
        long startTime5 = System.nanoTime();
        hashSet.remove(element);
        long endTime5 = System.nanoTime();
        long removedTimeHashSet = endTime5 - startTime5;
        System.out.println("--removedTimeHashSet  = " + removedTimeHashSet);

        long startTime6 = System.nanoTime();
        treeSet.remove(element);
        long endTime6 = System.nanoTime();
        long removedTimeTreeSet = endTime6 - startTime6;
        System.out.println("--removedTimeTreeSet  = " + removedTimeTreeSet);

        if(removedTimeHashSet < removedTimeTreeSet){
            System.out.println("HashSet is faster than TreeSet for removing in n = "+ n + " elements");
        }
        else{
            System.out.println("TreeSet is faster than HashSet for removing in n = "+ n + " elements");
        }

        System.out.println("");
    }
    private static HashSet <Integer> setHashSet(int n){
        HashSet <Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            hashSet.add(i);
        }
        return hashSet;
    }
    private static TreeSet<Integer> setTreeSet(int n){
        TreeSet <Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            treeSet.add(i);
        }
        return treeSet;
    }

    private static void compareLists(int n) {
        //add elements
        long startTime1 = System.nanoTime();
        ArrayList<Integer> arrayList = setArrayList(n);
        long endTime1 = System.nanoTime();
        long addTimeArrayList = endTime1 - startTime1;
        System.out.println("--addTimeArrayList  = " + addTimeArrayList);

        long startTime2 = System.nanoTime();
        LinkedList<Integer> linkedList = setLinkedList(n);
        long endTime2 = System.nanoTime();
        long addTimeLinkedList = endTime2 - startTime2;
        System.out.println("--addTimeLinkedList = " + addTimeLinkedList);

        if(addTimeArrayList < addTimeLinkedList){
            System.out.println("ArrayList is faster than LinkedList for adding n = "+ n + " elements");
        }
        else{
            System.out.println("LinkedList is faster than ArrayList for adding n = "+ n + " elements");
        }

        //find element
        int element = new Random().nextInt(n);
        long startTime3 = System.nanoTime();
        arrayList.indexOf(element);
        long endTime3 = System.nanoTime();
        long findTimeArrayList = endTime3 - startTime3;
        System.out.println("--findTimeArrayList  = " + findTimeArrayList);

        long startTime4 = System.nanoTime();
        linkedList.indexOf(element);
        long endTime4 = System.nanoTime();
        long findTimeLinkedList = endTime4 - startTime4;
        System.out.println("--findTimeLinkedList = " + findTimeLinkedList);

        if(findTimeArrayList < findTimeLinkedList){
            System.out.println("ArrayList is faster than LinkedList for finding in n = "+ n + " elements");
        }
        else{
            System.out.println("LinkedList is faster than ArrayList for finding in n = "+ n + " elements");
        }

        //remove element
        long startTime5 = System.nanoTime();
        arrayList.remove(element);
        long endTime5 = System.nanoTime();
        long removedTimeArrayList = endTime5 - startTime5;
        System.out.println("--removedTimeArrayList  = " + removedTimeArrayList);

        long startTime6 = System.nanoTime();
        linkedList.remove(element);
        long endTime6 = System.nanoTime();
        long removedTimeLinkedList = endTime6 - startTime6;
        System.out.println("--removedTimeLinkedList  = " + removedTimeLinkedList);

        if(removedTimeArrayList < removedTimeLinkedList){
            System.out.println("ArrayList is faster than LinkedList for removing in n = "+ n + " elements");
        }
        else{
            System.out.println("LinkedList is faster than ArrayList for removing in n = "+ n + " elements");
        }

        System.out.println("");
    }
    private static ArrayList<Integer> setArrayList(int n){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        return  arrayList;
    }
    private static LinkedList<Integer> setLinkedList(int n){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        return  linkedList;
    }
}