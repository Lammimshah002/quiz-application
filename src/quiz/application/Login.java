
package quiz.application;

//constacter

import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
     
    JButton rules,Back;
      JTextField tfname;
    //frame make korar jonno 2 ta function ar need
    Login()
    {
        //gota frame ta neya jonno getcontentpane use korchi and color change korchi
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //image ta ke niye asle oita component hobe component ke 
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg")); //component banichi
        //component ke frame a dukite chile add function ke use korte hobe add() je object ke use korbo oita add a join korbo add(object)
        //ai khane diret add(object )use korte parbo na ai khane jlable class object nite hobe.
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        //frame ar size  stesize(arg1,arg2)
        JLabel heading = new JLabel("simple minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Monqolian Baiti",Font.BOLD,18));
        heading.setForeground(Color.BLACK);
        add(heading);
         JLabel name = new JLabel("Enter Your Name:");
        name.setBounds(750,150,300,20);
        name.setFont(new Font("Monqolian Baiti",Font.BOLD,18));
        name.setForeground(Color.BLACK);
        add(name);
        tfname= new  JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);
        rules =new JButton ("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.BLUE);
        rules.addActionListener(this);
        add(rules);
        Back =new JButton ("Back");
        Back.setBounds(915,270,120,25);
        Back.setBackground(Color.BLUE);
        Back.addActionListener(this);
        add(Back);
        
        
        
        setSize(1200,500);
        //location center jodi na dey ta hole bydefalt said a kulbe setlocation(left teke 400,up teke 200)
        setLocation(400,200);
        
        setVisible(true); //first function ai khane by bidifolt hidden hoy 
    }
    
        public void actionPerformed(ActionEvent ae) {
         if(ae.getSource() == rules)
        {
            String name= tfname.getText();
            setVisible(false); 
            new rules(name);
        }
        else if(ae.getSource()== Back)
        {
           setVisible(false); 
        }
       
    }
   
    public static void main(String[] args) {
        new Login(); ///class object Login l holo variable.
    }

   
    
}
