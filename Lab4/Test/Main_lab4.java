package ru.miet.islamov.Lab4.Test;

import java.util.*;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


/**
 * Class "Main" shows program work
 *
 * @version 1.0 Reborn 02.11.2021
 * @author Igor Kolesov PIN-23
 */

public class Main_lab4 {
    /**animalsArrayList - ArrayList. Kipping animals data*/
    private static ArrayList<Animals> animalsArrayList;
    /**animalsLinkedList - LinkedList. Kipping animals data*/
    private static LinkedList<Animals> animalsLinkedList;


    /**shows information*/
    static void view(String line){
        System.out.println(line);
    }

    /**define animalsArrayList*/
    static void modelDefineArrayList(ErrMsgLog log, long[] AddingTimes, int count) {
        animalsArrayList = new ArrayList<>(count);
        long totalTime = 0;
        for(int i=0; i<count; i++) {
            Animals animal = new Animals("xArray", 10 + Math.random() * 990, (int) (1 + Math.random() * 29));

            long start = System.nanoTime();
            animalsArrayList.add(animal);
            AddingTimes[i] = System.nanoTime() - start;

            log.addMsgWithLog("Add Array time: "+AddingTimes[i]+" index -> "+i);

            totalTime += AddingTimes[i];
            AddingTimes[i] = 0;
        }

        log.addMsgWithLog("Add count -> "+count);
        log.addMsgWithLog("Total time: "+totalTime);
        log.addMsgWithLog("Median time: "+totalTime/count);
    }

    /**define animalsLinkedList*/
    static void modelDefineLinkedList(ErrMsgLog log, long[] AddingTimes, int count) {
        animalsLinkedList = new LinkedList<>();
        long totalTime = 0;
        for(int i=0; i<count; i++) {
            Animals animal = new Animals("yLinked", 10 + Math.random() * 990, (int) (1 + Math.random() * 29));

            long start = System.nanoTime();
            animalsLinkedList.add(animal);
            AddingTimes[i] = System.nanoTime() - start;

            log.addMsgWithLog("Add Array time: "+AddingTimes[i]+" index -> "+i);

            totalTime += AddingTimes[i];
            AddingTimes[i] = 0;
        }

        log.addMsgWithLog("Add count -> "+count);
        log.addMsgWithLog("Total time: "+totalTime);
        log.addMsgWithLog("Median time: "+totalTime/count);
    }

    /**delete animalsArrayList*/
    static void modelRemoveArrayList(ErrMsgLog log, long[] RemovingTimes, int count) {
        long totalTime = 0;
        for(int i=0; i<count/10; i++) {

            long start = System.nanoTime();
            animalsArrayList.remove(new Random().nextInt(animalsArrayList.size()));
            RemovingTimes[i] = System.nanoTime() - start;

            log.addMsgWithLog("Remove Array time: "+RemovingTimes[i]+" index -> "+i);

            totalTime += RemovingTimes[i];
            RemovingTimes[i] = 0;
        }

        log.addMsgWithLog("Remove count -> "+count/10);
        log.addMsgWithLog("Total time: "+totalTime);
        log.addMsgWithLog("Median time: "+totalTime/(count/10));
    }

    /**delete animalsLinkedList*/
    static void modelRemoveLinkedList(ErrMsgLog log, long[] RemovingTimes, int count) {
        long totalTime = 0;
        for(int i=0; i<count; i++) {

            long start = System.nanoTime();
            animalsLinkedList.remove(new Random().nextInt(animalsLinkedList.size()));
            RemovingTimes[i] = System.nanoTime() - start;

            log.addMsgWithLog("Remove Array time: "+RemovingTimes[i]+" index -> "+i);

            totalTime += RemovingTimes[i];
            RemovingTimes[i] = 0;
        }

        log.addMsgWithLog("Remove count -> "+count/10);
        log.addMsgWithLog("Total time: "+totalTime);
        log.addMsgWithLog("Median time: "+totalTime/(count/10));
    }


    //all program
    static void controller(int count, String configNameArray, String configNameLinked) throws Exception {
        //Array add and remove
        ErrMsgLog logArray = new ErrMsgLog(configNameArray);
        long[] AddingTimes = new long[count];
        long[] RemovingTimes = new long[count];

        logArray.addMsgWithLog("Program start -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        modelDefineArrayList(logArray, AddingTimes, count);
        modelRemoveArrayList(logArray, RemovingTimes, count);
        logArray.addMsgWithLog("Program finish -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        logArray.addMsgWithLog("Errors count -> "+ logArray.getErrCount());


        //Linked add and remove
        ErrMsgLog logLinked = new ErrMsgLog(configNameLinked);

        logLinked.addMsgWithLog("Program start -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        modelDefineArrayList(logLinked, AddingTimes, count);
        modelRemoveArrayList(logLinked, RemovingTimes, count);
        logLinked.addMsgWithLog("Program finish -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        logArray.addMsgWithLog("Errors count -> "+ logLinked.getErrCount());
    }

    //main
    public static void main(String[] args){
        try {
            controller(10, "Alogging10.properties", "Llogging10.properties");
            controller(100, "Alogging100.properties", "Llogging100.properties");
            controller(1000, "Alogging1000.properties", "Llogging1000.properties");
            controller(10000, "Alogging10000.properties", "Llogging10000.properties");
            controller(100000, "Alogging100000.properties", "Llogging100000.properties");
        } catch(IOException e){
            view("Error -> "+e);
        } catch (Exception e) {
            view("Error -> "+e);
        }
    }
}
