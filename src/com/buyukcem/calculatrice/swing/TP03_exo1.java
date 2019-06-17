package com.buyukcem.calculatrice.swing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.buyukcem.calculatrice.Calculette;

/**
 *
 * @author BuyukCem
 */
public class TP03_exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               
        // fenêtre
        JFrame jf = new JFrame("Calculatrice");
        jf.setLayout(new BorderLayout());
        
        // NORTH
        JPanel jp3 = new JPanel();
        jf.add(jp3, BorderLayout.NORTH);
        jp3.setPreferredSize(new Dimension(100, 100));
        JLabel jl = new JLabel("");
        JLabel joperateur = new JLabel("");
        JLabel joperande1 = new JLabel("");
        JLabel joperande2 = new JLabel("");
        jp3.add(jl);    

        
        // CENTER
        JPanel jp = new JPanel();
        jf.add(jp, BorderLayout.CENTER);
        jp.setLayout(new GridLayout(4, 3));
        
        JButton b1 = new JButton("7");
        JButton b2 = new JButton("8");
        JButton b3 = new JButton("9");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("1");
        JButton b8 = new JButton("2");
        JButton b9 = new JButton("3");
        JButton b10 = new JButton(",");
        JButton b11 = new JButton("0");
        JButton b12 = new JButton("suppr");
        
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        jp.add(b4);
        jp.add(b5);
        jp.add(b6);
        jp.add(b7);
        jp.add(b8);
        jp.add(b9);
        jp.add(b10);
        jp.add(b11);
        jp.add(b12);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "7");          
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "7");
                }
                else{
                    joperande2.setText(joperande2.getText() + "7");                    
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "8");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "8");
                }
                else{
                    joperande2.setText(joperande2.getText() + "8");                    
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "9");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "9");
                }
                else{
                    joperande2.setText(joperande2.getText() + "9");                    
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "4");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "4");
                }
                else{
                    joperande2.setText(joperande2.getText() + "4");                    
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "5");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "5");
                }
                else{
                    joperande2.setText(joperande2.getText() + "5");                    
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "6");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "6");
                }
                else{
                    joperande2.setText(joperande2.getText() + "6");                    
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "1");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "1");
                }
                else{
                    joperande2.setText(joperande2.getText() + "1");                    
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "2");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "2");
                }
                else{
                    joperande2.setText(joperande2.getText() + "2");                    
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "3");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "3");
                }
                else{
                    joperande2.setText(joperande2.getText() + "3");                    
                }
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + ",");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + ",");
                }
                else{
                    joperande2.setText(joperande2.getText() + ",");                    
                }
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "0");
                if(joperateur.getText().isEmpty()){
                    joperande1.setText(joperande1.getText() + "0");
                }
                else{
                    joperande2.setText(joperande2.getText() + "0");                    
                }
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText("");
            }
        });
        
        // EAST
        JPanel jp2 = new JPanel();
        jf.add(jp2, BorderLayout.EAST);
        jp2.setLayout(new GridLayout(5, 1));
        
        JButton b13 = new JButton("/");
        JButton b14 = new JButton("*");
        JButton b15 = new JButton("-");
        JButton b16 = new JButton("+");
        JButton b17 = new JButton("entr");
        
        jp2.add(b13);
        jp2.add(b14);
        jp2.add(b15);
        jp2.add(b16);
        jp2.add(b17);
        
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "/");
                joperateur.setText(joperateur.getText() + "/");
            }
        });
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "*");
                joperateur.setText(joperateur.getText() + "*");
            }
        });
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "-");
                joperateur.setText(joperateur.getText() + "-");
            }
        });
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                jl.setText(jl.getText() + "+");
                joperateur.setText(joperateur.getText() + "+");
            }
        });
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {   
                //Variables
                float operande1 = Integer.parseInt(joperande1.getText());
                float operande2 = Integer.parseInt(joperande2.getText());
                String operateur = joperateur.getText();
                Calculette calculette = new Calculette(operande1, operateur, operande2);      
                jl.setText(jl.getText() + "=" + calculette.Calculer());      
                joperande1.setText("");
                joperande2.setText("");
                joperateur.setText("");
            }
        });
        
        // paramètre fenêtre
        jf.pack();
        jf.setVisible(true);
        
    }    
}