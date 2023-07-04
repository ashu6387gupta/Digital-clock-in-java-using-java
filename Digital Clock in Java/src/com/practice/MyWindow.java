package com.practice;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("", Font.BOLD,35);
    MyWindow()
    {
        setTitle("My Digital Clock");
        setSize(700,500);
        setLocation(350,120);
        this.createGUI();
        this.startClock();
        setVisible(true);
    }
    public void createGUI()
    {
        heading = new JLabel("My Clock",SwingConstants.CENTER);
        clockLabel = new JLabel("Clock",SwingConstants.CENTER);
        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);
    }
    public void startClock()
    {
        Timer timer = new Timer(1000,new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String dateTime = new Date().toLocaleString();
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
}
