
package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.ResultSet;

public class ViewCustomer extends JFrame  implements ActionListener {
    JButton back;
    ViewCustomer(String username){
       setBounds(450,180,870,625);
        setLocation(200,100);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel lblusername = new JLabel("Username");
       lblusername.setBounds(30,50,150,25);
       add(lblusername);
       
       JLabel labelusername = new JLabel();
       labelusername.setBounds(220,50,150,25);
       add(labelusername);
       
       JLabel lblid = new JLabel("id");
       lblid.setBounds(30,110,150,25);
       add(lblid);
       
       JLabel labelid = new JLabel();
       labelid.setBounds(220,110,150,25);
       add(labelid);
       
       
       JLabel lblnumber = new JLabel("Number");
       lblnumber.setBounds(30,170,150,25);
       add(lblnumber);
       
       JLabel labelnumber = new JLabel();
       labelnumber.setBounds(220,170,150,25);
       add(labelnumber);
       
       
       JLabel lblname = new JLabel("name");
       lblname.setBounds(30,230,150,25);
       add(lblname);
       
       JLabel labelname = new JLabel();
       labelname.setBounds(220,230,150,25);
       add(labelname);
       
       
       JLabel lblgender = new JLabel("Gender");
       lblgender.setBounds(30,290,150,25);
       add(lblgender);
       
       JLabel labelgender = new JLabel();
       labelgender.setBounds(220,290,150,25);
       add(labelgender);
       
       JLabel lblcontry = new JLabel("contry");
       lblcontry.setBounds(500,50,150,25);
       add(lblcontry);
       
       JLabel labelcontry = new JLabel();
       labelcontry.setBounds(690,50,150,25);
       add(labelcontry);
       
       JLabel lbladdress = new JLabel("address");
       lbladdress.setBounds(500,110,150,25);
       add(lbladdress);
       
       JLabel labeladdress = new JLabel();
       labeladdress.setBounds(690,110,150,25);
       add(labeladdress);
       
       
       JLabel lblphone = new JLabel("phone");
       lblphone.setBounds(500,170,150,25);
       add(lblphone);
       
       JLabel labelphone = new JLabel();
       labelphone.setBounds(690,170,150,25);
       add(labelphone);
       
       JLabel lblemail = new JLabel("email");
       lblemail.setBounds(500,230,150,25);
       add(lblemail);
       
       JLabel labelemail= new JLabel();
       labelemail.setBounds(690,230,150,25);
       add(labelemail);
       
       back = new JButton("Back");
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setBounds(350,350,100,25);
       back.addActionListener(this);
       
       add(back);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/viewall.jpg"));
       Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(20,400,600,200);
       add(image);
       
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icon/viewall.jpg"));
       Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel image2 = new JLabel(i6);
       image2.setBounds(600,400,600,200);
       add(image2);
       
       
       try{
          Conn conn = new Conn();
          String query = "select * from customer where username ='"+username+"'";
          ResultSet rs = conn.s.executeQuery(query);
          while(rs.next()){
              
              labelusername.setText(rs.getString("username"));
              labelid.setText(rs.getString("id"));
              labelnumber.setText(rs.getString("number"));
              labelname.setText(rs.getString("name"));
              labelgender.setText(rs.getString("gender"));
              labelcontry.setText(rs.getString("contry"));
              labeladdress.setText(rs.getString("address"));
              labelphone.setText(rs.getString("phone"));
              labelemail.setText(rs.getString("email"));
          }
       }catch(Exception e){
           
       }
       setVisible(true);
    }

    
    public static void main(String[] args) {
        ViewCustomer viewCustomer = new ViewCustomer("mrunal");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    setVisible(false);
    }

    

   
}
