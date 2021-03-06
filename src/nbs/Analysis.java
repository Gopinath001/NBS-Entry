/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbs;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Zero
 */
public class Analysis extends javax.swing.JFrame {

    /**
     * Creates new form Analysis
     */
    public Analysis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sdd = new org.jdesktop.swingx.JXDatePicker();
        edd = new org.jdesktop.swingx.JXDatePicker();
        an = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        vn = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        s = new javax.swing.JCheckBox();
        m = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        ma = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        ef = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(900, 900));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel1.setText("Range");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 47, 76, 15);
        getContentPane().add(sdd);
        sdd.setBounds(166, 43, 110, 22);
        getContentPane().add(edd);
        edd.setBounds(166, 91, 110, 22);

        an.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        an.setText("Submit");
        an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anActionPerformed(evt);
            }
        });
        getContentPane().add(an);
        an.setBounds(280, 360, 89, 38);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(445, 360, 80, 38);

        vn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V1", "V2", "V3", "V4" }));
        getContentPane().add(vn);
        vn.setBounds(166, 217, 114, 20);

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel2.setText("Single report");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 178, 76, 20);

        s.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        s.setText("one vheical");
        getContentPane().add(s);
        s.setBounds(166, 177, 120, 23);

        m.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(m);
        m.setBounds(358, 44, 179, 24);

        d.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(d);
        d.setBounds(358, 86, 179, 27);

        ma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(ma);
        ma.setBounds(358, 131, 179, 26);

        e.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(e);
        e.setBounds(358, 202, 179, 29);

        ef.setFont(new java.awt.Font("Myriad Pro", 1, 14)); // NOI18N
        getContentPane().add(ef);
        ef.setBounds(350, 250, 179, 28);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anActionPerformed
        try {
            // TODO add your handling code here:
            //starting date
            Date oDate = sdd.getDate();
            DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String sd = sdf.format(oDate);
            //ending date
            Date ioDate = edd.getDate();
            DateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            String ed = sdf1.format(ioDate);
            String vname = (String) vn.getSelectedItem();
            /*int thour=Integer.parseInt(th.getText());
            //thour is total hour ruunned
            int tdieselrate=Integer.parseInt(tdr.getText());
            //tdr is total diesel rate
            int dquantity=Integer.parseInt(dq.getText());*/
            int v1r = 0, v2r = 0, v3r = 0, v4r = 0, v1d = 0, v2d = 0, v3d = 0, v4d = 0, v1e = 0, v2e = 0, v3e = 0, v4e = 0, v1m = 0, v2m = 0, v4m = 0, v3m = 0;

            //tq is diesel quantity
            final String v1 = "V1";
            final String v2 = "V2";
            final String v3 = "V3";
            final String v4 = "V4";
            final String rh = "Running Hour";
            final String er = "Earning";
            final String dq = "Diesel Quantity";
            final String mi = "Maintance";
            //database connection 

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            if (s.isSelected()) {
                PreparedStatement pst = con.prepareStatement("SELECT * FROM hit WHERE (Date BETWEEN ? AND ?) AND vn=?");

                pst.setString(1, sd);
                pst.setString(2, ed);
                pst.setString(3, vname);
                ResultSet r = pst.executeQuery();
               float z=0;int c=0;
                while (r.next())
                {
                    v1r = v1r + r.getInt(7);
                    //desel
                    z=z+r.getInt(9);
                    //hr
                    c=c+r.getInt(7);
                    v1d = v1d + (r.getInt(8) * r.getInt(9));
                    v1e = v1e + r.getInt(10);
                    v1m = v1m + r.getInt(12);

                }
                   c=c*60;
                    System.out.println(z+"--"+c);
                     z=z/c;
                     z=z*60;
                    m.setText("Total Running Hours : \t" + v1r);
                    d.setText("Total Diesel        : \t" + v1d);
                    ma.setText("Total Maintance    : \t" + v1m);
                    e.setText("Total Earning Amount: \t" + v1e);
                    ef.setText("Avg fuel per Hr: \t" + z);
            }
            else
            {

            PreparedStatement pst = con.prepareStatement("SELECT * FROM hit WHERE Date BETWEEN ? AND ?");
            pst.setString(1, sd);
            pst.setString(2, ed);

            ResultSet r = pst.executeQuery();
            while (r.next()) {
                if ("v1".equals(r.getString(2))) {
                    v1r = v1r + r.getInt(7) * 1000;
                    v1d = v1d + (r.getInt(8) * r.getInt(9));
                    v1e = v1e + r.getInt(10);
                    v1m = v1m + r.getInt(12) * 10;
                }
                if ("v2".equals(r.getString(2))) {
                    v2r = v2r + r.getInt(7) * 1000;
                    v2d = v2d + (r.getInt(8) * r.getInt(9));
                    v2e = v2e + r.getInt(10);
                    v2m = v2m + r.getInt(12) * 10;
                }
                if ("v3".equals(r.getString(2))) {
                    v3r = v3r + r.getInt(7) * 1000;
                    v3d = v3d + (r.getInt(8) * r.getInt(9));
                    v3e = v3e + r.getInt(10);
                    v3m = v3m + r.getInt(12) * 10;
                }
                if ("v4".equals(r.getString(2))) {
                    v4r = v4r + r.getInt(7) * 1000;
                    v4d = v4d + (r.getInt(8) * r.getInt(9));
                    v4e = v4e + r.getInt(10);
                    v4m = v4m + r.getInt(12) * 10;
                }

            }

            final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.addValue(v1r, v1, rh);
            dataset.addValue(v1m, v1, mi);
            dataset.addValue(v1e, v1, er);
            dataset.addValue(v1d, v1, dq);

            dataset.addValue(v2r, v2, rh);
            dataset.addValue(v2m, v2, mi);
            dataset.addValue(v2e, v2, er);
            dataset.addValue(v2d, v2, dq);

            dataset.addValue(v3r, v3, rh);
            dataset.addValue(v3m, v3, mi);
            dataset.addValue(v3e, v3, er);
            dataset.addValue(v3d, v3, dq);

            dataset.addValue(v4r, v4, rh);
            dataset.addValue(v4m, v4, mi);
            dataset.addValue(v4e, v4, er);
            dataset.addValue(v4d, v4, dq);
            System.out.print(v4d + "--" + v1d);

            JFreeChart barChart = ChartFactory.createBarChart(
                    "Excavators USAGE STATISTICS",
                 "Vehicle Names", "Amount",
                    dataset, PlotOrientation.VERTICAL,
                    true, true, false);

            try {
                CategoryPlot p = (CategoryPlot) barChart.getPlot();
                ChartFrame f = new ChartFrame("Excavators USAGE STATISTICS", barChart);
                f.setVisible(true);
                f.setSize(600, 700);
            } catch (Exception e) {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }
            int width = 640;
            /* Width of the image */
            int height = 480;
            /* Height of the image */
            File BarChart = new File("F:/Bill/" + sd + "to" + ed + ".jpeg");
            ChartUtilities.saveChartAsJPEG(BarChart, barChart, width, height);
            }
        } catch (IOException ex) {
            Logger.getLogger(Analysis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Analysis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Analysis.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_anActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Start main = new Start();
        main.setVisible(true);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton an;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private org.jdesktop.swingx.JXDatePicker edd;
    private javax.swing.JLabel ef;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel m;
    private javax.swing.JLabel ma;
    private javax.swing.JCheckBox s;
    private org.jdesktop.swingx.JXDatePicker sdd;
    private javax.swing.JComboBox<String> vn;
    // End of variables declaration//GEN-END:variables
}
