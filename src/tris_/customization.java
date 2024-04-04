/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tris_;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author andrea
 */
public class customization extends javax.swing.JFrame {

    private boolean X1selected = false;
    private boolean X2selected = false;
    private boolean X3selected = false;
    private boolean O1selected = false;
    private boolean O2selected = false;
    private boolean O3selected = false;
    
    private boolean O2locked = true;
    private boolean O3locked = true;
    private boolean X2locked = true;
    private boolean X3locked = true;
    
    
    
    /**
     * Creates new form customization
     */
    public customization() {
        initComponents();
        setLocationRelativeTo(null);
        
        try {
            File file = new File("theme.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                String tmp = leggi.nextLine();
                if (tmp.equals("light")) {
                    jPanel1.setBackground(new Color(0, 204, 255));
                } else if (tmp.equals("dark")) {
                    jPanel1.setBackground(new Color(0, 153, 255 ));
                } else if (tmp.equals("auto")) {
                    if (Detector.isDarkMode()==true) {
                        jPanel1.setBackground(new Color(0, 153, 255 ));
                    } else {
                        jPanel1.setBackground(new Color(0, 204, 255));
                    }
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("X2lock.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("false")) {
                    X2locked = false;
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("X3lock.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("false")) {
                    X3locked = false;
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("O2lock.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("false")) {
                    O2locked = false;
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("O3lock.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("false")) {
                    O3locked = false;
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        try {
            File file = new File("X1.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    x1.setIcon(new ImageIcon(getClass().getResource("x1sel.png")));
                    X1selected=true;
                    X2selected=false;
                    X3selected=false;
                    
                    if(X2locked == false) {
                        x2.setIcon(new ImageIcon(getClass().getResource("X2.png")));
                    }
                    if (X3locked == false) {
                        x3.setIcon(new ImageIcon(getClass().getResource("X3.png")));
                    }
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("X2.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    x2.setIcon(new ImageIcon(getClass().getResource("x2sel.png")));
                    X1selected=false;
                    X2selected=true;
                    X3selected=false;
                    
                    
                    if (X3locked == false) {
                        x3.setIcon(new ImageIcon(getClass().getResource("X3.png")));
                    }
                    x1.setIcon(new ImageIcon(getClass().getResource("x1.png")));
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("X3.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    x3.setIcon(new ImageIcon(getClass().getResource("x3sel.png")));
                    X1selected=false;
                    X2selected=false;
                    X3selected=true;
                    
                    
                    
                    if (X2locked == false) {
                        x2.setIcon(new ImageIcon(getClass().getResource("X2.png")));
                    }
                    x1.setIcon(new ImageIcon(getClass().getResource("x1.png")));
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        
        
        try {
            File file = new File("O1.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    o1.setIcon(new ImageIcon(getClass().getResource("O1sel.png")));
                    O1selected=true;
                    O2selected=false;
                    O3selected=false;
                    
                    if(O2locked == false) {
                        o2.setIcon(new ImageIcon(getClass().getResource("O2.png")));
                    }
                    if (O3locked == false) {
                        o3.setIcon(new ImageIcon(getClass().getResource("O3.png")));
                    }
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("O2.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    o2.setIcon(new ImageIcon(getClass().getResource("O2sel.png")));
                    O1selected=false;
                    O2selected=true;
                    O3selected=false;
                    
                    
                    if (O3locked == false) {
                        o3.setIcon(new ImageIcon(getClass().getResource("O3.png")));
                    }
                    o1.setIcon(new ImageIcon(getClass().getResource("O1.png")));
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("O3.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    o3.setIcon(new ImageIcon(getClass().getResource("O3sel.png")));
                    O1selected=false;
                    O2selected=false;
                    O3selected=true;
                    
                    
                    
                    if (O2locked == false) {
                        o2.setIcon(new ImageIcon(getClass().getResource("O2.png")));
                    }
                    o1.setIcon(new ImageIcon(getClass().getResource("O1.png")));
                    
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
    
    

            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        x1 = new javax.swing.JButton();
        o3 = new javax.swing.JButton();
        o2 = new javax.swing.JButton();
        x3 = new javax.swing.JButton();
        x2 = new javax.swing.JButton();
        o1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/resources/x1.png"))); // NOI18N
        x1.setContentAreaFilled(false);
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        jPanel1.add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, 140));

        o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/resources/o3lock.png"))); // NOI18N
        o3.setContentAreaFilled(false);
        o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3ActionPerformed(evt);
            }
        });
        jPanel1.add(o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 140, 140));

        o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/resources/o2lock.png"))); // NOI18N
        o2.setContentAreaFilled(false);
        o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2ActionPerformed(evt);
            }
        });
        jPanel1.add(o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 140, 140));

        x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/resources/x3lock.png"))); // NOI18N
        x3.setContentAreaFilled(false);
        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });
        jPanel1.add(x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 140, 140));

        x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/resources/x2lock.png"))); // NOI18N
        x2.setContentAreaFilled(false);
        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });
        jPanel1.add(x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, 140));

        o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/resources/o1.png"))); // NOI18N
        o1.setContentAreaFilled(false);
        o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1ActionPerformed(evt);
            }
        });
        jPanel1.add(o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, 140));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("PERSONALIZE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X ICON");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("O ICON");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/bg3.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/bg3.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 290));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/resources/home.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
        // TODO add your handling code here:
        String punti = "";
        if (X2locked == true) {
            try {
            File file = new File("points.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                
                    punti = leggi.nextLine();
                    
                    
                
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int tmp = Integer.parseInt(punti);
            
            if (tmp>=100) {
                X2locked=false;
                System.out.println("DEBUG: X2 UNLOCKED");
                x2.setIcon(new ImageIcon(getClass().getResource("X2.png")));
                try (FileWriter scrivi = new FileWriter("x2lock.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            } else {
                System.out.println("DEBUG: NO POINTS");
            }
            
            
        } else {
            try (FileWriter scrivi = new FileWriter("x2.txt")) {
                            scrivi.write("true");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("x1.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("x3.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            x2.setIcon(new ImageIcon(getClass().getResource("x2sel.png")));
            X2selected = true;
            X1selected = false;
            X2selected = false;
            
            if(X3locked == false) {
                        x3.setIcon(new ImageIcon(getClass().getResource("X3.png")));
                    }
            x1.setIcon(new ImageIcon(getClass().getResource("x1.png")));
            
        }
    }//GEN-LAST:event_x2ActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
        try (FileWriter scrivi = new FileWriter("x2.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("x1.txt")) {
                            scrivi.write("true");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("x3.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
        x1.setIcon(new ImageIcon(getClass().getResource("x1sel.png")));
            X1selected = true;
            X2selected = false;
            X3selected = false;
            
            if(X3locked == false) {
                        x3.setIcon(new ImageIcon(getClass().getResource("X3.png")));
                    }
            if(X2locked == false) {
                        x2.setIcon(new ImageIcon(getClass().getResource("X2.png")));
                    }
            
    }//GEN-LAST:event_x1ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        // TODO add your handling code here:
        String punti = "";
        if (X3locked == true) {
            try {
            File file = new File("points.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                
                    punti = leggi.nextLine();
                    
                    
                
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int tmp = Integer.parseInt(punti);
            
            if (tmp>=200) {
                X3locked=false;
                System.out.println("DEBUG: X3 UNLOCKED");
                x3.setIcon(new ImageIcon(getClass().getResource("X3.png")));
                try (FileWriter scrivi = new FileWriter("x3lock.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            } else {
                System.out.println("DEBUG: NO POINTS");
            }
        } else {
            try (FileWriter scrivi = new FileWriter("x2.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("x1.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("x3.txt")) {
                            scrivi.write("true");
                        } catch (IOException e) {

                        } 
            x3.setIcon(new ImageIcon(getClass().getResource("x3sel.png")));
            X3selected = true;
            X1selected = false;
            X2selected = false;
            
            if(X2locked == false) {
                        x2.setIcon(new ImageIcon(getClass().getResource("X2.png")));
                    }
            x1.setIcon(new ImageIcon(getClass().getResource("x1.png")));
            
        }
    }//GEN-LAST:event_x3ActionPerformed

    private void o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1ActionPerformed
        // TODO add your handling code here:
        try (FileWriter scrivi = new FileWriter("O2.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("O1.txt")) {
                            scrivi.write("true");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("O3.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
        o1.setIcon(new ImageIcon(getClass().getResource("O1sel.png")));
            O1selected = true;
            O2selected = false;
            O3selected = false;
            
            if(O3locked == false) {
                        o3.setIcon(new ImageIcon(getClass().getResource("O3.png")));
                    }
            if(O2locked == false) {
                        o2.setIcon(new ImageIcon(getClass().getResource("O2.png")));
                    }
        
    }//GEN-LAST:event_o1ActionPerformed

    private void o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2ActionPerformed
        // TODO add your handling code here:
        String punti = "";
        if (O2locked == true) {
            try {
            File file = new File("points.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                
                    punti = leggi.nextLine();
                    
                    
                
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int tmp = Integer.parseInt(punti);
            
            if (tmp>=100) {
                O2locked=false;
                System.out.println("DEBUG: O2 UNLOCKED");
                o2.setIcon(new ImageIcon(getClass().getResource("O2.png")));
                try (FileWriter scrivi = new FileWriter("O2lock.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            } else {
                System.out.println("DEBUG: NO POINTS");
            }
        } else {
            try (FileWriter scrivi = new FileWriter("O2.txt")) {
                            scrivi.write("true");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("O1.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("O3.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            o2.setIcon(new ImageIcon(getClass().getResource("O2sel.png")));
            O2selected = true;
            O1selected = false;
            O3selected = false;
            
            if(O3locked == false) {
                        o3.setIcon(new ImageIcon(getClass().getResource("O3.png")));
                    }
            o1.setIcon(new ImageIcon(getClass().getResource("O1.png")));
            
        }
    }//GEN-LAST:event_o2ActionPerformed

    private void o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o3ActionPerformed
        // TODO add your handling code here:
        String punti = "";
        if (O3locked == true) {
              try {
            File file = new File("points.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                
                    punti = leggi.nextLine();
                    
                    
                
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int tmp = Integer.parseInt(punti);
            
            if (tmp>=200) {
                O3locked=false;
                System.out.println("DEBUG: O3 UNLOCKED");
                o3.setIcon(new ImageIcon(getClass().getResource("O3.png")));
                try (FileWriter scrivi = new FileWriter("O3lock.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            } else {
                System.out.println("DEBUG: NO POINTS");
            }
        } else {
            try (FileWriter scrivi = new FileWriter("O2.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("O1.txt")) {
                            scrivi.write("false");
                        } catch (IOException e) {

                        } 
            try (FileWriter scrivi = new FileWriter("O3.txt")) {
                            scrivi.write("true");
                        } catch (IOException e) {

                        } 
            o3.setIcon(new ImageIcon(getClass().getResource("O3sel.png")));
            O3selected = true;
            O1selected = false;
            O2selected = false;
            
            if(O2locked == false) {
                        o2.setIcon(new ImageIcon(getClass().getResource("O2.png")));
                    }
            o1.setIcon(new ImageIcon(getClass().getResource("o1.png")));
            
        }
    }//GEN-LAST:event_o3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new dashboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(customization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton o1;
    private javax.swing.JButton o2;
    private javax.swing.JButton o3;
    private javax.swing.JButton x1;
    private javax.swing.JButton x2;
    private javax.swing.JButton x3;
    // End of variables declaration//GEN-END:variables
}
