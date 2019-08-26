package com.exception;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class MyCalculator {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setBounds(400,20,775,700);
        Container cr=frame.getContentPane();
        cr.setLayout(null);
        cr.setBackground(Color.darkGray);
        JTextField field=new JTextField();
        field.setBounds(2,5,770,150);
        cr.add(field);
        field.setBackground(Color.GRAY);
        Font f=new Font("Arial",Font.PLAIN,100);
        field.setForeground(Color.white);
        field.setFont(f);

        JButton button=new JButton("CE");
        button.setBounds(2,200,180,80);
        cr.add(button);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.white);
        Font f1=new Font("Arial",Font.PLAIN,40);
        button.setFont(f1);

        JButton but=new JButton("C");
        but.setBounds(188,200,180,80);
        cr.add(but);
        but.setBackground(Color.GRAY);
        but.setForeground(Color.white);
        Font f2=new Font("Arial",Font.PLAIN,40);
        but.setFont(f2);

        JButton butt=new JButton("<");
        butt.setBounds(374,200,200,80);
        cr.add(butt);
        butt.setBackground(Color.GRAY);
        butt.setForeground(Color.white);
        Font f3=new Font("Arial",Font.PLAIN,40);
        butt.setFont(f3);

        JButton btn=new JButton("/");
        btn.setBounds(580,200,180,80);
        cr.add(btn);
        btn.setBackground(Color.GRAY);
        btn.setForeground(Color.white);
        Font f4=new Font("Arial",Font.PLAIN,40);
        btn.setFont(f4);

        //Row of number 7
        JButton button_d=new JButton("7");
        button_d.setBounds(2,288,180,80);
        cr.add(button_d);
        button_d.setBackground(Color.GRAY);
        button_d.setForeground(Color.white);
        Font fd=new Font("Arial",Font.PLAIN,40);
        button_d.setFont(fd);

        JButton button_dn=new JButton("8");
        button_dn.setBounds(188,288,180,80);
        cr.add(button_dn);
        button_dn.setBackground(Color.GRAY);
        button_dn.setForeground(Color.white);
        Font fdn=new Font("Arial",Font.PLAIN,40);
        button_dn.setFont(fdn);

        JButton button_dwn=new JButton("9");
        button_dwn.setBounds(374,288,200,80);
        cr.add(button_dwn);
        button_dwn.setBackground(Color.GRAY);
        button_dwn.setForeground(Color.white);
        Font fdwn=new Font("Arial",Font.PLAIN,40);
        button_dwn.setFont(fdwn);

        JButton button_down=new JButton("*");
        button_down.setBounds(580,288,180,80);
        cr.add(button_down);
        button_down.setBackground(Color.GRAY);
        button_down.setForeground(Color.white);
        Font fdown=new Font("Arial",Font.PLAIN,40);
        button_down.setFont(fdown);

        //Row of number 4
        JButton row3=new JButton("4");
        row3.setBounds(2,376,180,80);
        cr.add(row3);
        row3.setBackground(Color.GRAY);
        row3.setForeground(Color.white);
        Font fr=new Font("Arial",Font.PLAIN,40);
        row3.setFont(fr);

        JButton row31=new JButton("5");
        row31.setBounds(188,376,180,80);
        cr.add(row31);
        row31.setBackground(Color.GRAY);
        row31.setForeground(Color.white);
        Font fr3=new Font("Arial",Font.PLAIN,40);
        row31.setFont(fr3);

        JButton row312=new JButton("6");
        row312.setBounds(374,376,200,80);
        cr.add(row312);
        row312.setBackground(Color.GRAY);
        row312.setForeground(Color.white);
        Font fr32=new Font("Arial",Font.PLAIN,40);
        row312.setFont(fr32);

        JButton row3124=new JButton("-");
        row3124.setBounds(580,376,180,80);
        cr.add(row3124);
        row3124.setBackground(Color.GRAY);
        row3124.setForeground(Color.white);
        Font fr324=new Font("Arial",Font.PLAIN,40);
        row3124.setFont(fr324);

        //Row of number 1
        JButton one=new JButton("1");
        one.setBounds(2,464,180,80);
        cr.add(one);
        one.setBackground(Color.GRAY);
        one.setForeground(Color.white);
        Font bone=new Font("Arial",Font.PLAIN,40);
        one.setFont(bone);

        JButton two=new JButton("2");
        two.setBounds(188,464,180,80);
        cr.add(two);
        two.setBackground(Color.GRAY);
        two.setForeground(Color.white);
        Font b_two=new Font("Arial",Font.PLAIN,40);
        two.setFont(b_two);

        JButton three=new JButton("3");
        three.setBounds(374,464,200,80);
        cr.add(three);
        three.setBackground(Color.GRAY);
        three.setForeground(Color.white);
        Font b_three=new Font("Arial",Font.PLAIN,40);
        three.setFont(b_three);

        JButton plus=new JButton("+");
        plus.setBounds(580,464,180,80);
        cr.add(plus);
        plus.setBackground(Color.GRAY);
        plus.setForeground(Color.white);
        Font b_plus=new Font("Arial",Font.PLAIN,40);
        plus.setFont(b_plus);

        //Row of Zero
        JButton zero=new JButton("0");
        zero.setBounds(2,552,364,80);
        cr.add(zero);
        zero.setBackground(Color.GRAY);
        zero.setForeground(Color.white);
        Font b_zero=new Font("Arial",Font.PLAIN,40);
        zero.setFont(b_zero);

        JButton dot=new JButton(".");
        dot.setBounds(374,552,200,80);
        cr.add(dot);
        dot.setBackground(Color.GRAY);
        dot.setForeground(Color.white);
        Font b_dot=new Font("Arial",Font.PLAIN,40);
        dot.setFont(b_dot);

        JButton equal=new JButton("=");
        equal.setBounds(580,552,180,80);
        cr.add(equal);
        equal.setBackground(Color.green);
        equal.setForeground(Color.white);
        Font b_equal=new Font("Arial",Font.PLAIN,40);
        equal.setFont(b_equal);
    }
}
