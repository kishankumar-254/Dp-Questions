package com.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Registration");
        frame.setBounds(400,20,700,1900);
        Container can= frame.getContentPane();
        can.setLayout(null);
        frame.setVisible(true);

        JLabel label=new JLabel("REGISTRATION FORM");
        label.setBounds(170,10,500,80);
        can.add(label);
        Font f=new Font("Kozuka Mincho Pro H",Font.BOLD,30);
        label.setFont(f);

        JLabel label_1=new JLabel("*First Name");
        label_1.setBounds(100,100,100,80);
        can.add(label_1);
        JTextField text1=new JTextField();
        text1.setBounds(250,120,200,30);
        can.add(text1);

        JLabel label2=new JLabel("*Last Name");
        label2.setBounds(100,150,100,80);
        can.add(label2);
        JTextField text2=new JTextField();
        text2.setBounds(250,170,200,30);
        can.add(text2);

        JLabel label_2=new JLabel("*Gender");
        label_2.setBounds(100,200,100,80);
        can.add(label_2);
        JRadioButton rd =new JRadioButton("Male");
        rd.setBounds(250,220,100,30);
        can.add(rd);
        JRadioButton rd1 =new JRadioButton("Female");
        rd1.setBounds(350,220,100,30);
        can.add(rd1);
        JRadioButton rd2 =new JRadioButton("Other");
        rd2.setBounds(450,220,100,30);
        can.add(rd2);
         ButtonGroup buttonGroup=new ButtonGroup();
         buttonGroup.add(rd);
        buttonGroup.add(rd1);
        buttonGroup.add(rd2);


        JLabel label_03=new JLabel("*Date of Birth");
        label_03.setBounds(100,250,100,80);
        can.add(label_03);
        JTextField text3=new JTextField();
        text3.setBounds(250,270,100,30);
        can.add(text3);

        JLabel label_3=new JLabel("*Category");
        label_3.setBounds(100,300,100,80);
        can.add(label_3);
        JRadioButton cat =new JRadioButton("GEN");
        cat.setBounds(250,320,100,30);
        can.add(cat);
        JRadioButton cat1 =new JRadioButton("OBC");
        cat1.setBounds(350,320,100,30);
        can.add(cat1);
        JRadioButton cat2 =new JRadioButton("SC");
        cat2.setBounds(450,320,100,30);
        can.add(cat2);
        JRadioButton cat3 =new JRadioButton("ST");
        cat3.setBounds(550,320,100,30);
        can.add(cat3);
        ButtonGroup buttonGroup_cat=new ButtonGroup();
        buttonGroup_cat.add(cat);
        buttonGroup_cat.add(cat1);
        buttonGroup_cat.add(cat2);
        buttonGroup_cat.add(cat3);

        JLabel label3=new JLabel("*Email");
        label3.setBounds(100,350,100,80);
        can.add(label3);
        JTextField text4=new JTextField();
        text4.setBounds(250,370,150,30);
        can.add(text4);

        JLabel label4=new JLabel("*Mobile No");
        label4.setBounds(100,400,100,80);
        can.add(label4);
        JTextField text5=new JTextField();
        text5.setBounds(250,420,90,30);
        can.add(text5);

        JLabel label5=new JLabel("Company /Organizational");
        label5.setBounds(100,450,300,80);
        can.add(label5);
        JTextField text=new JTextField();
        text.setBounds(250,470,200,30);
        can.add(text);

        JLabel label_6=new JLabel("Address");
        label_6.setBounds(100,500,100,80);
        can.add(label_6);
        JTextField text6=new JTextField();
        text6.setBounds(250,520,400,30);
        can.add(text6);

        JLabel label_7=new JLabel("Town /City");
        label_7.setBounds(100,550,100,80);
        can.add(label_7);
        JTextField text7=new JTextField();
        text7.setBounds(250,570,200,30);
        can.add(text7);

        JLabel label_8=new JLabel("*Zip Code");
        label_8.setBounds(100,600,100,80);
        can.add(label_8);
        JTextField text8=new JTextField();
        text8.setBounds(250,620,100,30);
        can.add(text8);

        JButton button=new JButton("Submit");
        button.setBounds(300,700,100,30);
        can.add(button);
    }
}
