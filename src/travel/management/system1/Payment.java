
package travel.management.system1;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Payment extends JFrame implements ActionListener{

    static void addActionListener(Dashboard aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    JButton pay,back;
    Payment() throws IOException {
        setBounds(500,200,800,600);
         setLocation(200,100);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,0,800,600);
        add(Image);
        
        pay = new JButton("pay");
        pay.setBounds(420,0,80,40);
        pay.addActionListener(this);
        Image.add(pay);
        
        back = new JButton("Back");
        back.setBounds(520,0,80,40);
        back.addActionListener(this);
        Image.add(back);
        
        setVisible(true);
    }

   
    public static void main(String[] args) throws IOException  {
        Payment payment = new Payment();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==pay){
            setVisible(false);
            Paytm paytm = new Paytm();
            
        }else{
            setVisible(false);
        }
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}