package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JButton selesai;
    private JButton cek;
    private JLabel output1;
    private JLabel output2;
    private JLabel output3;
    private JLabel output4;
    private JLabel output5;
    private JLabel output6;
    private JLabel output7;
    private JLabel output8;


    public FormBiodata() {
        cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textNama
                String nama = textNama.getText();
                //Mengambil data dari textNim
                String nim = textNIM.getText();

                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                output1.setText("Nama : " + mhs.getNama());
                output2.setText("Nim : " + mhs.getNim());
                output3.setText("Jenjang Pendidikan : " + mhs.getJenjang());
                output4.setText("Tahun masuk : " + mhs.getTahun());
                output5.setText("Fakultas : " + mhs.getFakultas());
                output6.setText("Jurusan : " + mhs.getJurusan());
                output7.setText("Jenis Kelamin : " + mhs.getJenisKelamin());
                output8.setText("Nomor Urut : " + mhs.getNomorurut());
            }
        });
        selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}



