package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener{

    JTextField textField;
    JTextField textField1;
    JTextField textField2;
    JRadioButton AddRadioButton;
    JRadioButton SubtractRadioButton;
    JRadioButton MultiplicationRadioButton;
    JRadioButton DivisionRadioButton;
    ButtonGroup buttonGroup;

    char temp;
    int tempInt;
    double tempDouble;



    public static void main(String[] args) {
        new Main().display();

    }

    private void display(){

        this.setTitle("ARITHMETIC CALCULATOR");
        setSize(new Dimension(400,300));
        Container container = getContentPane();
        container.setLayout(null);

        container.setBackground(Color.GRAY);
        textField = new JTextField();
        textField.setBounds(45, 45,50 , 25);
        container.add(textField);


        textField1 = new JTextField();
        textField1.setBounds(140, 45,50 , 25);
        container.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(220, 45,50 , 25);
        container.add(textField2);

        AddRadioButton = new JRadioButton();
        container.add(AddRadioButton);
        AddRadioButton.setText("+");
        AddRadioButton.setBounds(100, 50, 40, 15  );
        AddRadioButton.setBackground(Color.GRAY);
        AddRadioButton.addActionListener(this);

        SubtractRadioButton = new JRadioButton();
        container.add(SubtractRadioButton);
        SubtractRadioButton.setText("-");
        SubtractRadioButton.setBounds(100, 70, 40, 15  );
        SubtractRadioButton.setBackground(Color.GRAY);
        SubtractRadioButton.addActionListener(this);

        MultiplicationRadioButton = new JRadioButton();
        container.add(MultiplicationRadioButton);
        MultiplicationRadioButton.setText("*");
        MultiplicationRadioButton.setBounds(100, 90, 40, 15  );
        MultiplicationRadioButton.setBackground(Color.GRAY);
        MultiplicationRadioButton.addActionListener(this);

        DivisionRadioButton = new JRadioButton();
        container.add(DivisionRadioButton);
        DivisionRadioButton.setText("/");
        DivisionRadioButton.setBounds(100, 110, 40, 15  );
        DivisionRadioButton.setBackground(Color.GRAY);
        DivisionRadioButton.addActionListener(this);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(AddRadioButton);
        buttonGroup.add(SubtractRadioButton);
        buttonGroup.add(MultiplicationRadioButton);
        buttonGroup.add(DivisionRadioButton);

        JLabel label = new JLabel("=");
        label.setBounds(200,45,50,25);
        label.setBackground(Color.GRAY);
        container.add(label);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        JRadioButton jRB = (JRadioButton)e.getSource();

        if (jRB == AddRadioButton){
            temp = '+';
            evaluation();
        }

        else if (jRB == SubtractRadioButton){
            temp = '-';
            evaluation();
        }

        else if (jRB == MultiplicationRadioButton){
            temp = '*';
            evaluation();
        }

        else if (jRB == DivisionRadioButton){
            temp = '/';
            evaluation();

        }

    }

    public void evaluation() {

        try {

            if (textField.getText().equals("") || textField1.getText().equals("")) {
                throw new Exception("No input in one or both text fields");
            }

            int IntValueTF = Integer.parseInt(textField.getText());
            int IntValueTF1 = Integer.parseInt(textField1.getText());

            switch (temp) {
                case '+':
                    tempInt = IntValueTF + IntValueTF1;
                    System.out.println(tempInt);
                    textField2.setText(String.valueOf(tempInt));
                    break;
                case '-':
                    tempInt = IntValueTF - IntValueTF1;
                    System.out.println(tempInt);
                    textField2.setText(String.valueOf(tempInt));
                    break;
                case '*':
                    tempInt = IntValueTF * IntValueTF1;
                    System.out.println(tempInt);
                    textField2.setText(String.valueOf(tempInt));
                    break;
                case '/':
                    tempDouble =  Double.valueOf(IntValueTF) / Double.valueOf(IntValueTF1);
                    if(IntValueTF1 == 0)
                        throw new ArithmeticException("Division by 0");
                    System.out.println(tempDouble);
                    textField2.setText(String.valueOf(tempDouble));
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Non integer inputs on one or both text fields.");
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
