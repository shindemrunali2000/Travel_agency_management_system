
package travel.management.system1;

import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class Paytm extends JFrame implements ActionListener{
    //JButton back;
    Paytm(){
        
       setBounds(500,200,800,600);
        setLocation(200,100);
       JEditorPane pane = new JEditorPane();
       pane.setEditable(false);
       
       try{
          pane.setPage("https://www.paypal.com/signin"); 
       }catch(IOException e){
          pane.setContentType("text/html");
          pane.setText("<html>Could not load, Error 404</html>");
       }
       
       JScrollPane sp = new JScrollPane(pane);
       getContentPane().add(sp);
       
       JButton back = new JButton("Back");
       back.setBounds(610,20,80,40);
       back.addActionListener(this);
       pane.add(back);
       
       setVisible(true);
       
    }
    public static void main(String args[]){
        Paytm paytm = new Paytm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            setVisible(false);
            var payment = new Payment();
        } catch (IOException ex) {
            Logger.getLogger(Paytm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
