package Lab4;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


/**
 * Class "Main" shows program work
 *
 * @version 1.0 Reborn 07.12.2022
 * @author Islamov Radmir PIN-23
 */

public class Main_lab4 {
    /**ProductionArrayList - ArrayList. Kipping Production data*/
    private static ArrayList<Production> ProductionArrayList;
    /**ProductionLinkedList - LinkedList. Kipping Production data*/
    private static LinkedList<Production> ProductionLinkedList;

    static String[] carriageValue = {"carriageBulk", "carriageCar", "carriageContainer", "carriageLiquid"};



    /**shows information*/
    static void view(String line){
        System.out.println(line);
    }

    /**define ProductionArrayList*/
    static void modelDefineArrayList(ErrMsgLog log, long[] AddingTimes, int count) {
        ProductionArrayList = new ArrayList<>(count);
        long totalTime = 0;
        for(int i=0; i<count; i++) {
            Production product = new Production("xArray", carriageValue[(int) (1 + Math.random() * 3)]);

            long start = System.nanoTime();
            ProductionArrayList.add(product);
            AddingTimes[i] = System.nanoTime() - start;

            log.addMsgWithLog("Add Array time: "+AddingTimes[i]+" index -> "+i);

            totalTime += AddingTimes[i];
            AddingTimes[i] = 0;
        }

        log.addMsgWithLog("Add count -> "+count);
        log.addMsgWithLog("Total time: "+totalTime);
        log.addMsgWithLog("Median time: "+totalTime/count);
    }

    /**define ProductionLinkedList*/
    static void modelDefineLinkedList(ErrMsgLog log, long[] AddingTimes, int count) {
        ProductionLinkedList = new LinkedList<>();
        long totalTime = 0;
        for(int i=0; i<count; i++) {
            Production product = new Production("yLinked", carriageValue[(int) (1 + Math.random() * 3)]);

            long start = System.nanoTime();
            ProductionLinkedList.add(product);
            AddingTimes[i] = System.nanoTime() - start;

            log.addMsgWithLog("Add Array time: "+AddingTimes[i]+" index -> "+i);

            totalTime += AddingTimes[i];
            AddingTimes[i] = 0;
        }

        log.addMsgWithLog("Add count -> "+count);
        log.addMsgWithLog("Total time: "+totalTime);
        log.addMsgWithLog("Median time: "+totalTime/count);
    }

    /**delete ProductionArrayList*/
    static void modelRemoveArrayList(ErrMsgLog log, long[] RemovingTimes, int count) {
        long totalTime = 0;
        for(int i=0; i<count/10; i++) {

            long start = System.nanoTime();
            ProductionArrayList.remove(new Random().nextInt(ProductionArrayList.size()));
            RemovingTimes[i] = System.nanoTime() - start;

            log.addMsgWithLog("Remove Array time: "+RemovingTimes[i]+" index -> "+i);

            totalTime += RemovingTimes[i];
            RemovingTimes[i] = 0;
        }

        log.addMsgWithLog("Remove count -> "+count/10);
        log.addMsgWithLog("Total time: "+totalTime);
        log.addMsgWithLog("Median time: "+totalTime/(count/10));
    }

    /**delete ProductionLinkedList*/
    static void modelRemoveLinkedList(ErrMsgLog log, long[] RemovingTimes, int count) {
        long totalTime = 0;
        for(int i=0; i<count; i++) {

            long start = System.nanoTime();
            ProductionLinkedList.remove(new Random().nextInt(ProductionLinkedList.size()));
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
