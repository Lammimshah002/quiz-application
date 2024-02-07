package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Solution extends JFrame implements ActionListener{

    String name;
    JButton  back;

    Solution() {
       /// this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel solution = new JLabel();
        solution.setBounds(20, 70, 2000, 850);
        solution.setFont(new Font("Tahoma", Font.PLAIN, 16));
        solution.setText(
            "<html>"+ 
                "1. Which is used to find and fix bugs in the Java programs.?" + "<br><br>" +  
                "Answer:JDB"+"<br><br>"+
                "2.What is the return type of the hashCode() method in the Object class?" + "<br><br>" +
                "Answer:int"+"<br><br>"+
                "3. Which package contains the Random class?" + "<br><br>" +
                "Answer:java.util package"+"<br><br>"+
                "4. An interface with no fields or methods is known as?" + "<br><br>" +
                "Answer:Marker Interface"+"<br><br>"+
                "5.In which memory a String is stored, when we create a string using new operator?" + "<br><br>" +
                "Answer:Heap memory"+"<br><br>"+
                "6.Which of the following is a marker interface?" + "<br><br>" +
                "Answer:Remote interface"+"<br><br>"+
                "7.Which keyword is used for accessing the features of a package?" + "<br><br>" +
                "Answer:import"+"<br><br>"+   
                "8.In java, jar stands for?" + "<br><br>" +
                "Answer:Java Archive"+"<br><br>"+  
                "9.Which of the following is a mutable class in java?" + "<br><br>" +
                "Answer:java.lang.StringBuilder"+"<br><br>"+
                "10.Which of the following option leads to the portability and security of Java?" + "<br><br>" +
                "Answer:Bytecode is executed by JVM"+"<br><br>"+
                
            "<html>"
        );
        add(solution);

        back = new JButton("Play again");
        back.setBounds(550, 900, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            new Login();
    }

    public static void main(String[] args) {
        new Solution();
    }
}
