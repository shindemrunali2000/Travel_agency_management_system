
package travel.management.system1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public  class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackages,viewpackages;
    JButton viewhotels,destinations,viewbookedhotel ,Payment, bookhotel ;
    JButton calculators,notepad,about,deletePersonalDetails;
    
    Dashboard(String username){
        this.username=username;
     //   setBounds(0,0,1500,1000);
     setExtendedState(JFrame.MAXIMIZED_BOTH);
     setLayout(null);
     
     
     JPanel P1 = new JPanel();
     P1.setLayout(null);
     P1.setBackground(new Color(0,0,102));
     P1.setBounds(0,0,1600,65);
     add(P1);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/Dashboard.png"));
     Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel icon = new JLabel(i3);
     icon.setBounds(5,0,70,70);
     P1.add(icon);
     
     
     JLabel heading = new JLabel("Dashboard");
     heading.setBounds(80,10,300,40);
     heading.setForeground(Color.WHITE);
     heading.setFont(new Font("tahoma",Font.BOLD,30));
     P1.add(heading);
     
     
      JPanel P2 = new JPanel();
     P2.setLayout(null);
     P2.setBackground(new Color(0,0,102));
     P2.setBounds(0,65,300,900);
     add(P2);
     
     addPersonalDetails = new JButton("Add personal Details");
     addPersonalDetails.setBounds(0,0,300,36);
     addPersonalDetails.setBackground(new Color(0,0,102));
     addPersonalDetails.setForeground(Color.WHITE);
     addPersonalDetails.setFont(new Font("Tahona",Font.PLAIN,20));
     addPersonalDetails.setMargin(new Insets(0,0,0,60));
     addPersonalDetails.addActionListener(this);
     P2.add(addPersonalDetails);
     
     updatePersonalDetails = new JButton("update personal Details");
     updatePersonalDetails.setBounds(0,36,300,36);
     updatePersonalDetails.setBackground(new Color(0,0,102));
     updatePersonalDetails.setForeground(Color.WHITE);
     updatePersonalDetails.setFont(new Font("Tahona",Font.PLAIN,20));
     updatePersonalDetails.setMargin(new Insets(0,0,0,30));
     updatePersonalDetails.addActionListener(this);
     P2.add(updatePersonalDetails);
     
     
     viewPersonalDetails = new JButton("view Details");
     viewPersonalDetails.setBounds(0,72,300,36);
     viewPersonalDetails.setBackground(new Color(0,0,102));
     viewPersonalDetails.setForeground(Color.WHITE);
     viewPersonalDetails.setFont(new Font("Tahona",Font.PLAIN,20));
     viewPersonalDetails.setMargin(new Insets(0,0,0,130));
     viewPersonalDetails.addActionListener(this);
     P2.add(viewPersonalDetails);
     
     deletePersonalDetails = new JButton("delete personal Details");
     deletePersonalDetails.setBounds(0,108,300,36);
     deletePersonalDetails.setBackground(new Color(0,0,102));
     deletePersonalDetails.setForeground(Color.WHITE);
     deletePersonalDetails.setFont(new Font("Tahona",Font.PLAIN,20));
     deletePersonalDetails.setMargin(new Insets(0,0,0,40));
     deletePersonalDetails.addActionListener(this);
     P2.add(deletePersonalDetails);
     
     checkpackages = new JButton("check packages");
     checkpackages.setBounds(0,144,300,36);
     checkpackages.setBackground(new Color(0,0,102));
     checkpackages.setForeground(Color.WHITE);
     checkpackages.setFont(new Font("Tahona",Font.PLAIN,20));
     checkpackages.setMargin(new Insets(0,0,0,110));
     checkpackages.addActionListener(this);
     P2.add(checkpackages);
     
     
     bookpackages = new JButton("book packages");
     bookpackages.setBounds(0,180,300,36);
     bookpackages.setBackground(new Color(0,0,102));
     bookpackages.setForeground(Color.WHITE);
     bookpackages.setFont(new Font("Tahona",Font.PLAIN,20));
     bookpackages.setMargin(new Insets(0,0,0,120));
     bookpackages.addActionListener(this);
     P2.add(bookpackages);
     
     viewpackages = new JButton("view packages");
     viewpackages.setBounds(0,216,300,36);
     viewpackages.setBackground(new Color(0,0,102));
     viewpackages.setForeground(Color.WHITE);
     viewpackages.setFont(new Font("Tahona",Font.PLAIN,20));
     viewpackages.setMargin(new Insets(0,0,0,110));
     viewpackages.addActionListener(this);
     P2.add(viewpackages);
     
     viewhotels = new JButton("view Hotels");
     viewhotels.setBounds(0,252,300,36);
     viewhotels.setBackground(new Color(0,0,102));
     viewhotels.setForeground(Color.WHITE);
     viewhotels.setFont(new Font("Tahona",Font.PLAIN,20));
     viewhotels.setMargin(new Insets(0,0,0,130));
     viewhotels.addActionListener(this);
     P2.add(viewhotels);
     
     bookhotel = new JButton("Book Hotel");
     bookhotel.setBounds(0,288,300,36);
     bookhotel.setBackground(new Color(0,0,102));
     bookhotel.setForeground(Color.WHITE);
     bookhotel.setFont(new Font("Tahona",Font.PLAIN,20));
     bookhotel.setMargin(new Insets(0,0,0,140));
     bookhotel.addActionListener(this);
     P2.add(bookhotel);
     
     
     viewbookedhotel = new JButton("view Booked Hotel");
     viewbookedhotel.setBounds(0,324,300,36);
     viewbookedhotel.setBackground(new Color(0,0,102));
     viewbookedhotel.setForeground(Color.WHITE);
     viewbookedhotel.setFont(new Font("Tahona",Font.PLAIN,20));
     viewbookedhotel.setMargin(new Insets(0,0,0,70));
     viewbookedhotel.addActionListener(this);
     P2.add(viewbookedhotel);
     
     destinations = new JButton("Destinations");
     destinations.setBounds(0,360,300,36);
     destinations.setBackground(new Color(0,0,102));
     destinations.setForeground(Color.WHITE);
     destinations.setFont(new Font("Tahona",Font.PLAIN,20));
     destinations.setMargin(new Insets(0,0,0,140));
     destinations.addActionListener(this);
     P2.add(destinations);
     
     Payment = new JButton("Payments");
     Payment.setBounds(0,396,300,36);
     Payment.setBackground(new Color(0,0,102));
     Payment.setForeground(Color.WHITE);
     Payment.setFont(new Font("Tahona",Font.PLAIN,20));
     Payment.setMargin(new Insets(0,0,0,155));
     Payment.addActionListener(this);
     P2.add(Payment);
     
     calculators = new JButton("Calculators");
     calculators.setBounds(0,432,300,36);
     calculators.setBackground(new Color(0,0,102));
     calculators.setForeground(Color.WHITE);
     calculators.setFont(new Font("Tahona",Font.PLAIN,20));
     calculators.setMargin(new Insets(0,0,0,145));
     calculators.addActionListener(this);
     P2.add(calculators);
     
     notepad = new JButton("notepad");
     notepad.setBounds(0,468,300,36);
     notepad.setBackground(new Color(0,0,102));
     notepad.setForeground(Color.WHITE);
     notepad.setFont(new Font("Tahona",Font.PLAIN,20));
     notepad.setMargin(new Insets(0,0,0,155));
     notepad.addActionListener(this);
     P2.add(notepad);
     
     about  = new JButton("About");
     about.setBounds(0,504,300,36);
     about.setBackground(new Color(0,0,102));
     about.setForeground(Color.WHITE);
     about.setFont(new Font("Tahona",Font.PLAIN,20));
     about.setMargin(new Insets(0,0,0,175));
     about.addActionListener(this);
     P2.add(about);
     
     ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icon/home.jpg"));
     Image i5 = i4.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT);
     ImageIcon i6 = new ImageIcon(i5);
     JLabel image = new JLabel(i6);
     image.setBounds(0,0,1650,1000);
     
     JLabel text = new JLabel("Travel and Touries Management System");
     text.setBounds(400,70,1200,70);
     text.setForeground(Color.WHITE);
     text.setFont(new Font("Relway", Font.PLAIN,40));
     image.add(text);
     
     
     add(image);
     
     
        setVisible(true);
    }

    
    public static void main(String[] args) {
        
        Dashboard dashboard = new Dashboard("");
    }

    Dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
@Override
    public void actionPerformed(ActionEvent ae) {
        
     if(ae.getSource()==addPersonalDetails){
         AddCustomer addCustomer = new AddCustomer(username);
       //  try {
        //     AddCostomer addCostomer = new AddCostomer(username);
        // } catch (SQLException ex) {
        //     Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        // }
         
     }  else if(ae.getSource()==viewPersonalDetails){
         ViewCustomer viewCustomer = new ViewCustomer(username);
     }else if(ae.getSource()==updatePersonalDetails){
         UpdateCustomer updateCustomer = new UpdateCustomer(username);
     }else if(ae.getSource()==checkpackages){
         CheckPackages checkPackages = new CheckPackages();
     }else if(ae.getSource()==bookpackages){
         BookPackage bookPackage = new BookPackage(username);
    
    }else if(ae.getSource()==viewpackages){
         ViewPackage viewPackage = new ViewPackage(username);

   }else if(ae.getSource()==viewhotels){
        CheckHotels checkHotels = new CheckHotels();


} else if(ae.getSource()==destinations){
            Destination destination = new Destination();
}else if(ae.getSource()==viewbookedhotel){
            ViewBookHotel viewBookHotel = new ViewBookHotel(username);
}else if(ae.getSource()== bookhotel){
            BookHotel bookhotel = new BookHotel(username);
            
}else if(ae.getSource()== deletePersonalDetails){
            DeleteDetails DeletePersonalDetails = new DeleteDetails(username);
}else if (ae.getSource()== Payment ){
         try {
             Payment payment = new Payment();
         } catch (IOException ex) {
             Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
         }
}else if(ae.getSource()==calculators){
    try {
        Runtime.getRuntime().exec("calc.exe");
    }catch (Exception e){
    }
}
 else if(ae.getSource()==notepad){
    try {
        Runtime.getRuntime().exec("notepad.exe");
    }catch (Exception e){
    }
}else if (ae.getSource()==about){
         About about1 = new About();
}
}
    
}