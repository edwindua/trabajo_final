/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.udec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class busverdatos extends javax.swing.JFrame {

    /**
     * Creates new form bienvenida
     */
    public busverdatos() {
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
        ingresar = new javax.swing.JButton();
        ingresar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Buscar_tex = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        jLabel1.setText("jLabel1");

        ingresar.setBackground(new java.awt.Color(0, 0, 0));
        ingresar.setFont(new java.awt.Font("Wide Latin", 3, 18)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar Persona");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        ingresar1.setBackground(new java.awt.Color(0, 0, 0));
        ingresar1.setFont(new java.awt.Font("Wide Latin", 3, 18)); // NOI18N
        ingresar1.setForeground(new java.awt.Color(255, 255, 255));
        ingresar1.setText("Ingresar Persona");
        ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR Y VER DATOS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR");

        Buscar_tex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_texActionPerformed(evt);
            }
        });
        Buscar_tex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Buscar_texKeyPressed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jToggleButton1.setText("INICIO");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Buscar_tex, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel2)
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Buscar_tex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        inicio i1= new inicio();
        i1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_ingresarActionPerformed

    private void ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar1ActionPerformed
        inicio i1= new inicio();
        i1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_ingresar1ActionPerformed

    private void Buscar_texActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_texActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar_texActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        inicio i2= new inicio();
        i2.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void Buscar_texKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Buscar_texKeyPressed
       mostrarProductos();
    }//GEN-LAST:event_Buscar_texKeyPressed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded
public DefaultTableModel mostrarProductos() {

       
        DefaultTableModel Tabla1 = new DefaultTableModel();
         

            String[] NombreC = {"DOCUMENTO", "NOMBRE", "APELLIDOS", "PLACA", "HORAS"};
            String[] Clientes = new String[5];

            DefaultTableModel Tabla2 = new DefaultTableModel(null, NombreC);
            Tabla1 = Tabla2;
            jTable1.setModel((Tabla1));

            String sqlClientes = "select documento DOCUMENTO, nombre NOMBRE, apellidos APELLIDOS, placa PLACA, horas HORAS from ingreso;";
            String sql1Clientes = "SELECT * FROM ingreso WHERE nombre LIKE'%" + Buscar_tex.getText() + "%' OR documento LIKE'%" + Buscar_tex.getText() + "%'";
            conexion C1 = new conexion();
            Connection cn = null;
            PreparedStatement pst = null;
            PreparedStatement pst1 = null;
            ResultSet rs = null;
            try {
                cn = C1.Conectar1();
                pst = cn.prepareStatement(sqlClientes);
                pst1 = cn.prepareStatement(sql1Clientes);
                rs = pst.executeQuery();
                rs = pst1.executeQuery();
                int[] anchos = {40, 50, 50, 80, 60};
                for (int x = 0; x < Clientes.length; x++) {
                    jTable1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
                }
                if (jTable1.getColumnModel().getColumnCount() > 0) {
                    jTable1.getColumnModel().getColumn(0).setResizable(false);
                    jTable1.getColumnModel().getColumn(1).setResizable(false);
                    jTable1.getColumnModel().getColumn(2).setResizable(false);
                    jTable1.getColumnModel().getColumn(3).setResizable(false);
                    jTable1.getColumnModel().getColumn(4).setResizable(false);

                }

                while (rs.next()) {

                    Clientes[0] = rs.getString("DOCUMENTO");
                    Clientes[1] = rs.getString("NOMBRE");
                    Clientes[2] = rs.getString("APELLIDOs");
                    Clientes[3] = rs.getString("PLACA");
                    Clientes[4] = rs.getString("HORAS");
                    Tabla1.addRow(Clientes);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "NO HA PODIDO INGRESAR A LA BASE DE DATOS " + e, "Conexion", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (pst != null) {
                        rs.close();
                    }
                    if (cn != null) {
                        rs.close();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
       return Tabla1;
}

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busverdatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar_tex;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton ingresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
