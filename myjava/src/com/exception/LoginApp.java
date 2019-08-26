package com.exception;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.*;
import java.awt.event.*;
public class LoginApp {
    static Container can;
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(400,100,400,500);
        can=frame.getContentPane();
        can.setLayout(null);
        JRadioButton but=new JRadioButton("Male");
            but.setBounds(100,10,100,30);
            can.add(but);

        JRadioButton but1=new JRadioButton("Female");
        but1.setBounds(200,10,100,30);
        can.add(but1);
        JRadioButton but3=new JRadioButton("Other");
        but3.setBounds(300,10,100,30);
        can.add(but3);
          ButtonGroup group=new ButtonGroup();
          group.add(but);
          group.add(but1);
          group.add(but3);
          JLabel button=new JLabel("Username");
          button.setBounds(100,50,100,30);
          can.add(button);
          JTextField text=new JTextField();
          text.setBounds(210,50,150,30);
          can.add(text);

        JLabel button1=new JLabel("Password");
        button1.setBounds(100,100,100,30);
        can.add(button1);
        JTextField text1=new JTextField();
        text1.setBounds(210,100,150,30);
        can.add(text1);
        JButton button2=new JButton("Login");
        button2.setBounds(150,170,70,30);
        can.add(button2);
        Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
        button2.setCursor(cursor);

        JLabel label1=new JLabel("Category");
        label1.setBounds(80,220,100,30);
        can.add(label1);
        String [] arr={" ","General","OBC","SC","ST"};
        JComboBox box=new JComboBox(arr);
        box.setBounds(150,220,100,30);
        can.add(box);
        box.setEditable(true);
        JLabel label2=new JLabel("your Comments");
        label2.setBounds(50,260,150,30);
        can.add(label2);
        JTextArea textArea=new JTextArea();
        textArea.setBounds(150,260,200,50);
        can.add(textArea);
        Font f=new Font("Latica Fax",Font.ITALIC,15);
        textArea.setFont(f);


    }
}
