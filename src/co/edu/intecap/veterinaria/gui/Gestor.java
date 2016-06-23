/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.gui;

import co.edu.intecap.veterinaria.negocio.Mascota;
import co.edu.intecap.veterinaria.negocio.mascotas.Gato;
import co.edu.intecap.veterinaria.negocio.mascotas.Perro;
import co.edu.intecap.veterinaria.util.Utilidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author intecap
 */
public class Gestor extends javax.swing.JDialog {

    private final Mascota mascota;
    private final Perro perro;
    private final Gato gato;

    /**
     * Creates new form Gestor
     */
    public Gestor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mascota = null;
        this.perro = null;
        this.gato = null;
    }

    public Gestor(java.awt.Frame parent, boolean modal, Perro perro) {
        super(parent, modal);
        initComponents();
        this.gato = null;
        this.perro = perro;
        this.mascota = perro;
        asignarListeners();
        pnActividadGato.setVisible(false);
    }

    public Gestor(java.awt.Frame parent, boolean modal, Gato gato) {
        super(parent, modal);
        initComponents();
        this.perro = null;
        this.gato = gato;
        this.mascota = gato;
        asignarListeners();
        pnActividadPerro.setVisible(false);
    }

    private void asignarListeners() {
        asignarListenerMascota();
        asignarListenerPerro();
        asignarListenerGato();
    }

    private void asignarListenerMascota() {
        ActionListener accionMascota = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btnAction = (JButton) e.getSource();
                if (btnAction.equals(btnJugar)) {
                    if (!alertaEnergia()) {
                        return;
                    }
                    if (perro != null) {
                        perro.jugar();
                    }
                }
                if (gato != null) {
                    gato.jugar();
                }
                if (btnAction.equals(btnDomir)) {
                    mascota.dormir();
                }
                if (btnAction.equals(btnVacunar)) {
                    mascota.vacunar();
                }
                if (btnAction.equals(btnComer)) {
                    if (perro != null) {
                        perro.comer(45);
                    }
                    if (gato != null) {
                        gato.comer(30);
                    }
                }

                if (btnAction.equals(btnBeber)) {
                    if (perro != null) {
                        perro.beber(20);
                    }
                }
                if (gato != null) {
                    gato.beber(10);
                }
                if (btnAction.equals(btnDefecar)) {
                    if (perro != null) {
                        perro.defecar();
                    }
                }
                if (gato != null) {
                    gato.defecar();
                }

            }

        };
        btnJugar.addActionListener(accionMascota);
        btnDomir.addActionListener(accionMascota);
        btnVacunar.addActionListener(accionMascota);
        btnBeber.addActionListener(accionMascota);
        btnComer.addActionListener(accionMascota);
        btnDefecar.addActionListener(accionMascota);
    }

    private void asignarListenerPerro() {
        ActionListener accionPerro = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JButton btnAction = (JButton) e.getSource();
                if (btnAction.equals(btnLadrar)) {
                    perro.ladrar();
                }
                if (btnAction.equals(btnMorder)) {
                    if (!alertaEnergia()) {
                        return;
                    }
                    perro.morder();
                }
                if (btnAction.equals(btnCorrer)) {
                    if (!alertaEnergia()) {
                        return;
                    }
                    perro.correr(50);
                }

            }
        };
        btnLadrar.addActionListener(accionPerro);
        btnMorder.addActionListener(accionPerro);
        btnCorrer.addActionListener(accionPerro);
    }

    private void asignarListenerGato() {
        ActionListener accionGato = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JButton btnAction = (JButton) e.getSource();
                if (btnAction.equals(btnAranar)) {
                    if (!alertaEnergia()) {
                        return;
                    }
                    gato.arañar();
                }
                if (btnAction.equals(btnLamer)) {
                    if (!alertaEnergia()) {
                        return;
                    }
                    gato.lamer();
                }
                if (btnAction.equals(btnMaullar)) {
                    gato.maullar();
                }

            }
        };
        btnAranar.addActionListener(accionGato);
        btnLamer.addActionListener(accionGato);
        btnMaullar.addActionListener(accionGato);
    }

    private boolean alertaEnergia() {
        if (mascota.getEnergia() < 1) {
            Utilidad.lanzarAlerta(rootPane, "La mascota no puede ejecutar la accion porque no tiene energia", "Alerta de energia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnComer = new javax.swing.JButton();
        btnBeber = new javax.swing.JButton();
        btnDefecar = new javax.swing.JButton();
        pnActividadPerro = new javax.swing.JPanel();
        btnLadrar = new javax.swing.JButton();
        btnMorder = new javax.swing.JButton();
        btnCorrer = new javax.swing.JButton();
        pnActividadGato = new javax.swing.JPanel();
        btnAranar = new javax.swing.JButton();
        btnLamer = new javax.swing.JButton();
        btnMaullar = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnDomir = new javax.swing.JButton();
        btnVacunar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnComer.setText("Comer");
        btnComer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerActionPerformed(evt);
            }
        });

        btnBeber.setText("Beber");
        btnBeber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeberActionPerformed(evt);
            }
        });

        btnDefecar.setText("Defecar");

        btnLadrar.setText("Ladrar");

        btnMorder.setText("Morder");

        btnCorrer.setText("Correr");

        javax.swing.GroupLayout pnActividadPerroLayout = new javax.swing.GroupLayout(pnActividadPerro);
        pnActividadPerro.setLayout(pnActividadPerroLayout);
        pnActividadPerroLayout.setHorizontalGroup(
            pnActividadPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActividadPerroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLadrar)
                .addGap(18, 18, 18)
                .addComponent(btnMorder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCorrer)
                .addContainerGap())
        );
        pnActividadPerroLayout.setVerticalGroup(
            pnActividadPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActividadPerroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnActividadPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLadrar)
                    .addComponent(btnMorder)
                    .addComponent(btnCorrer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAranar.setText("Arañar");

        btnLamer.setText("Lamer");

        btnMaullar.setText("Maullar");

        javax.swing.GroupLayout pnActividadGatoLayout = new javax.swing.GroupLayout(pnActividadGato);
        pnActividadGato.setLayout(pnActividadGatoLayout);
        pnActividadGatoLayout.setHorizontalGroup(
            pnActividadGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActividadGatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAranar)
                .addGap(18, 18, 18)
                .addComponent(btnLamer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMaullar))
        );
        pnActividadGatoLayout.setVerticalGroup(
            pnActividadGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActividadGatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnActividadGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAranar)
                    .addComponent(btnLamer)
                    .addComponent(btnMaullar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnJugar.setText("Jugar");

        btnDomir.setText("Dormir");
        btnDomir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDomirActionPerformed(evt);
            }
        });

        btnVacunar.setText("Vacunar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnActividadPerro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnActividadGato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnJugar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDomir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnComer)
                                .addGap(18, 18, 18)
                                .addComponent(btnBeber)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDefecar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVacunar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDomir)
                    .addComponent(btnVacunar)
                    .addComponent(btnJugar))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComer)
                    .addComponent(btnBeber)
                    .addComponent(btnDefecar))
                .addGap(18, 18, 18)
                .addComponent(pnActividadPerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnActividadGato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBeberActionPerformed

    private void btnComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComerActionPerformed

    private void btnDomirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDomirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDomirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAranar;
    private javax.swing.JButton btnBeber;
    private javax.swing.JButton btnComer;
    private javax.swing.JButton btnCorrer;
    private javax.swing.JButton btnDefecar;
    private javax.swing.JButton btnDomir;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnLadrar;
    private javax.swing.JButton btnLamer;
    private javax.swing.JButton btnMaullar;
    private javax.swing.JButton btnMorder;
    private javax.swing.JButton btnVacunar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnActividadGato;
    private javax.swing.JPanel pnActividadPerro;
    // End of variables declaration//GEN-END:variables
}
