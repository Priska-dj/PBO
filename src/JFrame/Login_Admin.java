/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ACER
 */
public class Login_Admin extends JFrame {
    private JButton login,cancel;
    private JLabel labelUsername, labelpassword, judul;
    private JTextField textUsername;
    private JPasswordField textPassword;
    int hitung=0;
    
    public Login_Admin(){
        setSize(400, 345);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        judul = new JLabel();
        judul.setText("Login Admin");
        judul.setBounds(120, 50, 180, 25);
        judul.setFont(new Font("Times new roman", Font.BOLD, 30));
        add(judul);
        labelUsername = new JLabel();
        labelUsername.setText("Username");
        labelUsername.setBounds(70, 110, 90, 20);
        labelUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(labelUsername);
        textUsername = new JTextField();
        textUsername.setBounds(165, 110, 150, 25);
        add(textUsername);
        labelpassword = new JLabel();
        labelpassword.setText("Password");
        labelpassword.setBounds(70, 150, 90, 20);
        labelpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(labelpassword);
        textPassword = new JPasswordField();
        textPassword.setBounds(165, 150, 150, 25);
        add(textPassword);
        login = new JButton("Login");
        login.setBounds(165, 240, 65, 25);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textUsername.getText().toString();
                String passwd = textPassword.getText().toString();

                if (textUsername.getText().equals("Priska") && textPassword.getText().equals("0000")) {
                    JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Login");
                    dispose();
                    new Tampilan_Kedua().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Username/Password Salah!");
                    hitung++;
                }
                if (hitung == 3) {
                    JOptionPane.showMessageDialog(null, "Anda Sudah Gagal Login. Harap Coba Lagi Nanti . . .");
                    System.exit(1);
                }
            }
        });
        add(login);
        cancel = new JButton("Cancel");
        cancel.setBounds(245, 240, 75, 25);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                dispose();
                new Tampilan_Awal().setVisible(true);
            }
        });
        add(cancel);
    }
}
