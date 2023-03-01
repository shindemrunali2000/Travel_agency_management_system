package travel.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.ResultSet;

public class ViewBookHotel extends JFrame  implements ActionListener {
    JButton back;
    ViewBookHotel(String username){
         
       setBounds(400,200,1000,600);
        setLocation(200,100);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel text = new JLabel("VIEW Book Hotel DETAILS");
       text.setFont(new Font("Tahoma",Font.BOLD,20));
       text.setBounds(60,0,300,30);
       add(text);
       
       JLabel lblusername = new JLabel("Username");
       lblusername.setBounds(30,50,150,25);
       add(lblusername);
       
       JLabel labelusername = new JLabel();
       labelusername.setBounds(220,50,150,25);
       add(labelusername);
       
       JLabel lblpackage = new JLabel("Hotel Name");
       lblpackage.setBounds(30,90,150,25);
       add(lblpackage);
       
       JLabel labelpackage = new JLabel();
       labelpackage.setBounds(220,90,150,25);
       add(labelpackage);
       
       
       JLabel lblnumber = new JLabel("Total Persons");
       lblnumber.setBounds(30,130,150,25);
       add(lblnumber);
       
       JLabel labelpersons = new JLabel();
       labelpersons.setBounds(220,130,150,25);
       add(labelpersons);
       
       JLabel lbldays = new JLabel("Total Days");
       lbldays.setBounds(30,170,150,25);
       add(lbldays);
       
       JLabel labeldays = new JLabel();
       labeldays.setBounds(220,170,150,25);
       add(labeldays);
       
       JLabel lblac= new JLabel("Ac/non AC");
       lblac.setBounds(30,210,150,25);
       add(lblac);
       
       JLabel labelac = new JLabel();
       labelac.setBounds(220,210,150,25);
       add(labelac);
       
       JLabel lblFood = new JLabel("Food included");
       lblFood.setBounds(30,250,150,25);
       add(lblFood);
       
       JLabel labelFood= new JLabel();
       labelFood.setBounds(220,250,150,25);
       add(labelFood);
       
       
       JLabel lblname = new JLabel("Id");
       lblname.setBounds(30,290,150,25);
       add(lblname);
       
       JLabel labelid = new JLabel();
       labelid.setBounds(220,290,150,25);
       add(labelid);
       
       
       JLabel lblgender = new JLabel("Number");
       lblgender.setBounds(30,330,150,25);
       add(lblgender);
       
       JLabel labelnumber = new JLabel();
       labelnumber.setBounds(220,330,150,25);
       add(labelnumber);
       
       JLabel lblcontry = new JLabel("phone");
       lblcontry.setBounds(30,370,150,25);
       add(lblcontry);
       
       JLabel labelphone = new JLabel();
       labelphone.setBounds(220,370,150,25);
       add(labelphone);
       
       JLabel lbladdress = new JLabel("Total Cost");
       lbladdress.setBounds(30,410,150,25);
       add(lbladdress);
       
       JLabel labelprice= new JLabel();
       labelprice.setBounds(220,410,150,25);
       add(labelprice);
       
       
       
       
       back = new JButton("Back");
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setBounds(130,460,100,25);
       back.addActionListener(this);
       
       add(back);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/dest5.jpg"));
       Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(450,20,500,400);
       add(image);
       
       
       
       
       
       try{
          Conn conn = new Conn();
          String query = "select * from bookhotel where username ='"+username+"'";
          ResultSet rs = conn.s.executeQuery(query);
          while(rs.next()){
              
              labelusername.setText(rs.getString("username"));
              labelid.setText(rs.getString("id"));
              labelnumber.setText(rs.getString("number"));
              labelpackage.setText(rs.getString("name"));
              labelprice.setText(rs.getString("price"));
              labelphone.setText(rs.getString("phone"));
              labelpersons.setText(rs.getString("persons"));
              labelFood.setText(rs.getString("food"));
              labelac.setText(rs.getString("ac"));
              labeldays.setText(rs.getString("days"));
          }
       }catch(SQLException e){
           
       }
       setVisible(true);
    }

    
    public static void main(String[] args) {
        ViewBookHotel viewBookHotel = new ViewBookHotel("mrunal");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    setVisible(false);
    }

    

   
}
