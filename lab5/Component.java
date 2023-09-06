package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Component extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        /**begin of graphic 1*/
        //field of graphic 1
        Rectangle2D graph1 = new Rectangle2D.Double(10, 10, 620, 620);
        //main lines
        Line2D lineTime1 = new Line2D.Double(60, 30, 60, 600);
        Line2D lineCount1 = new Line2D.Double(60, 600, 600, 600);
        //arrow for Time and Count
        Line2D arrowTime1left = new Line2D.Double(60, 30, 50, 40);
        Line2D arrowTime1right = new Line2D.Double(60, 30, 70, 40);
        Line2D arrowCount1left = new Line2D.Double(600, 600, 590, 590);
        Line2D arrowCount1right = new Line2D.Double(600, 600, 590, 610);
        //main points at line Time and Count
        Line2D time1000 = new Line2D.Double(55, 600 - 57, 65, 600 - 57);
        Line2D time2000 = new Line2D.Double(55, 600 - 57 * 2, 65, 600 - 57 * 2);
        Line2D time3000 = new Line2D.Double(55, 600 - 57 * 3, 65, 600 - 57 * 3);
        Line2D time4000 = new Line2D.Double(55, 600 - 57 * 4, 65, 600 - 57 * 4);
        Line2D time5000 = new Line2D.Double(55, 600 - 57 * 5, 65, 600 - 57 * 5);
        Line2D time6000 = new Line2D.Double(55, 600 - 57 * 6, 65, 600 - 57 * 6);
        Line2D time7000 = new Line2D.Double(55, 600 - 57 * 7, 65, 600 - 57 * 7);
        Line2D time8000 = new Line2D.Double(55, 600 - 57 * 8, 65, 600 - 57 * 8);
        Line2D time9000 = new Line2D.Double(55, 600 - 57 * 8.8, 65, 600 - 57 * 8.8);
        Line2D time10000 = new Line2D.Double(55, 600 - 57 * 9.5, 65, 600 - 57 * 9.5);
        Line2D point10 = new Line2D.Double(60 + 54, 595, 60 + 54, 605);
        Line2D point100 = new Line2D.Double(60 + 54 * 3, 595, 60 + 54 * 3, 605);
        Line2D point1000 = new Line2D.Double(60 + 54 * 5, 595, 60 + 54 * 5, 605);
        Line2D point10000 = new Line2D.Double(60 + 54 * 7, 595, 60 + 54 * 7, 605);
        Line2D point100000 = new Line2D.Double(60 + 54 * 9, 595, 60 + 54 * 9, 605);
        //Array Add Median time points and graphic
        Ellipse2D ArrAddMedian10 = new Ellipse2D.Double(60 + 54 - 2, 600 - 57 - 57 * 3 / 4 - 2, 4, 4);    //1790
        Ellipse2D ArrAddMedian100 = new Ellipse2D.Double(60 + 54 * 3 - 2, 600 - 57 - 6 - 2, 4, 4);      //1160
        Ellipse2D ArrAddMedian1000 = new Ellipse2D.Double(60 + 54 * 5 - 2, 600 - 57 * 3 / 4 - 2, 4, 4);   //687
        Ellipse2D ArrAddMedian10000 = new Ellipse2D.Double(60 + 54 * 7 - 2, 600 - 57 * 1 / 4 - 2, 4, 4);  //291
        Ellipse2D ArrAddMedian100000 = new Ellipse2D.Double(60 + 54 * 9 - 2, 600 - 57 * 1 / 10 - 2, 4, 4);//84
        Line2D ArrAddMed10to100 = new Line2D.Double(60 + 54, 600 - 57 - 57 * 3 / 4, 60 + 54 * 3, 600 - 57 - 6);
        Line2D ArrAddMed100to1000 = new Line2D.Double(60 + 54 * 3, 600 - 57 - 6, 60 + 54 * 5, 600 - 57 * 3 / 4);
        Line2D ArrAddMed1000to10000 = new Line2D.Double(60 + 54 * 5, 600 - 57 * 3 / 4, 60 + 54 * 7, 600 - 57 * 1 / 4);
        Line2D ArrAddMed10000to100000 = new Line2D.Double(60 + 54 * 7, 600 - 57 * 1 / 4, 60 + 54 * 9, 600 - 57 * 1 / 10);
        //Linked Add Median time points and graphic
        Ellipse2D LinkAddMedian10 = new Ellipse2D.Double(60 + 54 - 2, 600 - 57 - 6 - 2, 4, 4);       //1160
        Ellipse2D LinkAddMedian100 = new Ellipse2D.Double(60 + 54 * 3 - 2, 600 - 57 * 3 / 4 - 2, 4, 4);  //637
        Ellipse2D LinkAddMedian1000 = new Ellipse2D.Double(60 + 54 * 5 - 2, 600 - 57 / 2 - 2, 4, 4);   //490
        Ellipse2D LinkAddMedian10000 = new Ellipse2D.Double(60 + 54 * 7 - 2, 600 - 57 / 5 - 2, 4, 4);  //194
        Ellipse2D LinkAddMedian100000 = new Ellipse2D.Double(60 + 54 * 9 - 2, 600 - 57 / 20 - 2, 4, 4);//51
        Line2D LinkAddMed10to100 = new Line2D.Double(60 + 54, 600 - 57 - 6, 60 + 54 * 3, 600 - 57 * 3 / 4);
        Line2D LinkAddMed100to1000 = new Line2D.Double(60 + 54 * 3, 600 - 57 * 3 / 4, 60 + 54 * 5, 600 - 57 / 2);
        Line2D LinkAddMed1000to10000 = new Line2D.Double(60 + 54 * 5, 600 - 57 / 2, 60 + 54 * 7, 600 - 57 / 5);
        Line2D LinkAddMed10000to100000 = new Line2D.Double(60 + 54 * 7, 600 - 57 / 5, 60 + 54 * 9, 600 - 57 / 20);
        //Array Remove Median time points and graphic
        Ellipse2D ArrRemMedian10 = new Ellipse2D.Double(60 + 54 - 2, 600 - 57 * 10.3 - 2, 4, 4);         //73700
        Ellipse2D ArrRemMedian100 = new Ellipse2D.Double(60 + 54 * 3 - 2, 600 - 57 * 9 - 2, 4, 4);        //9150
        Ellipse2D ArrRemMedian1000 = new Ellipse2D.Double(60 + 54 * 5 - 2, 600 - 57 * 6 - 57 / 4 - 2, 4, 4);  //6222
        Ellipse2D ArrRemMedian10000 = new Ellipse2D.Double(60 + 54 * 7 - 2, 600 - 57 * 2 - 1 - 2, 4, 4);    //2005
        Ellipse2D ArrRemMedian100000 = new Ellipse2D.Double(60 + 54 * 9 - 2, 600 - 57 * 4 - 57 / 2 - 2, 4, 4);//4446
        Line2D ArrRemMed10to100 = new Line2D.Double(60 + 54, 600 - 57 * 10.3, 60 + 54 * 3, 600 - 57 * 9);
        Line2D ArrRemMed100to1000 = new Line2D.Double(60 + 54 * 3, 600 - 57 * 9, 60 + 54 * 5, 600 - 57 * 6 - 57 / 4);
        Line2D ArrRemMed1000to10000 = new Line2D.Double(60 + 54 * 5, 600 - 57 * 6 - 57 / 4, 60 + 54 * 7, 600 - 57 * 2 - 1);
        Line2D ArrRemMed10000to100000 = new Line2D.Double(60 + 54 * 7, 600 - 57 * 2 - 1, 60 + 54 * 9, 600 - 57 * 4 - 57 / 2);
        //Linked Remove Median time points and graphic
        Ellipse2D LinkRemMedian10 = new Ellipse2D.Double(60 + 54 - 2, 600 - 57 * 10.2 - 2, 4, 4);        //18100
        Ellipse2D LinkRemMedian100 = new Ellipse2D.Double(60 + 54 * 3 - 2, 600 - 57 * 9.9 - 2 - 2, 4, 4);   //127000
        Ellipse2D LinkRemMedian1000 = new Ellipse2D.Double(60 + 54 * 5 - 2, 600 - 57 * 7 - 57 / 8 - 2, 4, 4);    //7150
        Ellipse2D LinkRemMedian10000 = new Ellipse2D.Double(60 + 54 * 7 - 2, 600 - 57 + 57 / 4 - 2, 4, 4);   //780
        Ellipse2D LinkRemMedian100000 = new Ellipse2D.Double(60 + 54 * 9 - 2, 600 - 57 * 5 + 5 - 2, 4, 4); //4941
        Line2D LinkRemMed10to100 = new Line2D.Double(60 + 54, 600 - 57 * 10.2, 60 + 54 * 3, 600 - 57 * 9.9 - 2);
        Line2D LinkRemMed100to1000 = new Line2D.Double(60 + 54 * 3, 600 - 57 * 9.9 - 2, 60 + 54 * 5, 600 - 57 * 7 - 57 / 8);
        Line2D LinkRemMed1000to10000 = new Line2D.Double(60 + 54 * 5, 600 - 57 * 7 - 57 / 8, 60 + 54 * 7, 600 - 57 + 57 / 4);
        Line2D LinkRemMed10000to100000 = new Line2D.Double(60 + 54 * 7, 600 - 57 + 57 / 4, 60 + 54 * 9, 600 - 57 * 5 + 5);
        //drawing all components
        g2.draw(graph1);
        g2.draw(lineTime1);
        g2.drawString("Time", 30, 30);
        g2.draw(lineCount1);
        g2.drawString("Count", 590, 620);
        g2.draw(arrowTime1left);
        g2.draw(arrowTime1right);
        g2.draw(arrowCount1left);
        g2.draw(arrowCount1right);
        g2.draw(point10);
        g2.draw(point100);
        g2.draw(point1000);
        g2.draw(point10000);
        g2.draw(point100000);
        g2.drawString("10", 60 + 54 - 10, 605 + 15);
        g2.drawString("100", 60 + 54 * 3 - 10, 605 + 15);
        g2.drawString("1000", 60 + 54 * 5 - 10, 605 + 15);
        g2.drawString("10000", 60 + 54 * 7 - 10, 605 + 15);
        g2.drawString("100000", 60 + 54 * 9 - 10, 605 + 15);
        g2.draw(time1000);
        g2.draw(time2000);
        g2.draw(time3000);
        g2.draw(time4000);
        g2.draw(time5000);
        g2.draw(time6000);
        g2.draw(time7000);
        g2.draw(time8000);
        g2.draw(time9000);
        g2.draw(time10000);
        g2.drawString("1000", 55 - 40, 600 - 57 + 10);
        g2.drawString("2000", 55 - 40, 600 - 57 * 2 + 10);
        g2.drawString("3000", 55 - 40, 600 - 57 * 3 + 10);
        g2.drawString("4000", 55 - 40, 600 - 57 * 4 + 10);
        g2.drawString("5000", 55 - 40, 600 - 57 * 5 + 10);
        g2.drawString("6000", 55 - 40, 600 - 57 * 6 + 10);
        g2.drawString("7000", 55 - 40, 600 - 57 * 7 + 10);
        g2.drawString("8000", 55 - 40, 600 - 57 * 8 + 10);
        g2.drawString("9000", 55 - 40, 600 - 57 * 9 + 20);
        g2.drawString("10000", 55 - 40, 600 - 57 * 10 + 30);
        g2.setColor(Color.RED);
        g2.drawString("Array Add Median time to count", 430, 25);
        g2.draw(ArrAddMedian10);
        g2.draw(ArrAddMedian100);
        g2.draw(ArrAddMedian1000);
        g2.draw(ArrAddMedian10000);
        g2.draw(ArrAddMedian100000);
        g2.draw(ArrAddMed10to100);
        g2.draw(ArrAddMed100to1000);
        g2.draw(ArrAddMed1000to10000);
        g2.draw(ArrAddMed10000to100000);
        g2.setColor(Color.BLUE);
        g2.drawString("Linked Add Median time to count", 430, 40);
        g2.draw(LinkAddMedian10);
        g2.draw(LinkAddMedian100);
        g2.draw(LinkAddMedian1000);
        g2.draw(LinkAddMedian10000);
        g2.draw(LinkAddMedian100000);
        g2.draw(LinkAddMed10to100);
        g2.draw(LinkAddMed100to1000);
        g2.draw(LinkAddMed1000to10000);
        g2.draw(LinkAddMed10000to100000);
        g2.setColor(Color.CYAN);
        g2.drawString("Array Remove Median time to count", 430, 55);
        g2.draw(ArrRemMedian10);
        g2.draw(ArrRemMedian100);
        g2.draw(ArrRemMedian1000);
        g2.draw(ArrRemMedian10000);
        g2.draw(ArrRemMedian100000);
        g2.draw(ArrRemMed10to100);
        g2.draw(ArrRemMed100to1000);
        g2.draw(ArrRemMed1000to10000);
        g2.draw(ArrRemMed10000to100000);
        g2.setColor(Color.GRAY);
        g2.drawString("Linked Remove Median time to count", 430, 70);
        g2.draw(LinkRemMedian10);
        g2.draw(LinkRemMedian100);
        g2.draw(LinkRemMedian1000);
        g2.draw(LinkRemMedian10000);
        g2.draw(LinkRemMedian100000);
        g2.draw(LinkRemMed10to100);
        g2.draw(LinkRemMed100to1000);
        g2.draw(LinkRemMed1000to10000);
        g2.draw(LinkRemMed10000to100000);
        /**end of graphic 1*/


        /**begin of graphic 2*/
        //field of graphic 2
        Rectangle2D graph2 = new Rectangle2D.Double(640, 10, 620, 620);
        //main lines
        Line2D lineTime2 = new Line2D.Double(60 + 630, 30, 60 + 630, 600);
        Line2D lineCount2 = new Line2D.Double(60 + 630, 600, 600 + 630, 600);
        //arrow for Time and Count
        Line2D arrowTime2left = new Line2D.Double(60 + 630, 30, 50 + 630, 40);
        Line2D arrowTime2right = new Line2D.Double(60 + 630, 30, 70 + 630, 40);
        Line2D arrowCount2left = new Line2D.Double(600 + 630, 600, 590 + 630, 590);
        Line2D arrowCount2right = new Line2D.Double(600 + 630, 600, 590 + 630, 610);
        //main points at line Time and Count
        Line2D time1m = new Line2D.Double(55 + 630, 600 - 38, 65 + 630, 600 - 38);
        Line2D time2m = new Line2D.Double(55 + 630, 600 - 38 * 2, 65 + 630, 600 - 38 * 2);
        Line2D time3m = new Line2D.Double(55 + 630, 600 - 38 * 3, 65 + 630, 600 - 38 * 3);
        Line2D time4m = new Line2D.Double(55 + 630, 600 - 38 * 4, 65 + 630, 600 - 38 * 4);
        Line2D time5m = new Line2D.Double(55 + 630, 600 - 38 * 5, 65 + 630, 600 - 38 * 5);
        Line2D time6m = new Line2D.Double(55 + 630, 600 - 38 * 6, 65 + 630, 600 - 38 * 6);
        Line2D time7m = new Line2D.Double(55 + 630, 600 - 38 * 7, 65 + 630, 600 - 38 * 7);
        Line2D time8m = new Line2D.Double(55 + 630, 600 - 38 * 8, 65 + 630, 600 - 38 * 8);
        Line2D time9m = new Line2D.Double(55 + 630, 600 - 38 * 9, 65 + 630, 600 - 38 * 9);
        Line2D time10m = new Line2D.Double(55 + 630, 600 - 38 * 10, 65 + 630, 600 - 38 * 10);
        Line2D time11m = new Line2D.Double(55 + 630, 600 - 38 * 11, 65 + 630, 600 - 38 * 11);
        Line2D time12m = new Line2D.Double(55 + 630, 600 - 38 * 12, 65 + 630, 600 - 38 * 12);
        Line2D timeSkip = new Line2D.Double(55 + 630, 600 - 38 * 13, 65 + 630, 600 - 38 * 13);
        Line2D time450m = new Line2D.Double(55 + 630, 600 - 38 * 14, 65 + 630, 600 - 38 * 14);
        Line2D time500m = new Line2D.Double(55 + 630, 600 - 38 * 14.7, 65 + 630, 600 - 38 * 14.7);
        Line2D point10sec = new Line2D.Double(60 + 54 + 630, 595, 60 + 54 + 630, 605);
        Line2D point100sec = new Line2D.Double(60 + 54 * 3 + 630, 595, 60 + 54 * 3 + 630, 605);
        Line2D point1000sec = new Line2D.Double(60 + 54 * 5 + 630, 595, 60 + 54 * 5 + 630, 605);
        Line2D point10000sec = new Line2D.Double(60 + 54 * 7 + 630, 595, 60 + 54 * 7 + 630, 605);
        Line2D point100000sec = new Line2D.Double(60 + 54 * 9 + 630, 595, 60 + 54 * 9 + 630, 605);
        //Array Add Total time points and graphic
        Ellipse2D ArrAddTotal10 = new Ellipse2D.Double(60 + 54 - 2 + 630, 600 - 38 * 2 / 100 - 2, 4, 4);    //17 900
        Ellipse2D ArrAddTotal100 = new Ellipse2D.Double(60 + 54 * 3 - 2 + 630, 600 - 38 * 1 / 10 - 2, 4, 4);      //116 000
        Ellipse2D ArrAddTotal1000 = new Ellipse2D.Double(60 + 54 * 5 - 2 + 630, 600 - 38 * 7 / 10 - 2, 4, 4);   //687 000
        Ellipse2D ArrAddTotal10000 = new Ellipse2D.Double(60 + 54 * 7 - 2 + 630, 600 - 38 * 29 / 10 - 2, 4, 4);  //2 910 000
        Ellipse2D ArrAddTotal100000 = new Ellipse2D.Double(60 + 54 * 9 - 2 + 630, 600 - 38 * 8.5 - 2, 4, 4);//8 400 000
        Line2D ArrAddTot10to100 = new Line2D.Double(60 + 54 + 630, 600 - 38 * 2 / 100, 60 + 54 * 3 + 630, 600 - 38 * 1 / 10);
        Line2D ArrAddTot100to1000 = new Line2D.Double(60 + 54 * 3 + 630, 600 - 38 * 1 / 10, 60 + 54 * 5 + 630, 600 - 38 * 7 / 10);
        Line2D ArrAddTot1000to10000 = new Line2D.Double(60 + 54 * 5 + 630, 600 - 38 * 7 / 10, 60 + 54 * 7 + 630, 600 - 38 * 29 / 10);
        Line2D ArrAddTot10000to100000 = new Line2D.Double(60 + 54 * 7 + 630, 600 - 38 * 29 / 10, 60 + 54 * 9 + 630, 600 - 38 * 8.5);
        //Linked Add Total time points and graphic
        Ellipse2D LinkAddTotal10 = new Ellipse2D.Double(60 + 54 - 2 + 630, 600 - 38 * 1 / 100 - 2, 4, 4);       //11 600
        Ellipse2D LinkAddTotal100 = new Ellipse2D.Double(60 + 54 * 3 - 2 + 630, 600 - 38 * 6 / 100 - 2, 4, 4);  //63 700
        Ellipse2D LinkAddTotal1000 = new Ellipse2D.Double(60 + 54 * 5 - 2 + 630, 600 - 38 / 2 - 2, 4, 4);   //490 000
        Ellipse2D LinkAddTotal10000 = new Ellipse2D.Double(60 + 54 * 7 - 2 + 630, 600 - 38 * 2 - 2, 4, 4);  //1 940 000
        Ellipse2D LinkAddTotal100000 = new Ellipse2D.Double(60 + 54 * 9 - 2 + 630, 600 - 38 * 5 - 2, 4, 4);//5 100 000
        Line2D LinkAddTotal10to100 = new Line2D.Double(60 + 54 + 630, 600 - 38 * 1 / 100, 60 + 54 * 3 + 630, 600 - 38 * 6 / 100);
        Line2D LinkAddTotal100to1000 = new Line2D.Double(60 + 54 * 3 + 630, 600 - 38 * 6 / 100, 60 + 54 * 5 + 630, 600 - 38 / 2);
        Line2D LinkAddTotal1000to10000 = new Line2D.Double(60 + 54 * 5 + 630, 600 - 38 / 2, 60 + 54 * 7 + 630, 600 - 38 * 2);
        Line2D LinkAddTotal10000to100000 = new Line2D.Double(60 + 54 * 7 + 630, 600 - 38 * 2, 60 + 54 * 9 + 630, 600 - 38 * 5);
        //Array Remove Median time points and graphic
        Ellipse2D ArrRemTotal10 = new Ellipse2D.Double(60 + 54 - 2 + 630, 600 - 38 * 74 / 100 - 2, 4, 4);        //737 000
        Ellipse2D ArrRemTotal100 = new Ellipse2D.Double(60 + 54 * 3 - 2 + 630, 600 - 38 * 9 / 10 - 2, 4, 4);        //915 000
        Ellipse2D ArrRemTotal1000 = new Ellipse2D.Double(60 + 54 * 5 - 2 + 630, 600 - 38 * 6.2 - 2, 4, 4);  //6 222 000
        Ellipse2D ArrRemTotal10000 = new Ellipse2D.Double(60 + 54 * 7 - 2 + 630, 600 - 38 * 13 - 2, 4, 4);    //20 050 000
        Ellipse2D ArrRemTotal100000 = new Ellipse2D.Double(60 + 54 * 9 - 2 + 630, 600 - 38 * 14 - 2, 4, 4);//444 600 000
        Line2D ArrRemTotal10to100 = new Line2D.Double(60 + 54 + 630, 600 - 38 * 74 / 100, 60 + 54 * 3 + 630, 600 - 38 * 9 / 10);
        Line2D ArrRemTotal100to1000 = new Line2D.Double(60 + 54 * 3 + 630, 600 - 38 * 9 / 10, 60 + 54 * 5 + 630, 600 - 38 * 6.2);
        Line2D ArrRemTotal1000to10000 = new Line2D.Double(60 + 54 * 5 + 630, 600 - 38 * 6.2, 60 + 54 * 7 + 630, 600 - 38 * 13);
        Line2D ArrRemTotal10000to100000 = new Line2D.Double(60 + 54 * 7 + 630, 600 - 38 * 13, 60 + 54 * 9 + 630, 600 - 38 * 14);
        //Linked Remove Median time points and graphic
        Ellipse2D LinkRemTotal10 = new Ellipse2D.Double(60 + 54 - 2 + 630, 600 - 38 * 2 / 100 - 2, 4, 4);       //181 000
        Ellipse2D LinkRemTotal100 = new Ellipse2D.Double(60 + 54 * 3 - 2 + 630, 600 - 38 * 12.5 - 2, 4, 4);   //12 700 000
        Ellipse2D LinkRemTotal1000 = new Ellipse2D.Double(60 + 54 * 5 - 2 + 630, 600 - 38 * 7.1 - 2, 4, 4); //7 150 000
        Ellipse2D LinkRemTotal10000 = new Ellipse2D.Double(60 + 54 * 7 - 2 + 630, 600 - 38 * 7.8 - 2, 4, 4);  //7 800 000
        Ellipse2D LinkRemTotal100000 = new Ellipse2D.Double(60 + 54 * 9 - 2 + 630, 600 - 38 * 15 - 2, 4, 4);  //494 100 000
        Line2D LinkRemTotal10to100 = new Line2D.Double(60 + 54 + 630, 600 - 38 * 2 / 100, 60 + 54 * 3 + 630, 600 - 38 * 12.5);
        Line2D LinkRemTotal100to1000 = new Line2D.Double(60 + 54 * 3 + 630, 600 - 38 * 12.5, 60 + 54 * 5 + 630, 600 - 38 * 7.1);
        Line2D LinkRemTotal1000to10000 = new Line2D.Double(60 + 54 * 5 + 630, 600 - 38 * 7.1, 60 + 54 * 7 + 630, 600 - 38 * 7.8);
        Line2D LinkRemTotal10000to100000 = new Line2D.Double(60 + 54 * 7 + 630, 600 - 38 * 7.8, 60 + 54 * 9 + 630, 600 - 38 * 15);
        //drawing all components
        g2.setColor(Color.BLACK);
        g2.draw(graph2);
        g2.draw(lineTime2);
        g2.drawString("Time", 30 + 630, 30);
        g2.draw(lineCount2);
        g2.drawString("Count", 590 + 630, 620);
        g2.draw(arrowTime2left);
        g2.draw(arrowTime2right);
        g2.draw(arrowCount2left);
        g2.draw(arrowCount2right);
        g2.draw(time1m);
        g2.draw(time2m);
        g2.draw(time3m);
        g2.draw(time4m);
        g2.draw(time5m);
        g2.draw(time6m);
        g2.draw(time7m);
        g2.draw(time8m);
        g2.draw(time9m);
        g2.draw(time10m);
        g2.draw(time11m);
        g2.draw(time12m);
        g2.draw(timeSkip);
        g2.draw(time450m);
        g2.draw(time500m);
        g2.draw(point10sec);
        g2.draw(point100sec);
        g2.draw(point1000sec);
        g2.draw(point10000sec);
        g2.draw(point100000sec);
        g2.drawString("10", 60 + 54 - 10 + 630, 605 + 15);
        g2.drawString("100", 60 + 54 * 3 - 10 + 630, 605 + 15);
        g2.drawString("1000", 60 + 54 * 5 - 10 + 630, 605 + 15);
        g2.drawString("10000", 60 + 54 * 7 - 10 + 630, 605 + 15);
        g2.drawString("100000", 60 + 54 * 9 - 10 + 630, 605 + 15);
        g2.drawString("1m", 55 - 40 + 630, 600 - 38);
        g2.drawString("2m", 55 - 40 + 630, 600 - 38 * 2);
        g2.drawString("3m", 55 - 40 + 630, 600 - 38 * 3);
        g2.drawString("4m", 55 - 40 + 630, 600 - 38 * 4);
        g2.drawString("5m", 55 - 40 + 630, 600 - 38 * 5);
        g2.drawString("6m", 55 - 40 + 630, 600 - 38 * 6);
        g2.drawString("7m", 55 - 40 + 630, 600 - 38 * 7);
        g2.drawString("8m", 55 - 40 + 630, 600 - 38 * 8);
        g2.drawString("9m", 55 - 40 + 630, 600 - 38 * 9);
        g2.drawString("10m", 55 - 40 + 630, 600 - 38 * 10);
        g2.drawString("11m", 55 - 40 + 630, 600 - 38 * 11);
        g2.drawString("12m", 55 - 40 + 630, 600 - 38 * 12);
        g2.drawString("...", 55 - 40 + 630, 600 - 38 * 13);
        g2.drawString("450m", 55 - 40 + 630, 600 - 38 * 14);
        g2.drawString("500m", 55 - 40 + 630, 600 - 38 * 15 + 10);
        g2.setColor(Color.RED);
        g2.drawString("Array Add Total time to count", 430 + 630, 25);
        g2.draw(ArrAddTotal10);
        g2.draw(ArrAddTotal100);
        g2.draw(ArrAddTotal1000);
        g2.draw(ArrAddTotal10000);
        g2.draw(ArrAddTotal100000);
        g2.draw(ArrAddTot10to100);
        g2.draw(ArrAddTot100to1000);
        g2.draw(ArrAddTot1000to10000);
        g2.draw(ArrAddTot10000to100000);
        g2.setColor(Color.BLUE);
        g2.drawString("Linked Add Total time to count", 430 + 630, 40);
        g2.draw(LinkAddTotal10);
        g2.draw(LinkAddTotal100);
        g2.draw(LinkAddTotal1000);
        g2.draw(LinkAddTotal10000);
        g2.draw(LinkAddTotal100000);
        g2.draw(LinkAddTotal10to100);
        g2.draw(LinkAddTotal100to1000);
        g2.draw(LinkAddTotal1000to10000);
        g2.draw(LinkAddTotal10000to100000);
        g2.setColor(Color.CYAN);
        g2.drawString("Array Remove Total time to count", 430 + 630, 55);
        g2.draw(ArrRemTotal10);
        g2.draw(ArrRemTotal100);
        g2.draw(ArrRemTotal1000);
        g2.draw(ArrRemTotal10000);
        g2.draw(ArrRemTotal100000);
        g2.draw(ArrRemTotal10to100);
        g2.draw(ArrRemTotal100to1000);
        g2.draw(ArrRemTotal1000to10000);
        g2.draw(ArrRemTotal10000to100000);
        g2.setColor(Color.GRAY);
        g2.drawString("Linked Remove Total time to count", 430 + 630, 70);
        g2.draw(LinkRemTotal10);
        g2.draw(LinkRemTotal100);
        g2.draw(LinkRemTotal1000);
        g2.draw(LinkRemTotal10000);
        g2.draw(LinkRemTotal100000);
        g2.draw(LinkRemTotal10to100);
        g2.draw(LinkRemTotal100to1000);
        g2.draw(LinkRemTotal1000to10000);
        g2.draw(LinkRemTotal10000to100000);
        /**end of grafic 2*/
    }
}
