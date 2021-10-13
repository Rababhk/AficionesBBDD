
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damA
 */
public class PantallaPrincipal extends javax.swing.JFrame {
Conectar conectar= null;
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        conectar = new Conectar();
        Connection conexion=conectar.getConnection();
        if (conexion != null) {
            JOptionPane.showMessageDialog(this, "conexion establecida correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "conexion no establecida");
        }
        initComponents();
        RefrescarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void RefrescarTabla(){
    DefaultTableModel dtm = new DefaultTableModel();
    dtm.setColumnIdentifiers(new String[]{"id","Profesion","Edad","Nº hermanos","Sexo","Deporte","Compras","Television","Cine"});
    var a = getDatos();
        for (var objeto : a) {
            dtm.addRow(objeto);
        }
    jTableCliente.setModel(dtm);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemAñadirUsuario = new javax.swing.JMenuItem();
        jMenuItemBorrarusuario = new javax.swing.JMenuItem();
        jMenuItemBorrarCascada = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();

        jMenuItemAñadirUsuario.setText("Añadir nuevo usuario");
        jMenuItemAñadirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAñadirUsuarioActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemAñadirUsuario);

        jMenuItemBorrarusuario.setText("Borrar usuario seleccionado");
        jMenuItemBorrarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBorrarusuarioActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemBorrarusuario);

        jMenuItemBorrarCascada.setText("Borrar toda la tabla");
        jMenuItemBorrarCascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBorrarCascadaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemBorrarCascada);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(190, 237, 232));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButton1.setText("Añadir cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(190, 237, 232));
        jScrollPane1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N

        jTableCliente.setBackground(new java.awt.Color(229, 252, 250));
        jTableCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableCliente.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAñadirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAñadirUsuarioActionPerformed

        // TODO add your handling code here:
        jPopupMenu1.setVisible(false);
         PantallaSecundaria ps = new PantallaSecundaria(this, true);
        ps.setVisible(true);
       
        RefrescarTabla();
        
    }//GEN-LAST:event_jMenuItemAñadirUsuarioActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        // TODO add your handling code here:
        jPopupMenu1.setVisible(true);
        jPopupMenu1.setLocation(evt.getLocationOnScreen());
        
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jMenuItemBorrarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarusuarioActionPerformed
        // TODO add your handling code here:
        jPopupMenu1.setVisible(false);
        //LogicaUsuario.Borrarcliente(jTableCliente.getSelectedRow());
        Connection cn = conectar.getConnection();
        var selectedRow = jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 0);
            try {
                PreparedStatement pstm = cn.prepareStatement("delete from aficiones.usuarios where idusuarios =" + selectedRow);
                pstm.execute();
            } catch (SQLException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        RefrescarTabla();
        
    }//GEN-LAST:event_jMenuItemBorrarusuarioActionPerformed

    private void jMenuItemBorrarCascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBorrarCascadaActionPerformed
        // TODO add your handling code here:
        jPopupMenu1.setVisible(false);
        int resultado = JOptionPane.showConfirmDialog(this, "¿Estas seguro?","Eliminar tabla",JOptionPane.YES_NO_CANCEL_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
           //LogicaUsuario.BorrarCascada();
           Connection cn = conectar.getConnection();
            try {
                PreparedStatement pstm = cn.prepareStatement("delete from aficiones.usuarios");
                pstm.execute();
            } catch (SQLException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        RefrescarTabla();
        }else if (resultado == JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_jMenuItemBorrarCascadaActionPerformed

    
     public Object[][] getDatos(){
      int x = 0;
      Connection cn = conectar.getConnection();
      //obtenemos la cantidad de registros existentes en la tabla
      try{         
         PreparedStatement pstm = cn.prepareStatement("SELECT count(idusuarios) as total FROM aficiones.usuarios ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] s = new String[x][9];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = cn.prepareStatement("SELECT " +
            " * " +
            " FROM aficiones.usuarios" +
            " ORDER BY idusuarios ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String idusuarios = res.getString("idusuarios");
            String profesion = res.getString("profesion");
            String edad = res.getString("edad");
            String hermanos = res.getString("hermanos");
            String sexo = res.getString("sexo");
            String deportes = res.getString("deportes");
            String compras = res.getString("compras");
            String television = res.getString("television");
            String cine = res.getString("cine");
            s[i][0] = idusuarios;            
            s[i][1] = profesion;            
            s[i][2] = edad;            
            s[i][3] = hermanos;            
            s[i][4] = sexo;            
            s[i][5] = deportes;            
            s[i][6] = compras;            
            s[i][7] = television;                      
            s[i][8] = cine;                      
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return s;
 }
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PantallaSecundaria ps = new PantallaSecundaria(this, true);
        ps.setVisible(true);
       
        RefrescarTabla();
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItemAñadirUsuario;
    private javax.swing.JMenuItem jMenuItemBorrarCascada;
    private javax.swing.JMenuItem jMenuItemBorrarusuario;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables
}
