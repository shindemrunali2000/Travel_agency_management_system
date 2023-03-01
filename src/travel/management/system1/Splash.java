package travel.management.system1;


import javax.swing.*;
import java.awt.*;


   public class Splash extends JFrame implements Runnable{
       Thread thread;
      Splash(){
     //      setSize(1000,600);
          // setLocation(200,100);
           ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("Icon/splash.jpg"));
           Image i2 = il.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           JLabel image = new JLabel(i3);
           add(image);
           setVisible(true);
           thread = new Thread(this);
           thread.start();
           
       }

    /**
     *
     */
    @Override
      public void run(){
          try{
              Thread.sleep(7000);
              this.setVisible(false);
              new Login();
//              setVisible(true);
          }catch (Exception e){
              
          }
          
      }       public static void main(String[] args){       Splash frame = new Splash();
       int x=1;
           for(int i=1; i<=500; x+=7,i+=6){
               frame.setLocation(750-(x+i)/2,400-(i/2));
               frame.setSize(x+i, i);
               try{
                   Thread.sleep(50);
               }catch (Exception e){}
               
           }
           
          }
   }