package com.company;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static HashMap<String, Integer>names(int players){
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        //String[][] people = new String[players][1];
        for (int i = 0; i < players; i++) {
            System.out.println("What is your name?");
            people.put(input.next(), 0);
        }return people;
    }

    public static String[] guess(String[] people){
        Random random = new Random();
        String[] array = new String[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < people.length; j++) {
                System.out.println("Make your guess player " + j);
                if(array[1].isEmpty()){
                    array[random.nextInt(array.length)] = people[j];
                }
            }
        }return array;
    }public static int[] count(String[] fullArray, String[] players){
        int[] countArray = new int[players.length];
        for (int i = 0; i < players.length; i++) {
            int counter = 0;
            for (int j = 0; j < fullArray.length; j++) {
                if(fullArray[j].equals(players[i])){
                    counter++;
                }countArray[i] = counter;
            }
        }return countArray;
    }
    public static void output(int[] count, String)

    public static void main(String[] args) {


    }
}
