
package travel.management.system1;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



import java.awt.event.*;
import javax.swing.JOptionPane;


public class Signup extends JFrame implements ActionListener {
    JButton create,Back;
    JTextField tfname,tfusername, tfpassword,tfAnswer;
    Choice security;
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        
        
        
        JLabel lblusername= new JLabel("username");
	lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblusername.setBounds(50, 20, 125, 25);
	p1.add(lblusername);
        
         tfusername = new JTextField();
        tfusername.setBounds(190,20, 180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lblname = new JLabel("name :");
	lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblname.setBounds(50, 60, 125, 25);
	p1.add(lblname);
        
         tfname = new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel lblpassword = new JLabel("password");
	lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblpassword.setBounds(50, 100, 125, 25);
	p1.add(lblpassword);
        
         tfpassword = new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
         JLabel lblsecurity = new JLabel("security Question");
	lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblsecurity.setBounds(50, 140, 125, 25);
	p1.add(lblsecurity);
        
         security = new Choice();
        security.add("Fav Character from the girls");
        security.add("Fav Marvel SuperHero");
        security.add("your Lucky number");
        security.add("your childhood superhero");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        JLabel lblAnswer = new JLabel("Answer");
	lblAnswer .setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer.setBounds(50, 180, 125, 25);
	p1.add(lblAnswer);
        
         tfAnswer = new JTextField();
        tfAnswer.setBounds(190,180,180,25);
        tfAnswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfAnswer);
        
        create = new JButton("Create");
        create.setBackground(new Color(133,193,233));
        create.setForeground(Color.WHITE);
        create.setFont(new Font("Tahona",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        Back= new JButton("Back");
        Back.setBackground(new Color(133,193,233));
        Back.setForeground(Color.WHITE);
        Back.setFont(new Font("Tahona",Font.BOLD,14));
        Back.setBounds(250,250,100,30);
         Back.addActionListener(this);
        p1.add(Back);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(580,50,250, 250);
        add(Image);
        
        
        
        setVisible(true);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        
    if(ae.getSource()== create){
        String username = tfusername.getText();
         String name = tfname.getText();
          String password = tfpassword.getText();
           String question = security.getSelectedItem();
           String Answer = tfAnswer.getText();
           
           String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+Answer+"')";
          try{
              Conn c = new Conn();

              c.s.executeUpdate(query);
              
              JOptionPane.showMessageDialog(null,"Account Created Successfully");
              setVisible(false);
              new Login();
              
          } catch (Exception e){
              e.printStackTrace();
          } 
    }else if(ae.getSource()==Back){
        setVisible(false);
        new Login();
        
    }
}
   
    public static void main(String[] args) {
        new Signup();
        
    }

    
    
    
}
