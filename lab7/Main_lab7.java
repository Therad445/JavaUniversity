package lab7;

/**
 * Class "Main" shows program work
 *
 * @version 1.0 Reborn 20.12.2022
 * @author Islamov Radmir PIN-23
 */

public class Main_lab7 {

    private static FramePingPong game;

    static void modelDefineGame(){
        game = new FramePingPong();
    }
    static void view(String msg){
        System.out.println(msg);
    }
    static void controller(){
        view("Preparing to start...");
        modelDefineGame();
        view("End!");
    }
    public static void main(String[] args){
        controller();
    }
}
