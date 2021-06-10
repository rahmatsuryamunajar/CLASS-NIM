package gui.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleTable1 {
    private JPanel rootPanel;
    private JTextField textNama;
    private JTextField textEmail;
    private JTextField textHP;
    private JButton buttonSave;
    private JTable tableBiodata;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ExampleTable1() {
        this.initComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String email =  textEmail.getText();
                String hp = textHP.getText();
                if (nama.isBlank() || email.isBlank() || hp.isBlank()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else{
                    tableModel.addRow(new Object[]{nama, email, hp});
                    //clear textfields
                    textNama.setText("");
                    textEmail.setText("");
                    textHP.setText("");
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom ={
                "Nama",
                "Email",
                "HP"
        };
        Object[][] initData = {
                {"Rahmat Surya Munajar", "rahmat@gmail.com", "082284871680"},
                {"Siti Aisyah", "aisyah@gmail.com", "085272277012"},
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tableBiodata.setModel(tableModel);
        //menampilkan sorting disetiap kolom
        tableBiodata.setAutoCreateRowSorter(true);
        //enable singel selection
        tableBiodata.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
