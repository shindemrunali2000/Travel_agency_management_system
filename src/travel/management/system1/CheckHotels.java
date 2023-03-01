
package travel.management.system1;

import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable {
    
    Thread t1;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JLabel[] label = new JLabel[]{ l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
JLabel caption;
public void run(){
    String[] text = new String[]{"JW Marriott Hotel","Madarin oriental Hotel","Four seasons Hotel","redisson blue hotel","classio hatel","the bay club hotel","Breeze Blow Hotel ","the taj hotel","happy morning hotel"};
    try{
     for(int i=0;i<=9;i++){
       label[i].setVisible(true);
       caption.setText(text[i]);
       Thread.sleep(2500);
       label[i].setVisible(false);
     }   
    }catch(Exception e){
        e.printStackTrace();
    }
}


    CheckHotels(){
         
        setBounds(500,200,800,600);
         setLocation(200,100);
        
        caption = new JLabel();
        caption.setBounds(50,400,9000,70);
        caption.setFont(new Font("Tahoma",Font.PLAIN,40));
        caption.setForeground(Color.WHITE);
        add(caption);
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
        ImageIcon[] image = new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
        
        Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
        Image[] jimage = new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
        
        ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null;
        ImageIcon[] kimage = new ImageIcon[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};
        
        
        
        for(int i=0;i<=9;i++){
            
        image[i] = new ImageIcon(ClassLoader.getSystemResource("Icon/hotel"+(i+1)+".jpg"));
        jimage[i]= image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        kimage[i] = new ImageIcon(jimage[i]);
        label[i] = new JLabel(kimage[i]);
        label[i].setBounds(0,0,800,600);
        add(label[i]);
        }
        
        t1=new Thread(this);
        t1.start();
        setVisible(true);
    }
    public static void main(String[] args) {
        CheckHotels checkHotels = new CheckHotels();
    }
    
}
