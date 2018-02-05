/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbs;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.exit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Zero
 */
public class Mainf extends javax.swing.JFrame {

    /**
     * Creates new form mainf
     */
    public Mainf() {
        initComponents();
        getContentPane().setBackground(Color.lightGray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sh = new javax.swing.JTextField();
        ch = new javax.swing.JTextField();
        re = new javax.swing.JTextField();
        ds = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dq = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dayy = new javax.swing.JCheckBox();
        nightt = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        aaa = new javax.swing.JComboBox<>();
        da = new org.jdesktop.swingx.JXDatePicker();
        mregular = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mrate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mdes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel1.setText("Date");

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel2.setText("Starting Hour");

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel3.setText("Closing Hour");

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel4.setText("Rent");

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel5.setText("Diesel Rate");

        sh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shActionPerformed(evt);
            }
        });

        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });

        ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel6.setText("Diesel ");

        dq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel8.setText("Shift");

        dayy.setFont(new java.awt.Font("Myriad Pro", 1, 11)); // NOI18N
        dayy.setText("Day");

        nightt.setFont(new java.awt.Font("Myriad Pro", 1, 11)); // NOI18N
        nightt.setText("Night");

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel9.setText("Vechical ");

        aaa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "v1", "v2", "v3", "v4" }));
        aaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aaaActionPerformed(evt);
            }
        });

        da.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daActionPerformed(evt);
            }
        });

        mregular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nothing", "Engine oil \t        250", "Hydraulic oil\t        1000", "Hydraulic strainer  250", "Air filter                 250", "Diesel filter\t         250", "Track motor oil       1000", "Swing motor oil       500", "Swing bearing         500" }));
        mregular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mregularActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel11.setText("Maintance Regular ");

        jLabel12.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel12.setText("Maintance RS");

        mrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel13.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(104, 104, 104)
                                .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(90, 90, 90))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(130, 130, 130)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(re, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dq, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ds, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nightt)
                                            .addComponent(dayy)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sh, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mregular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mdes, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(mrate))
                                .addGap(55, 55, 55)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(sh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(ds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(dq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dayy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nightt))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(mregular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(mrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(mdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(301, 301, 301)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void shActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shActionPerformed

    private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reActionPerformed

    private void dsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsActionPerformed

    private void dqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // date picker
    Date oDate = da.getDate();        
    DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    String dateS = sdf.format(oDate);
        
                // vechical name
           String vname=(String)aaa.getSelectedItem();
          // st is strating hour
          int shour=Integer.parseInt(sh.getText());
          // cl is closing hour
          int chour=Integer.parseInt(ch.getText());
          // r is rent
          int rent=Integer.parseInt(re.getText());
          // dr is diesel rate
          int drate=Integer.parseInt(ds.getText());
          //dq is diesel quantity 
          int dquant=Integer.parseInt(dq.getText());
          // regular maintance
           String maregular=(String)mregular.getSelectedItem();
           // maintance rate
           int marate=Integer.parseInt(mrate.getText());
           // maintance Description
           String mades=mdes.getText();
          
            // total hour running
          int dif=chour-shour;
          // today running
          int ea=dif*rent;
          // total earning
          int tot=(ea-(dquant*drate))-marate;
          String day="",ni8="";
          // shift type   seletion    
            if(dayy.isSelected())    
            day="Day";
            if(nightt.isSelected())    
             ni8="Night";    
           String sf=day+"/"+ni8; 
           
           FileInputStream FILE_NAME = null; 
        try {
            FILE_NAME = new FileInputStream("test.xlsx");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mainf.class.getName()).log(Level.SEVERE, null, ex);
        }

        XSSFWorkbook workbook = null;
        XSSFSheet sheet = null ;
        try {
                workbook = new XSSFWorkbook(FILE_NAME ); //If there is already data in a workbook
                sheet = workbook.getSheetAt(0);
           
        } catch (IOException ex) {
            Logger.getLogger(Mainf.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        Object[][] datatypes = {
                {dateS,vname,sf,shour,chour,rent,dif,drate,dquant,ea,maregular,marate,tot,mades}              
        };

        int rowNum =sheet.getLastRowNum();
        System.out.println("Creating excel");
        

       for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum+1);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FILE_NAME.close(); //Close the InputStream
        } catch (IOException ex) {
            Logger.getLogger(Mainf.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("test.xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

        System.out.println("Done");
        setVisible(false);
        
        
        exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aaaActionPerformed

    private void daActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daActionPerformed

    private void mregularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mregularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mregularActionPerformed

    private void mrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrateActionPerformed

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
            java.util.logging.Logger.getLogger(Mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aaa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField ch;
    private org.jdesktop.swingx.JXDatePicker da;
    private javax.swing.JCheckBox dayy;
    private javax.swing.JTextField dq;
    private javax.swing.JTextField ds;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mdes;
    private javax.swing.JTextField mrate;
    private javax.swing.JComboBox<String> mregular;
    private javax.swing.JCheckBox nightt;
    private javax.swing.JTextField re;
    private javax.swing.JTextField sh;
    // End of variables declaration//GEN-END:variables
}
