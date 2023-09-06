package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FrameLab6 extends JFrame{
    private int width = 600;
    private int height = 800;

    private static int keyButtonsCount = 0;
    private static long start;
    private static long last;
    private static long total;

    public FrameLab6()
    {
        this.setSize(this.width, this.width);
        this.setTitle("TextBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new GridBagLayout());
        JButton stop = new JButton("Stop");
        JTextField TField = new JTextField(40); TField.setBackground(Color.GRAY);
        JTextField TimeField = new JTextField(10); TimeField.setBackground(Color.GREEN);

        this.add(TField,new GridBagConstraints(1,6,1,1,0.0,0.9,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0,0));
        this.add(stop,new GridBagConstraints(2,6,1,1,0.0,0.9,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0,0));
        this.add(TimeField,new GridBagConstraints(2,7,1,1,0.0,0.9,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0,0));


        class StopButtonActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                last -= System.nanoTime();
                total = System.nanoTime() - start + last;
                TimeField.setText(""+(int)(keyButtonsCount * 60/((double)total/1000000000)));
            }
        }

        class KeyBoardKeyListener implements KeyListener {
            @Override
            public void keyTyped(KeyEvent event) {
                if (keyButtonsCount == 0) start = System.nanoTime();
                last = System.nanoTime();
                keyButtonsCount++;
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        }

        stop.addActionListener(new StopButtonActionListener());
        TField.addKeyListener(new KeyBoardKeyListener());
    }
}
