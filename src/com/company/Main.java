package com.company;
/*A collection also called container is an object that froups elements into a single variable in order to store and
manipulate data. They represent items in a natural grouping such as a phone book which contains a collection
of names, numbers and addresses.*/

import java.util.Collections;
import java.util.ArrayList;

// You have to declare your ArrayList as a particular data type.

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> temperatureList = new ArrayList<Double>();
        //use add method to add items to array
        temperatureList.add(40.5);
        temperatureList.add(33.9);
        temperatureList.add(37.8);
        temperatureList.add(15.3);
        temperatureList.add(25.6);

        System.out.println(temperatureList);

        for (Double temp:temperatureList){
            System.out.println(temp);
        }
        //how to iterate through ArrayList
        //must use .size() and .get() with ArrayList instead of .length and [i]
        for (int i = 0; i < temperatureList.size(); i++) {
            System.out.println(temperatureList.get(i));
        }
        //enhanced for loop
        for (Double num: temperatureList){
            System.out.println(num);
        }
        //Sort collection in ascending order with collections class which has sort method
        Collections.sort(temperatureList);
        //find temperature from a list. Positive numbers or 0 indicate it was found. Negative denotes it was not found
        int searchIndex = Collections.binarySearch(temperatureList, 15.3);
        if(searchIndex >=0) {
            System.out.println("Temperature found " + searchIndex);
        }else{
            System.out.println("Temperature not found " + searchIndex);
            }
        //Shuffle collection
        Collections.shuffle(temperatureList);

    }
}
