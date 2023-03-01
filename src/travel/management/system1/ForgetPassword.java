package travel.management.system1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {
    
    JTextField tfusername ,tfname,tfquestion,tfAnswer,tfpassword;
    JButton search,retrive,Back;
ForgetPassword(){
    setBounds(350,200,850,380);
     setLocation(200,100);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/forgotpassword.jpg"));
    Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(580,70,200,200);
    add(image);
    
    
    
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(30,30,500,280);
    add(p1);
    
    JLabel lblusername = new JLabel("Username");
    lblusername.setBounds(40,20,100,25);
    lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
    p1.add(lblusername);
    
    
    tfusername = new JTextField();
    tfusername.setBounds(220,20,150,25);
    tfusername.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfusername);
    
    search = new JButton("Search");
    search.setBackground(Color.GRAY);
    search.setForeground(Color.WHITE);
    search.setBounds(380,20,100,25);
    search.addActionListener(this);
    p1.add(search);
    
    JLabel lblname = new JLabel("Name");
    lblname.setBounds(40,60,100,25);
    lblname.setFont(new Font("Tahoma",Font.BOLD,14));
    p1.add(lblname);
    
    
    tfname = new JTextField();
    tfname.setBounds(220,60,150,25);
    tfname.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfname);
    
    JLabel lblquestion= new JLabel(" Security Question");
    lblquestion.setBounds(40,100,150,25);
    lblquestion.setFont(new Font("Tahoma",Font.BOLD,14));
    p1.add(lblquestion);
    
    
    tfquestion = new JTextField();
    tfquestion.setBounds(220,100,150,25);
    tfquestion.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfquestion);
    
    
    JLabel lblAnswer= new JLabel("Answer");
    lblAnswer.setBounds(40,140,150,25);
    lblAnswer.setFont(new Font("Tahoma",Font.BOLD,14));
    p1.add(lblAnswer);
    
    
    tfAnswer = new JTextField();
    tfAnswer.setBounds(220,140,150,25);
    tfAnswer.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfAnswer);
    
    
     retrive = new JButton("Retrieve");
    retrive.setBackground(Color.GRAY);
    retrive.setForeground(Color.WHITE);
    retrive.setBounds(380,140,100,25);
    retrive.addActionListener(this);
    p1.add(retrive);
    
    
    JLabel lblpassword= new JLabel("password");
    lblpassword.setBounds(40,180,150,25);
    lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
    p1.add(lblpassword);
    
    
    tfpassword = new JTextField();
    tfpassword.setBounds(220,180,150,25);
    tfpassword.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfpassword);
    
    Back = new JButton("Back");
    Back.setBackground(Color.GRAY);
    Back.setForeground(Color.WHITE);
    Back.setBounds(150,230,100,25);
    Back.addActionListener(this);
    p1.add(Back);
    
    
    setVisible(true);
    
    
    
}
//public void ActionPerformed(ActionEvent ae){
    //if(ae.getSource()==search){
     //}else if(ae.getSource()==retrive){
        // }else
     //{
        // setVisible(false);
       // Login login = new Login();
         
     //}
//}
    
    //public static void main(String[] args) {
     //    new ForgetPassword();
   // }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     if(ae.getSource()==search){
         try{
             String query= "select * from account where username =  '"+tfusername.getText()+"'";
             Conn c = new Conn();
           ResultSet rs = c.s.executeQuery(query);
          while(rs.next()){
              tfname.setText(rs.getString("name"));
             tfquestion.setText(rs.getString("security"));
              
          }
         }catch(Exception e){
             e.printStackTrace();
         }
     }else if(ae.getSource()==retrive){
          try{
             String query= "select * from account where answer =  '"+tfAnswer.getText()+"' AND username ='"+tfusername.getText()+"'";
             Conn c = new Conn();
             
          ResultSet rs  =  c.s.executeQuery(query);
          while(rs.next()){
              tfpassword.setText(rs.getString("password"));
             
              
          }
         }catch(Exception e){
             e.printStackTrace();
         }
         }else
     {
         setVisible(false);
        Login login = new Login();
         
     }
    
    }

public static void main(String[] args) {
        ForgetPassword forgetPassword = new ForgetPassword();
    }

    void ActionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}