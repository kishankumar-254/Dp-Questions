package com.exception;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.*;
import java.awt.event.*;
public class DemoS {
    static Container con;
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        con=frame.getContentPane();
        con.setLayout(null);
        frame.setBounds(400,100,400,500);
        JButton button= new JButton("RED");
        button.setBounds(50,100,100,50);
        JButton button2= new JButton("GREEN");
        button2.setBounds(150,100,100,50);
        JButton button3= new JButton("YELLOW");
        button3.setBounds(250,100,100,50);
        Cursor cr=new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(cr);
        button2.setCursor(cr);
        button3.setCursor(cr);
        button.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                redButtonAction(e);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greenButtonAction(e);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yellowButtonAction(e);
            }
        });

        con.add(button);
        con.add(button2);
        con.add(button3);


    }
    public static void redButtonAction(ActionEvent event )
    {
        con.setBackground(Color.RED);

    }
    public static void greenButtonAction(ActionEvent event )
    {
        con.setBackground(Color.GREEN);

    }
    public static void yellowButtonAction(ActionEvent event )
    {
        con.setBackground(Color.yellow);

    }

}
