/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tris_;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author andrea
 */
public class singleplayer extends javax.swing.JFrame {

    private int turn = 2;
    private int punteggio = 0;
    private int punteggio2 = 0;
    
    
    private boolean A1premuto= false;
    private boolean A2premuto= false;
    private boolean A3premuto= false;
    private boolean B1premuto= false;
    private boolean B2premuto= false;
    private boolean B3premuto= false;
    private boolean C1premuto= false;
    private boolean C2premuto= false;
    private boolean C3premuto= false;
    
    private boolean end = false;
    
    private int difficulty = 0; //0 = easy 1= normal 2 = hard
    private boolean fatto = false;
    
    
    private boolean X1 = false;
    private boolean X2 = false;
    private boolean X3 = false;
    
    private boolean O1 = false;
    private boolean O2 = false;
    private boolean O3 = false;
    
    private String Ximage;
    private String Oimage = "cerchio.png";
    
    
    
    /**
     * Creates new form singleplayer
     */
    public singleplayer() {
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
            File file = new File("x1.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    X1 = true;
                    Ximage = "X.png";
                    //Oimage = "cerchio.png";
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            File file = new File("x2.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    X2 = true;
                    Ximage = "secondotipo.png";
                    //Oimage = "cerchio.png";
                    
                    
                }
            } 
        } catch (FileNotFoundException ex) {
                Logger.getLogger(customization.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            File file = new File("x3.txt");
            Scanner leggi = new Scanner(file);
            while(leggi.hasNextLine()) {
                if (leggi.nextLine().equals("true")) {
                    X3 = true;
                    Ximage = "terzotipo.png";
                    //Oimage = "cerchio.png";
                    
                    
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
                    O1 = true;
                    
                    Oimage = "cerchio.png";
                    
                    
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
                    O2 = true;
                    
                    Oimage = "osectipo.png";
                    
                    
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
                    O3 = true;
                    
                    Oimage = "oterztipo.png";
                    
                    
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
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        punti = new javax.swing.JLabel();
        punti2 = new javax.swing.JLabel();
        xicon = new javax.swing.JButton();
        opicon = new javax.swing.JButton();
        guest = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        acc = new javax.swing.JTextField();
        C3 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/xmin.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/cerchiomin.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/icona.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/sel.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, -1));

        punti.setFont(new java.awt.Font("ITF Devanagari", 0, 200)); // NOI18N
        punti.setForeground(new java.awt.Color(255, 255, 255));
        punti.setText("0");
        jPanel1.add(punti, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 150));

        punti2.setFont(new java.awt.Font("ITF Devanagari", 0, 200)); // NOI18N
        punti2.setForeground(new java.awt.Color(255, 255, 255));
        punti2.setText("0");
        jPanel1.add(punti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, 150));

        xicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/avatarmp.png"))); // NOI18N
        xicon.setContentAreaFilled(false);
        xicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xiconActionPerformed(evt);
            }
        });
        jPanel1.add(xicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 90));

        opicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/ai.png"))); // NOI18N
        opicon.setContentAreaFilled(false);
        opicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opiconActionPerformed(evt);
            }
        });
        jPanel1.add(opicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, -1, 90));

        guest.setEditable(false);
        guest.setBackground(java.awt.Color.darkGray);
        guest.setForeground(new java.awt.Color(255, 255, 255));
        guest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guest.setText("AI");
        guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestActionPerformed(evt);
            }
        });
        jPanel1.add(guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 180, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Singleplayer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/bgmultiplayer.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/bgmultiplayer.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        acc.setEditable(false);
        acc.setBackground(java.awt.Color.darkGray);
        acc.setForeground(new java.awt.Color(255, 255, 255));
        acc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acc.setText("Account");
        jPanel1.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, 30));

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        C3.setContentAreaFilled(false);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 110, 110));

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        A1.setContentAreaFilled(false);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 110, 110));

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        A2.setContentAreaFilled(false);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 110, 110));

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        A3.setContentAreaFilled(false);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        jPanel1.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 110, 110));

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        B1.setContentAreaFilled(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, 110));

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        B2.setContentAreaFilled(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 110, 110));

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        B3.setContentAreaFilled(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 110, 110));

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        C1.setContentAreaFilled(false);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 110, 110));

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/quadrato.png"))); // NOI18N
        C2.setContentAreaFilled(false);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 110, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xiconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xiconActionPerformed

    private void opiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opiconActionPerformed
        // TODO add your handling code here:

        //selezione();
    }//GEN-LAST:event_opiconActionPerformed

    private void guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestActionPerformed

    private void ia () {
        
        
        if (difficulty == 0) {
            int numeroCasuale = (int) (Math.random() * 9) + 1;
        System.out.println(numeroCasuale);
        
        if (numeroCasuale == 1) {
            if (A1premuto == false) {
                A1.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                A1premuto = true;
                fatto = true;
            } 
        } else if (numeroCasuale == 2) {
                if (A2premuto == false) {
                     A2.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                     A2premuto = true;
                     fatto = true;
                }
            } if (numeroCasuale == 3) {
                if (A3premuto == false) {
                     A3.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                     A3premuto = true;
                     fatto = true;
                }
            } else if (numeroCasuale==4) {
                if (B1premuto == false) {
                     B1.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                     B1premuto = true;
                     fatto = true;
                }
            } else if (numeroCasuale==5) {
                if (B2premuto == false) {
                     B2.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                     B2premuto = true;
                     fatto = true;
                }
            } else if (numeroCasuale == 6) {
                if (B3premuto == false) {
                     B3.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                     B3premuto = true;
                     fatto = true;
                }
            } else if (numeroCasuale == 7) {
                if (C1premuto == false) {
                     C1.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                     C1premuto = true;
                     fatto = true;
                }
            } else if (numeroCasuale ==8) {
                if (C2premuto == false) {
                     C2.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                     C2premuto = true;
                     fatto = true;
                }
            } else if (numeroCasuale == 9) {
                if (C3premuto == false) {
                     C3.setIcon(new ImageIcon(getClass().getResource(Oimage)));
                     C3premuto = true;
                     fatto = true;
                }
            }
            if (fatto == true) {
                turn = 2;
                fatto = false;
            } else if (fatto == false) {
                ia();
            }
        } else if (difficulty == 1) {
            
           
            
            
            
        }
        
        
    }
    
    
    private int getStato (JButton casella) {
        
        if (X1 == true) {
          String temp = casella.getIcon() + "";
            //System.out.println(temp);
            if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/X.png")) {
                System.out.println("X");
                return 1;
            } else if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/cerchio.png")) {
                System.out.println("O");
                return 0;
            }
            
        } else if (X2 == true) {
          String temp = casella.getIcon() + "";
            //System.out.println(temp);
            if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/secondotipo.png")) {
                System.out.println("X");
                return 1;
            } else if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/cerchio.png")) {
                System.out.println("O");
                return 0;
            }
            
        } else if (X3 == true) {
          String temp = casella.getIcon() + "";
            //System.out.println(temp);
            if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/terzotipo.png")) {
                System.out.println("X");
                return 1;
            } else if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/cerchio.png")) {
                System.out.println("O");
                return 0;
            }
            
        } 
        
        
        if (O1 == true) {
          String temp = casella.getIcon() + "";
          
           // System.out.println(temp);
            if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/terzotipo.png")) {
                System.out.println("X");
                return 1;
            } else if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/cerchio.png")) {
                System.out.println("O");
                return 0;
            }
            
        } else if (O2 == true) {
          String temp = casella.getIcon() + "";
          
           // System.out.println(temp);
            if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/terzotipo.png")) {
                System.out.println("X");
                return 1;
            } else if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/osectipo.png")) {
                System.out.println("O");
                return 0;
            }
            
        } else if (O3 == true) {
          String temp = casella.getIcon() + "";
          
           // System.out.println(temp);
            if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/terzotipo.png")) {
                System.out.println("X");
                return 1;
            } else if (temp.equals("file:/Users/andrea/NetBeansProjects/Tris_/build/classes/tris_/oterztipo.png")) {
                System.out.println("O");
                return 0;
            }
            
        }
        
        return -1;
    }
    
    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        if (C3premuto == false) {

            if (turn==2) {
                C3.setIcon(new ImageIcon(getClass().getResource(Ximage)));
                turn = 1;
                C3premuto = true;
            } 
            getStato(C3);
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        if (A1premuto == false) {

            if (turn==2) {
                A1.setIcon(new ImageIcon(getClass().getResource(Ximage)));

                turn = 1;
                A1premuto = true;
            } 
            getStato(A1);
        }
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        if (A2premuto == false) {

            if (turn==2) {
                A2.setIcon(new ImageIcon(getClass().getResource(Ximage)));
                turn = 1;
                A2premuto = true;
            } 
            getStato(A2);
        }
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        if (A3premuto == false) {

            if (turn==2) {
                A3.setIcon(new ImageIcon(getClass().getResource(Ximage)));
                turn = 1;
                A3premuto = true;
            } 
            getStato(A3);
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if (B1premuto == false) {

            if (turn==2) {
                B1.setIcon(new ImageIcon(getClass().getResource(Ximage)));
                turn = 1;
                B1premuto = true;
            } 
            getStato(B1);
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void reset () {
        A1.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        A2.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        A3.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        B1.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        B2.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        B3.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        C1.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        C2.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        C3.setIcon(new ImageIcon(getClass().getResource("quadrato.png")));
        
        A1premuto = false;
        A2premuto = false;
        A3premuto = false;
        B1premuto = false;
        B2premuto = false;
        B3premuto = false;
        C1premuto = false;
        C2premuto = false;
        C3premuto = false;
    }
    
    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if (B2premuto == false) {

            if (turn==2) {
                B2.setIcon(new ImageIcon(getClass().getResource(Ximage)));
                turn = 1;
                B2premuto = true;
            } 
            getStato(B2);
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if (B3premuto == false) {

            if (turn==2) {
                B3.setIcon(new ImageIcon(getClass().getResource(Ximage)));
                turn = 1;
                B3premuto = true;
            }
            getStato(B3);
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        if (C1premuto == false) {

            if (turn==2) {
                C1.setIcon(new ImageIcon(getClass().getResource(Ximage)));
                turn = 1;
                C1premuto = true;
            } 
            getStato(C1);
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        if (C2premuto == false) {

            if (turn==2) {
                C2.setIcon(new ImageIcon(getClass().getResource(Ximage)));
                turn = 1;
                C2premuto = true;
            } 
            getStato(C2);
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
        //System.out.println("prova");
        //prima riga
        if (getStato(A1) != -1 || getStato(A2) != -1 || getStato(A3) != -1) {
            if (getStato(A1)==getStato(A2) ) {
                if (getStato(A2) == getStato (A3)) {
                    System.out.println("uguali");
                    if (getStato(A1) == 1) {

                        punteggio += 1;
                        String temp = punteggio + "";
                        punti.setText(temp);
                    } else if (getStato(A1) == 0) {
                        punteggio2 += 1;
                        String temp = punteggio2 + "";
                        punti2.setText(temp);
                    }

                    reset();
                }

            }
        }

        //Seconda riga
        if (getStato(B1) != -1 || getStato(B2) != -1 || getStato(B3) != -1) {
            if (getStato(B1)==getStato(B2) ) {
                if (getStato(B2) == getStato (B3)) {
                    System.out.println("uguali");
                    if (getStato(B1) == 1) {

                        punteggio += 1;
                        String temp = punteggio + "";
                        punti.setText(temp);
                    } else if (getStato(B1) == 0) {
                        punteggio2 += 1;
                        String temp = punteggio2 + "";
                        punti2.setText(temp);
                    }

                    reset();
                }

            }
        }

        //terza riga
        if (getStato(C1) != -1 || getStato(C2) != -1 || getStato(C3) != -1) {
            if (getStato(C1)==getStato(C2) ) {
                if (getStato(C2) == getStato (C3)) {
                    System.out.println("uguali");
                    if (getStato(C1) == 1) {

                        punteggio += 1;
                        String temp = punteggio + "";
                        punti.setText(temp);
                    } else if (getStato(C1) == 0) {
                        punteggio2 += 1;
                        String temp = punteggio2 + "";
                        punti2.setText(temp);
                    }

                    reset();
                }

            }
        }

        //colonna 1
        if (getStato(A1) != -1 || getStato(B1) != -1 || getStato(C1) != -1) {
            if (getStato(A1)==getStato(B1) ) {
                if (getStato(B1) == getStato (C1)) {
                    System.out.println("uguali");
                    if (getStato(A1) == 1) {

                        punteggio += 1;
                        String temp = punteggio + "";
                        punti.setText(temp);
                    } else if (getStato(A1) == 0) {
                        punteggio2 += 1;
                        String temp = punteggio2 + "";
                        punti2.setText(temp);
                    }

                    reset();
                }

            }
        }

        //colonna 2
        if (getStato(A2) != -1 || getStato(B2) != -1 || getStato(C2) != -1) {
            if (getStato(A2)==getStato(B2) ) {
                if (getStato(B2) == getStato (C2)) {
                    System.out.println("uguali");
                    if (getStato(A2) == 1) {

                        punteggio += 1;
                        String temp = punteggio + "";
                        punti.setText(temp);
                    } else if (getStato(A2) == 0) {
                        punteggio2 += 1;
                        String temp = punteggio2 + "";
                        punti2.setText(temp);
                    }

                    reset();
                }

            }
        }

        //colonna 3
        if (getStato(A3) != -1 || getStato(B3) != -1 || getStato(C3) != -1) {
            if (getStato(A3)==getStato(B3) ) {
                if (getStato(B3) == getStato (C3)) {
                    System.out.println("uguali");
                    if (getStato(A3) == 1) {

                        punteggio += 1;
                        String temp = punteggio + "";
                        punti.setText(temp);
                    } else if (getStato(A3) == 0) {
                        punteggio2 += 1;
                        String temp = punteggio2 + "";
                        punti2.setText(temp);
                    }

                    reset();
                }

            }
        }

        //diagonale da sinistra
        if (getStato(A1) != -1 || getStato(B2) != -1 || getStato(C3) != -1) {
            if (getStato(A1)==getStato(B2) ) {
                if (getStato(B2) == getStato (C3)) {
                    System.out.println("uguali");
                    if (getStato(A1) == 1) {

                        punteggio += 1;
                        String temp = punteggio + "";
                        punti.setText(temp);
                    } else if (getStato(A1) == 0) {
                        punteggio2 += 1;
                        String temp = punteggio2 + "";
                        punti2.setText(temp);
                    }

                    reset();
                }

            }
        }

        //diagonale da destra
        if (getStato(A3) != -1 || getStato(B2) != -1 || getStato(C1) != -1) {
            if (getStato(A3)==getStato(B2) ) {
                if (getStato(B2) == getStato (C1)) {
                    System.out.println("uguali");
                    if (getStato(A3) == 1) {

                        punteggio += 1;
                        String temp = punteggio + "";
                        punti.setText(temp);
                    } else if (getStato(A3) == 0) {
                        punteggio2 += 1;
                        String temp = punteggio2 + "";
                        punti2.setText(temp);
                    }

                    reset();
                }

            }
        }

        //parita
        if (getStato(A1) != -1 && getStato(A2) != -1 && getStato(A3) != -1 && getStato(B1) != -1 && getStato(B2) != -1 && getStato(B3) != -1 && getStato(C1) != -1 && getStato(C2) != -1 && getStato(C3) != -1) {
            System.out.println("stallo");
            reset();
        }

        if (turn == 1) {
            jLabel6.setIcon(new ImageIcon(getClass().getResource("icona.png")));
            jLabel7.setIcon(new ImageIcon(getClass().getResource("sel.png")));
        } else {
            jLabel6.setIcon(new ImageIcon(getClass().getResource("sel.png")));
            jLabel7.setIcon(new ImageIcon(getClass().getResource("icona.png")));
        }

        int puntiv = Integer.parseInt(punti.getText());
        int puntiv2 = Integer.parseInt(punti2.getText());

        if (puntiv == 5 && end==false) {
            System.out.println("Vittoria X");
            end = true;
            this.setVisible(false);
            new VittoriaX().setVisible(true);

        } else if (puntiv2 == 5 && end==false) {
            System.out.println("vittoria O");
            end=true;
            this.setVisible(false);
            new VittoriaAI().setVisible(true);
        }
        
        System.out.println(turn);
        if (turn == 1) {
          ia();  
        }
        
    }//GEN-LAST:event_jPanel1MouseMoved

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
            java.util.logging.Logger.getLogger(singleplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singleplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singleplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singleplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singleplayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JTextField acc;
    private javax.swing.JTextField guest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton opicon;
    private javax.swing.JLabel punti;
    private javax.swing.JLabel punti2;
    private javax.swing.JButton xicon;
    // End of variables declaration//GEN-END:variables
}
