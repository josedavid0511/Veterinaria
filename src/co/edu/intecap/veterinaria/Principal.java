/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria;

import co.edu.intecap.veterinaria.gui.Creador;
import co.edu.intecap.veterinaria.gui.Gestor;
import co.edu.intecap.veterinaria.gui.Visualizador;
import co.edu.intecap.veterinaria.negocio.mascotas.Gato;
import co.edu.intecap.veterinaria.negocio.mascotas.Perro;
import co.edu.intecap.veterinaria.util.Utilidad;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author intecap
 */
public class Principal extends javax.swing.JFrame {

    private static ArrayList<Perro> ListaPerros;
    private static ArrayList<Gato> ListaGatos;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
        //lstPerros.setSelectedIndex(null);
        asignarListeners();
        ListaPerros=Utilidad.leerArchivoPerros();
        ListaGatos=Utilidad.leerArchivoGatos();
        //Actualización al iniciar el proyecto, carga de informacion de archivos planos
        actualizarListas();
    }

    public static void actualizarListas() {
        lstPerros.removeAll();
        DefaultListModel<String> modeloPerro = new DefaultListModel<>();
        for (Perro perro : ListaPerros) {
            modeloPerro.addElement(perro.getNombre());
        }
        lstPerros.setModel(modeloPerro);
        lstGatos.removeAll();
        DefaultListModel<String> modeloGato = new DefaultListModel<>();
        for (Gato gato : ListaGatos) {
            modeloGato.addElement(gato.getNombre());

        }
        lstGatos.setModel(modeloGato);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstGatos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPerros = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCrar = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstGatos);

        jScrollPane2.setViewportView(lstPerros);

        jLabel1.setText("Lista de perros");

        jLabel2.setText("Lista de gatos");

        btnCrar.setText("Crar mascota");
        btnCrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrarActionPerformed(evt);
            }
        });

        btnDetalle.setText("Detalle de mascota");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        btnActividades.setText("Actividades");
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetalle)
                        .addGap(18, 18, 18)
                        .addComponent(btnActividades)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrarActionPerformed
        new Creador(this, false, ListaPerros, ListaGatos).setVisible(true);

    }//GEN-LAST:event_btnCrarActionPerformed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        if (lstPerros.getSelectedIndex() < 0 && lstGatos.getSelectedIndex() < 0) {
            Utilidad.lanzarAlerta(this, "Debe seleccionar una mascota de las listas", "Selección de mascotas", JOptionPane.WARNING_MESSAGE);
        }
        if (lstPerros.getSelectedIndex() > -1) {
            Perro perro = ListaPerros.get(lstPerros.getSelectedIndex());
            new Visualizador(this, true, perro).setVisible(true);

        }
        if (lstGatos.getSelectedIndex() > -1) {
            Gato gato = ListaGatos.get(lstGatos.getSelectedIndex());
            new Visualizador(this, true, gato).setVisible(true);

        }
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        if (lstPerros.getSelectedIndex() < 0 && lstGatos.getSelectedIndex() < 0) {
            Utilidad.lanzarAlerta(this, "Debe seleccionar una mascota de las listas", "Selección de mascotas", JOptionPane.WARNING_MESSAGE);
        }
        if (lstPerros.getSelectedIndex() > -1) {
            Perro perro = ListaPerros.get(lstPerros.getSelectedIndex());
            new Gestor(this, true, perro).setVisible(true);

        }
        if (lstGatos.getSelectedIndex() > -1) {
            Gato gato = ListaGatos.get(lstGatos.getSelectedIndex());
            new Gestor(this, true, gato).setVisible(true);

        }
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Utilidad.escribirArchivoPerros(ListaPerros);
        Utilidad.escribirArchivoGatos(ListaGatos);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void asignarListeners() {
        ListSelectionListener selector = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList<String> lista = (JList<String>) e.getSource();
                if (lista.equals(lstPerros)) {
                    lstGatos.clearSelection();

                }
                if (lista.equals(lstGatos)) {
                    lstPerros.clearSelection();

                }
            }
        };
        lstPerros.addListSelectionListener(selector);
        lstGatos.addListSelectionListener(selector);

    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnCrar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JList<String> lstGatos;
    private static javax.swing.JList<String> lstPerros;
    // End of variables declaration//GEN-END:variables
}
