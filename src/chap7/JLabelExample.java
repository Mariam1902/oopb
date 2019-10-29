package chap7;

import java.awt.Font;
import javax.swing.*;

public class JLabelExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JPanel pnl;
        JLabel lbl1, lbl2;
        
        frm = new JFrame("JErameExample");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbl1 = new JLabel("ilove Objet-Oriented Programming");
        lbl1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl2 = new JLabel("ilove GUI");
        lbl2.setFont(new Font("Tahoma", Font.BOLD, 16));
        
        pnl = new JPanel();
        pnl.add(lbl1);
        pnl.add(lbl2);
        
        frm.add(pnl);
        frm.setVisible(true);
        
    }
    
}
