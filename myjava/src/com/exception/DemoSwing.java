package com.exception;
import javax.swing.*;
import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public abstract class DemoSwing implements ActionListener {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        //all are jframe methods.
        frame.setVisible(true);
        //frame.setSize(400,500);
        frame.setTitle("DemoFrame");
        /*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocation(300,200);//set location from top to bottom.
        frame.setBounds(400,100,400,500);// it will work for all location and size.
        Container c=frame.getContentPane();
        c.setBackground(Color.GRAY);
        frame.setResizable(false);//resize the windows like maximize and minimize. */
        // completed jframe methods.

 //JLebel methods starts now.

        /*JLabel label =new JLabel("Username");
        c.add(label);
        c.setLayout(null);
        label.setBounds(20,10,300,20);
        level.setText("Password"); // this will  override to Username.
        Font font=new Font("Lucida Fax",Font.PLAIN,20);
        label.setFont(font);
        //ImageIcon image=new ImageIcon("logo.jpg");
        //JLabel label1=new JLabel(image);
        //label1.setBounds(100,50,100,20);*/


        //text field
        /*Container cs=frame.getContentPane();
        cs.setLayout(null);
             JTextField mytext= new JTextField();
             frame.setLocation(300,200);
             frame.setBounds(100,100,400,500);
             mytext.setBounds(100,200,200,30);
             frame.setResizable(false);
             Font F=new Font("Arial",Font.BOLD,50);
             cs.add(mytext);
             mytext.setBackground(Color.pink);
             mytext.setForeground(Color.blue);
         ***/

        //JPasswordField

        /* JPasswordField pass =new JPasswordField();
        //pass.setLocation(300,200);
        //frame.setResizable(false);
        Container cs=frame.getContentPane();
        cs.setLayout(null);
        frame.setBounds(100,100,400,500);
        pass.setBounds(100,200,200,30);
       cs.add(pass);
       pass.setForeground(Color.RED);
       Font f= new Font("Arial",Font.BOLD,30);
       ***/
        JButton button1=new JButton("RED");
        JButton button2=new JButton("GREEN");
        JButton button3=new JButton("PINK");
        Container cr=frame.getContentPane();
        cr.add(button1);
        cr.add(button2);
        cr.add(button3);
        cr.setLayout(null);
        frame.setBounds(100,100,400,500);
        button1.setBounds(50,100,100,50);
        button2.setBounds(150,100,100,50);
        button3.setBounds(250,100,100,50);
        Font font=new Font("Arial",Font.BOLD,30);
        //button.setFont(font);
        Cursor cur=new Cursor(Cursor.HAND_CURSOR);
        button1.setCursor(cur);
        button2.setCursor(cur);
        button3.setCursor(cur);


        }
    }

