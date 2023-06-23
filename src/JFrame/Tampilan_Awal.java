/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
import JFrame.Login_Kasir;
import JFrame.Login_Admin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import consol.*;

/**
 *
 * @author ACER
 */
public class Tampilan_Awal extends JFrame{
        JButton LOginAdmin = new JButton("Login Admin");
        JButton LOginKasir = new JButton("Login Kasir");
    
    public Tampilan_Awal(){
        setSize(300, 300);
        setTitle("Menu Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        LOginAdmin.setBounds(80, 55, 110, 30);
        LOginAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                new Login_Admin().setVisible(true); 
                
            }
        });
        add(LOginAdmin);
        LOginKasir.setBounds(80, 110, 110, 30);
        LOginKasir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            dispose();
            new Login_Kasir().setVisible(true);
            }
        });
        add(LOginKasir);
    }
}
