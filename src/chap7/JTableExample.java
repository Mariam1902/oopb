package chap7;

import javax.swing.*;

public class JTableExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JTable tblData;
        JScrollPane scp;

        frm = new JFrame("JFrame Example ");
        frm.setSize(450, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object rowData[][] = {
            {"5001","Yada Jaidee","yadaj@gmail.com"},
            {"5002","Manee Siri","manees@hotmail.com"},
            {"5003","Piti Metta","pitpm@gmail.com"},
            {"5004","Peera Sukjai","peeras@hotmail.com"},
        };
        String columnNames[] = {"ID","Name","e-mail"};
        tblData = new JTable(rowData,columnNames);
        scp = new JScrollPane(tblData);
        
        frm.add(scp);
        frm.setVisible(true);
    }
}
