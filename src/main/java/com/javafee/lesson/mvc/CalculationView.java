package com.javafee.lesson.mvc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationView extends JFrame implements ActionListener{
    //configuration of JFrame

    //components to use
    private JTextField firstNumberJTF = new JTextField(10);
    private JLabel additionLabelJL = new JLabel("+");
    private JTextField secendNumberJTF = new JTextField(10);
    private JButton calculateButtonJB = new JButton("Calculate");
    private JTextField calcSolutionJTF = new JTextField(10);

    CalculationView() {


        JPanel calcPanel = new JPanel();

        //basic configuration
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //what will happen when close app
        this.setSize(600, 800);
        this.setTitle("Calculate");
        //  this.setLayout(new BorderLayout(10,10));


        //add component to panel

        calcPanel.add(firstNumberJTF);
        calcPanel.add(additionLabelJL);
        calcPanel.add(secendNumberJTF);
        calcPanel.add(calculateButtonJB);
        calcPanel.add(calcSolutionJTF);

        //add calcPanel to JFrame

        this.add(calcPanel, BorderLayout.CENTER);

        //adding acction listener

        //METHOD 1 - only for button

        calculateButtonJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //when someone click the button this will execute

                System.out.println("sout");
                firstNumberJTF.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Double firstNumber = Double.valueOf(Integer.valueOf(firstNumberJTF.getText()));
                    }
                });
                secendNumberJTF.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Double secendNumber = Double.valueOf(Integer.valueOf(secendNumberJTF.getText()));
                    }
                });
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
/*
        calculateButtonJB.addActionListener(this);
        firstNumberJTF.addActionListener(this);
        secendNumberJTF.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Kliknięte");
    }
    public void actionPerformedButton(ActionEvent e) {
        System.out.println("Kliknięte");
    }
*/
