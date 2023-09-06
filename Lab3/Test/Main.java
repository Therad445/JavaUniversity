package Lab3.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Properties;


/**
 * Class "Main" shows program work
 *
 * @version 1.0 Reborn 05.10.2021
 * @author Igor Kolesov PIN-23
 */

public class Main {

    /**aquariumAviaries - keeps data about Waterfowl position(in witch aquarium in witch place)*/
    private static Waterfowl[][] aquariumAviaries;
    /**ithGridAviaries - keeps data about Bird position(in witch aviary in witch place)*/
    private static Bird[][] withGridAviaries;
    /**withoutGridAviaries - keeps data about Ungulate position(in witch aviary in witch place)*/
    private static Ungulate[][] withoutGridAviaries;
    /**withInfraredLightAviaries - keeps data about Coldblooded position(in witch aviary in witch place)*/
    private static ColdBlooded[][] withInfraredLightAviaries;

    /**shows information*/
    static void view(String line){
        System.out.println(line);
    }
    /**shows all data*/
    static void viewAllData(){
        //shows waterfowls places
        view("Aquarium aviaries: ");
        for(int i=0;i< aquariumAviaries.length;i++){
            view((i+1) +" aquarium: ");
            for(int j=0;j<aquariumAviaries[i].length;j++) {
                if (aquariumAviaries[i][j] != null) {
                    view(aquariumAviaries[i][j].toString());
                }
                else view("empty place");
            }
        }
        view("\n----------------------------------------------------\n");
        //shows Birds places
        view("With grid aviaries: ");
        for(int i=0;i< withGridAviaries.length;i++){
            view((i+1) +" with grid aviary: ");
            for(int j=0;j<withGridAviaries[i].length;j++){
                if (withGridAviaries[i][j] != null) {
                    view(withGridAviaries[i][j].toString());
                }
                else view("empty place");
            }
        }
        view("\n----------------------------------------------------\n");

        //shows Ungulates places
        view("Without grid aviaries: ");
        for(int i=0;i< withoutGridAviaries.length;i++){
            view((i+1) +" without grid aviary: ");
            for(int j=0;j< withoutGridAviaries[i].length;j++){
                if (withoutGridAviaries[i][j] != null) {
                    view(withoutGridAviaries[i][j].toString());
                }
                else view("empty place");
            }
        }
        view("\n----------------------------------------------------\n");
        //shows ColdBloodeds places
        view("With infrared light aviaries: ");
        for(int i=0;i< withInfraredLightAviaries.length;i++){
            view((i+1) +" with infrared light aviary: ");
            for(int j=0;j< withInfraredLightAviaries[i].length;j++){
                if (withInfraredLightAviaries[i][j] != null) {
                    view(withInfraredLightAviaries[i][j].toString());
                }
                else view("empty place");
            }
        }
        view("\n----------------------------------------------------\n");
    }
    /**shows menu*/
    static void viewMenu(){
        view("\n----------------------------------------------------\n");
        view("\tMenu of base: ");
        view("1 -> Load something from File");
        view("2 -> Add new animal to it's aviary");
        view("3 -> Delete animal from it's aviary");
        view("4 -> Change animal's data");
        view("5 -> Save something to File");
        view("6 -> View all data");
        view("7 -> End program");
    }

    /**saving waterfowls to file*/
    static void SaveWaterfowlsToFile(String filename) throws IOException {
        try {
            File saveWaterfowlsFile = new File(filename);
            if (!saveWaterfowlsFile.exists())
                saveWaterfowlsFile.createNewFile();
            PrintWriter pw = new PrintWriter(saveWaterfowlsFile);
            pw.println(aquariumAviaries.length);
            for (int i = 0; i < aquariumAviaries.length; i++) {
                pw.println(aquariumAviaries[i].length);
                for (int j = 0; j < aquariumAviaries[i].length; j++) {
                    if (aquariumAviaries[i][j] != null)
                        pw.println(aquariumAviaries[i][j].toShortString());
                    else pw.println("empty place");
                }
            }
            pw.println("END");
            pw.close();
        } catch (IOException e) {
            view("Error -> " + e);
        }
    }
    /**saving Birds to file*/
    static void SaveBirdsToFile(String filename) throws IOException{
        try {
            File saveBirdsFile = new File(filename);
            if (!saveBirdsFile.exists())
                saveBirdsFile.createNewFile();
            PrintWriter pw = new PrintWriter(saveBirdsFile);
            pw.println(withGridAviaries.length);
            for (int i = 0; i < withGridAviaries.length; i++) {
                pw.println(withGridAviaries[i].length);
                for (int j = 0; j < withGridAviaries[i].length; j++) {
                    if (withGridAviaries[i][j] != null)
                        pw.println(withGridAviaries[i][j].toShortString());
                    else pw.println("empty place");
                }
            }
            pw.println("END");
            pw.close();
        } catch (IOException e){
                view("Error -> "+e);
            }
        }
    /**saving Ungulates to file*/
    static void SaveUngulatesToFile(String filename) throws IOException {
        try {
            File saveUngulatesFile = new File(filename);
            if (!saveUngulatesFile.exists())
                saveUngulatesFile.createNewFile();
            PrintWriter pw = new PrintWriter(saveUngulatesFile);
            pw.println(withoutGridAviaries.length);
            for (int i = 0; i < withoutGridAviaries.length; i++) {
                pw.println(withoutGridAviaries[i].length);
                for (int j = 0; j < withoutGridAviaries[i].length; j++) {
                    if (withoutGridAviaries[i][j] != null)
                        pw.println(withoutGridAviaries[i][j].toShortString());
                    else pw.println("empty place");
                }
            }
            pw.println("END");
            pw.close();
        } catch (IOException e) {
            view("Error -> " + e);
        }
    }
    /**saving ColdBloodeds to file*/
    static void SaveColdBloodedsToFile(String filename) throws IOException{
        try {
            File saveColdBloodedsFile = new File(filename);
            if(!saveColdBloodedsFile.exists())
                saveColdBloodedsFile.createNewFile();
            PrintWriter pw = new PrintWriter(saveColdBloodedsFile);
            pw.println(withInfraredLightAviaries.length);
            for(int i=0; i<withInfraredLightAviaries.length;i++) {
                pw.println(withInfraredLightAviaries[i].length);
                for (int j = 0; j < withInfraredLightAviaries[i].length; j++) {
                    if (withInfraredLightAviaries[i][j] != null)
                        pw.println(withInfraredLightAviaries[i][j].toShortString());
                    else pw.println("empty place");
                }
            }
            pw.println("END");
            pw.close();
        } catch (IOException e){
            view("Error -> "+e);
        }
    }
    /**saving all to file*/
    static void SaveAllDataToFiles(String filename1, String filename2, String filename3, String filename4){
        try{
            SaveWaterfowlsToFile(filename1);
            SaveBirdsToFile(filename2);
            SaveUngulatesToFile(filename3);
            SaveColdBloodedsToFile(filename4);

        } catch (IOException e) {
            view("Error -> " + e);
        }
    }

    /**load waterfowls from file*/
    static void LoadWaterfowlsFromFile(String filename) throws IOException{
        try {
            String line;
            BufferedReader br = new BufferedReader((new FileReader(filename)));
            line = br.readLine();
            aquariumAviaries = new Waterfowl[Integer.parseInt(line)][];
            for (int i = 0; i < aquariumAviaries.length ; i++) {
                line = br.readLine();
                aquariumAviaries[i] = new Waterfowl[Integer.parseInt(line)];
                for (int j = 0; j < aquariumAviaries[i].length; j++) {
                    aquariumAviaries[i][j] = new Waterfowl();
                    line = br.readLine();
                    if (line.equals("empty place")) {
                        aquariumAviaries[i][j] = null;
                    }
                    else {
                        String[] parsedLine = line.split("\\s");
                        aquariumAviaries[i][j].nickname = parsedLine[0];
                        aquariumAviaries[i][j].weight = Double.parseDouble(parsedLine[1]);
                        aquariumAviaries[i][j].age = Integer.parseInt(parsedLine[2]);
                        aquariumAviaries[i][j].aviary = Animals.aviaryValue.aquarium;
                    }
                }
            }
        }catch (IOException e){
            view("Error - > e");
        }
    }
    /**load Birds from file*/
    static void LoadBirdsFromFile(String filename) throws IOException{
        try {
            String line;
            BufferedReader br = new BufferedReader((new FileReader(filename)));
            line = br.readLine();
            withGridAviaries = new Bird[Integer.parseInt(line)][];
            for (int i = 0; i < withGridAviaries.length ; i++) {
                line = br.readLine();
                withGridAviaries[i] = new Bird[Integer.parseInt(line)];
                for (int j = 0; j < withGridAviaries[i].length; j++) {
                    withGridAviaries[i][j] = new Bird();
                    line = br.readLine();
                    if (line.equals("empty place")) {
                        withGridAviaries[i][j] = null;
                    }
                    else {
                        String[] parsedLine = line.split("\\s");
                        withGridAviaries[i][j].nickname = parsedLine[0];
                        withGridAviaries[i][j].weight = Double.parseDouble(parsedLine[1]);
                        withGridAviaries[i][j].age = Integer.parseInt(parsedLine[2]);
                        withGridAviaries[i][j].aviary = Animals.aviaryValue.aviaryWithGrid;
                    }
                }
            }
        }catch (IOException e){
            view("Error - > e");
        }
    }
    /**load Ungulates from file*/
    static void LoadUngulatesFromFile(String filename) throws IOException{
        try {
            String line;
            BufferedReader br = new BufferedReader((new FileReader(filename)));
            line = br.readLine();
            withoutGridAviaries = new Ungulate[Integer.parseInt(line)][];
            for (int i = 0; i < withoutGridAviaries.length ; i++) {
                line = br.readLine();
                withoutGridAviaries[i] = new Ungulate[Integer.parseInt(line)];
                for (int j = 0; j < withoutGridAviaries[i].length; j++) {
                    withoutGridAviaries[i][j] = new Ungulate();
                    line = br.readLine();
                    if (line.equals("empty place")) {
                        withoutGridAviaries[i][j] = null;
                    }
                    else {
                        String[] parsedLine = line.split("\\s");
                        withoutGridAviaries[i][j].nickname = parsedLine[0];
                        withoutGridAviaries[i][j].weight = Double.parseDouble(parsedLine[1]);
                        withoutGridAviaries[i][j].age = Integer.parseInt(parsedLine[2]);
                        withoutGridAviaries[i][j].aviary = Animals.aviaryValue.aviaryWithoutGrid;
                    }
                }
            }
        }catch (IOException e){
            view("Error - > e");
        }
    }
    /**load ColdBloodeds from file*/
    static void LoadColdBloodedsFromFile(String filename) throws IOException{
        try {
            String line;
            BufferedReader br = new BufferedReader((new FileReader(filename)));
            line = br.readLine();
            withInfraredLightAviaries = new ColdBlooded[Integer.parseInt(line)][];
            for (int i = 0; i < withInfraredLightAviaries.length ; i++) {
                line = br.readLine();
                withInfraredLightAviaries[i] = new ColdBlooded[Integer.parseInt(line)];
                for (int j = 0; j < withInfraredLightAviaries[i].length; j++) {
                    withInfraredLightAviaries[i][j] = new ColdBlooded();
                    line = br.readLine();
                    if (line.equals("empty place")) {
                        withInfraredLightAviaries[i][j] = null;
                    }
                    else {
                        String[] parsedLine = line.split("\\s");
                        withInfraredLightAviaries[i][j].nickname = parsedLine[0];
                        withInfraredLightAviaries[i][j].weight = Double.parseDouble(parsedLine[1]);
                        withInfraredLightAviaries[i][j].age = Integer.parseInt(parsedLine[2]);
                        withInfraredLightAviaries[i][j].aviary = Animals.aviaryValue.aviaryWithInfraredLight;
                    }
                }
            }
        }catch (IOException e){
            view("Error - > e");
        }
    }
    /**load all from file*/
    static void LoadAllDataFromFiles(String filename1, String filename2, String filename3, String filename4){
        try {
            LoadWaterfowlsFromFile(filename1);
            LoadBirdsFromFile(filename2);
            LoadUngulatesFromFile(filename3);
            LoadColdBloodedsFromFile(filename4);
        } catch (IOException e){
            view("Error -> "+e);
        }
    }

    /**load config and starts program*/
    static void LoadSettingsAndStartProgram(Scanner in, PrintWriter pw) throws Exception {
        pw.println("Program start -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        Properties props = new Properties();
        Preloader settings = new Preloader("Settings.ini", props);
        view("Hello, "+props.getProperty("Login")+"! It is zoo's DataBase!");
        view("\n----------------------------------------------------\n");
        view("Input your password: ");
        while(true) {
            if (in.next().equals(props.getProperty("Password"))){
                view("Correct password! User type is -> " + props.getProperty("UserType"));
                pw.println("User login -> "+ props.getProperty("Login"));
                break;
            } else {
                view("Incorrect password :(  Try again: ");
                pw.println("Error: incorrect password -> "+LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
            }
        }
    }
    /**function of loading data*/
    static void Fun1LoadSmthFromFile(Scanner in, PrintWriter pw)throws IOException{
        view("\n----------------------------------------------------\n");
        view("1 -> Load Waterfowls From File");
        view("2 -> Load Birds From File");
        view("3 -> Load Ungulates From File");
        view("4 -> Load ColdBloodeds From File");
        view("5 -> Load All Data From Files");
        view("Input digit from 1 to 5: ");
        int flag1=in.nextInt();
        if(flag1 == 1){
            LoadWaterfowlsFromFile("savedWaterfowlsData.txt");
            pw.println("LoadWaterfowlsFromFile -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        if(flag1 == 2){
            LoadBirdsFromFile("savedBirdsData.txt");
            pw.println("LoadBirdsFromFile -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        if(flag1 == 3){
            LoadUngulatesFromFile("savedUngulatesData.txt");
            pw.println("LoadUngulatesFromFile -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        if(flag1 == 4){
            LoadColdBloodedsFromFile("savedColdBloodedsData.txt");
            pw.println("LoadColdBloodedsFromFile -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        if(flag1 == 5){
            LoadAllDataFromFiles("savedWaterfowlsData.txt", "savedBirdsData.txt","savedUngulatesData.txt","savedColdBloodedsData.txt");
            pw.println("LoadAllDataFromFiles -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
    }
    /**function to add new animal*/
    static void Fun2AddNewAnimal(Scanner in, PrintWriter pw){
        view("\n----------------------------------------------------\n");
        view("Input animal's nickname: ");
        String name = in.next();
        view("Input animal's weight: ");
        double weight = in.nextDouble();
        view("Input animal's age: ");
        int age = in.nextInt();
        view("Input animal's aviary: ");
        view("1 -> aquarium");
        view("2 -> aviaryWithGrid");
        view("3 -> aviaryWithoutGrid");
        view("4 -> aviaryWithInfraredLight");
        int typeOfAviary = in.nextInt();
        Boolean end=false;
        if(typeOfAviary==1){
            for(int i=0; i< aquariumAviaries.length;i++){
                for(int j=0;j<aquariumAviaries[i].length;j++){
                    if(aquariumAviaries[i][j]==null){
                        aquariumAviaries[i][j]=new Waterfowl(name, weight,age);
                        view("Animal added to aquariumAviaries at "+(i+1)+" cage at "+(j+1)+" place!");
                        pw.println("Animal added to aquariumAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
                        end=true;
                    }
                    if(end) break;
                    else if(i==aquariumAviaries.length-1 && j== aquariumAviaries[i].length-1){
                        view("No empty place in zoo's aquariumAviaries!");
                    }
                }
                if(end) break;
            }
        }
        else if(typeOfAviary==2){
            for(int i=0; i< withGridAviaries.length;i++){
                for(int j=0;j< withGridAviaries[i].length;j++){
                    if(withGridAviaries[i][j]==null){
                        withGridAviaries[i][j]=new Bird(name, weight,age);
                        view("Animal added to withGridAviaries at "+(i+1)+" cage at "+(j+1)+" place!");
                        pw.println("Animal added to withGridAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
                        end=true;
                    }
                    if(end) break;
                    else if(i==withGridAviaries.length-1 && j== withGridAviaries[i].length-1){
                        view("No empty place in zoo's withGridAviaries!");
                    }
                }
                if(end) break;
            }
        }
        else if(typeOfAviary==3){
            for(int i=0; i< withoutGridAviaries.length;i++){
                for(int j=0;j< withoutGridAviaries[i].length;j++){
                    if(withoutGridAviaries[i][j]==null){
                        withoutGridAviaries[i][j]=new Ungulate(name, weight,age);
                        view("Animal added to withoutGridAviaries at "+(i+1)+" cage at "+(j+1)+" place!");
                        pw.println("Animal added to withoutGridAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
                        end=true;
                    }
                    if(end) break;
                    else if(i==withoutGridAviaries.length-1 && j== withoutGridAviaries[i].length-1){
                        view("No empty place in zoo's withoutGridAviaries!");
                    }
                }
                if(end) break;
            }
        }
        else if(typeOfAviary==4){
            for(int i=0; i< withInfraredLightAviaries.length;i++){
                for(int j=0;j< withInfraredLightAviaries[i].length;j++){
                    if(withInfraredLightAviaries[i][j]==null){
                        withInfraredLightAviaries[i][j]=new ColdBlooded(name, weight,age);
                        view("Animal added to withInfraredLightAviaries at "+(i+1)+" cage at "+(j+1)+" place!");
                        pw.println("Animal added to withInfraredLightAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
                        end=true;
                    }
                    if(end) break;
                    else if(i==withInfraredLightAviaries.length-1 && j== withInfraredLightAviaries[i].length-1){
                        view("No empty place in zoo's withInfraredLightAviaries!");
                    }
                }
                if(end) break;
            }
        }
    }
    /**function to delete new animal*/
    static void Fun3DeleteAnimal(Scanner in, PrintWriter pw) {
        view("\n----------------------------------------------------\n");
        view("Input animal's aviary: ");
        view("1 -> aquarium");
        view("2 -> aviaryWithGrid");
        view("3 -> aviaryWithoutGrid");
        view("4 -> aviaryWithInfraredLight");
        int typeOfAviary = in.nextInt();
        view("Input cage's number: ");
        int i = in.nextInt()-1;
        view("Input place's number: ");
        int j = in.nextInt()-1;
        if (typeOfAviary == 1) {
            view("Delete this animal at cage " + (i+1) + " place " + (j+1) + "?");
            view(aquariumAviaries[i][j].toString());
            view("1 -> yes | 2 -> no");
            if (in.nextInt() == 1) {
                aquariumAviaries[i][j] = null;
                view("Animal deleted!");
                pw.println("Animal deleted from aquariumAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
            }
        } else if (typeOfAviary == 2) {
            view("Delete this animal at cage " + (i+1) + " place " + (j+1) + "?");
            view(withGridAviaries[i][j].toString());
            view("1 -> yes | 2 -> no");
            if (in.nextInt() == 1) {
                withGridAviaries[i][j] = null;
                view("Animal deleted!");
                pw.println("Animal deleted from withGridAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
            }
        } else if (typeOfAviary == 3) {
            view("Delete this animal at cage " + (i+1) + " place " + (j+1) + "?");
            view(withoutGridAviaries[i][j].toString());
            view("1 -> yes | 2 -> no");
            if (in.nextInt() == 1) {
                withoutGridAviaries[i][j] = null;
                view("Animal deleted!");
                pw.println("Animal deleted from withoutGridAviaries -> " + LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
            }
        } else if (typeOfAviary == 4) {
                view("Delete this animal at cage " + (i+1) + " place " + (j+1) + "?");
                view(withInfraredLightAviaries[i][j].toString());
                view("1 -> yes | 2 -> no");
                if (in.nextInt() == 1) {
                    withInfraredLightAviaries[i][j] = null;
                    view("Animal deleted!");
                    pw.println("Animal deleted from withInfraredLightAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
                }
            }
        }
    /**function to change animal data*/
    static void Fun4ChangeAnimalData(Scanner in, PrintWriter pw){
        view("\n----------------------------------------------------\n");
        view("Input animal's aviary: ");
        view("1 -> aquarium");
        view("2 -> aviaryWithGrid");
        view("3 -> aviaryWithoutGrid");
        view("4 -> aviaryWithInfraredLight");
        int typeOfAviary = in.nextInt();
        view("Input cage's number: " );
        int i = in.nextInt()-1;
        view("Input place's number: ");
        int j = in.nextInt()-1;
        view("Change animal's data at cage "+i+" place "+j);
        view("Available changes: ");
        view("1 -> change nickname");
        view("2 -> change weight");
        view("3 -> change age");
        view("4 -> Cancel");
        view("Input needed digit: ");
        int flag4=in.nextInt();
        if(typeOfAviary==1){
            if(flag4==1){
                view("Input new nickname: ");
                aquariumAviaries[i][j].nickname=in.next();
                view(aquariumAviaries[i][j].toString());
            }
            else if(flag4==2){
                view("Input new weight: ");
                aquariumAviaries[i][j].weight=in.nextDouble();
                view(aquariumAviaries[i][j].toString());
            }
            else if(flag4==3){
                view("Input new age: ");
                aquariumAviaries[i][j].age=in.nextInt();
                view(aquariumAviaries[i][j].toString());
            }
            pw.println("Animal data changed in aquariumAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        else if(typeOfAviary==2){
            if(flag4==1){
                view("Input new nickname: ");
                withGridAviaries[i][j].nickname=in.next();
                view(withGridAviaries[i][j].toString());
            }
            else if(flag4==2){
                view("Input new weight: ");
                withGridAviaries[i][j].weight=in.nextDouble();
                view(withGridAviaries[i][j].toString());
            }
            else if(flag4==3){
                view("Input new age: ");
                withGridAviaries[i][j].age=in.nextInt();
                view(withGridAviaries[i][j].toString());
            }
            pw.println("Animal data changed in withGridAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        else if(typeOfAviary==3) {
            if(flag4==1){
                view("Input new nickname: ");
                withoutGridAviaries[i][j].nickname=in.next();
                view(withoutGridAviaries[i][j].toString());
            }
            else if(flag4==2){
                view("Input new weight: ");
                withoutGridAviaries[i][j].weight=in.nextDouble();
                view(withoutGridAviaries[i][j].toString());
            }
            else if(flag4==3){
                view("Input new age: ");
                withoutGridAviaries[i][j].age=in.nextInt();
                view(withoutGridAviaries[i][j].toString());
            }
            pw.println("Animal data changed in withoutGridAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }

        else if(typeOfAviary==4){
            if(flag4==1){
                view("Input new nickname: ");
                withInfraredLightAviaries[i][j].nickname=in.next();
                view(withInfraredLightAviaries[i][j].toString());
            }
            else if(flag4==2){
                view("Input new weight: ");
                withInfraredLightAviaries[i][j].weight=in.nextDouble();
                view(withInfraredLightAviaries[i][j].toString());
            }
            else if(flag4==3){
                view("Input new age: ");
                withInfraredLightAviaries[i][j].age=in.nextInt();
                view(withInfraredLightAviaries[i][j].toString());
            }
            pw.println("Animal data changed in withoutGridAviaries -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
    }
    /**function of saving data*/
    static void Fun5SaveSmthToFile(Scanner in, PrintWriter pw)throws IOException{
        view("\n----------------------------------------------------\n");
        view("1 -> Save Waterfowls To File");
        view("2 -> Save Birds To File");
        view("3 -> Save Ungulates To File");
        view("4 -> Save ColdBloodeds To File");
        view("5 -> Save All Data To Files");
        int flag5=in.nextInt();
        if(flag5 == 1){
            SaveWaterfowlsToFile("savedWaterfowlsData.txt");
            pw.println("SaveWaterfowlsToFile -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        if(flag5 == 2){
            SaveBirdsToFile("savedBirdsData.txt");
            pw.println("SaveBirdsToFile -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        if(flag5 == 3){
            SaveUngulatesToFile("savedUngulatesData.txt");
            pw.println("SaveUngulatesToFile -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        if(flag5 == 4){
            SaveColdBloodedsToFile("savedColdBloodedsData.txt");
            pw.println("SaveColdBloodedsToFile -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
        if(flag5 == 5){
            SaveAllDataToFiles("savedWaterfowlsData.txt", "savedBirdsData.txt","savedUngulatesData.txt","savedColdBloodedsData.txt");
            pw.println("SaveAllDataToFiles -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
        }
    }

    //all program
    static void controller() throws Exception {
        PrintWriter pw = new PrintWriter("LogData.txt");
        Scanner in = new Scanner(System.in);
        LoadSettingsAndStartProgram(in,pw);
        viewMenu();
        int flag=0;
        while(flag!=7){
            view("\n----------------------------------------------------\n");
            view("Input case value from 1 to 7: ");
            flag = in.nextInt();
            if(flag==1) Fun1LoadSmthFromFile(in,pw);
            else if(flag==2) Fun2AddNewAnimal(in,pw);
            else if(flag==3) Fun3DeleteAnimal(in,pw);
            else if(flag==4) Fun4ChangeAnimalData(in,pw);
            else if(flag==5) Fun5SaveSmthToFile(in,pw);
            else if(flag==6) viewAllData();
            else if(flag==7) {
                pw.println("Program end -> "+ LocalTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
            }
        }
        pw.close();
    }

    //main
    public static void main(String[] args){
        try {
            controller();
        } catch(Exception e){
            view("Error -> "+e);
        }
    }
}
