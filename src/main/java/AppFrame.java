
//import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import comp_decomp.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vidya
 */
public class AppFrame extends JFrame implements ActionListener{
    JButton compressbutton;
    JButton decompressbutton;
    JLabel label;
   
    AppFrame()
    {
        //close the frame once window is exit
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null); 
        this.setTitle("Compressor and Decompressor");
        label = new JLabel("Compressor and Decompressor");
        label.setBounds(270, 20, 800, 30);
        label.setFont(new Font("Serif", Font.PLAIN, 19));
        label.setForeground(Color.BLACK);
        
        
        
        //initialise button with title
        compressbutton = new JButton("Select file to compress");
        //set bonds to button with x , y ,width,height
        compressbutton.setBounds(50,100,200,30);
        //add action listener to the buttons
        compressbutton.addActionListener(this);
        decompressbutton = new JButton("Select file to decompress");
        decompressbutton.setBounds(500,100,200,30);
        decompressbutton.addActionListener(this);
        
         //set size of the frame
        this.setSize(800,500);
        //set backgraound color
       
        this.getContentPane().setBackground(Color.CYAN);
         this.setVisible(true);
        //add buttons to frame
        this.add(compressbutton);
        this.add(decompressbutton);
        this.add(label);
       
        //set visible
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==compressbutton)
        {
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION)
            {
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    Compressor.method(file);
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        
        }
        
        if(e.getSource()==decompressbutton)
        {
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION)
            {
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    Decompressor.method(file);
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        
        }
    }
    
}
