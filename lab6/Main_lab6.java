package lab6;


import javax.swing.*;
import java.awt.*;

/**
 * Class "Main" shows program work
 *
 * @version 1.0 26.12.2022
 * @author Islamov Radmir PIN-23
 */

public class Main_lab6 {
    private static FrameLab6 frameLab6;
    private static JLabel intro;
    private static JLabel info1;
    private static JLabel info2;
    private static JLabel textBox;
    private static JLabel MedianTime;

    static void model()
    {
        frameLab6 = new FrameLab6();
        intro = new JLabel("Islamov Radmir Lab 6");
        info1 = new JLabel("Введите символлы, чтобы посчитать скорость ввода");
        info2 = new JLabel("Чтобы осуществеить проверку нажмите кнопку \"Stop\"");
        textBox = new JLabel("TextBox: ");
        MedianTime = new JLabel("Среднее время ввода: ");
    }
    static void view(String s){System.out.println(s);}
    static void controller()
    {
        frameLab6.add(intro,new GridBagConstraints(0,0,3,1,0.0,0.9,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0,0));
        frameLab6.add(info1,new GridBagConstraints(0,1,3,1,0.0,0.9,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0,0));
        frameLab6.add(info2,new GridBagConstraints(0,2,3,1,0.0,0.9,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0,0));
        frameLab6.add(textBox,new GridBagConstraints(0,6,1,1,0.0,0.9,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0,0));
        frameLab6.add(MedianTime,new GridBagConstraints(0,7,2,1,0.0,0.9,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0,0));
        frameLab6.pack();
    }
    public static void main(String[] args){
        model();
        controller();
        view("end");
    }
}
