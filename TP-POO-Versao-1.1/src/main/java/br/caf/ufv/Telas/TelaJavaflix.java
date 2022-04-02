/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.caf.ufv.Telas;

import br.caf.ufv.TelaModoEntrada;
import br.caf.ufv.modelo.entidade.Cliente;

/**
 *
 * @author vitor
 */
public class TelaJavaflix extends javax.swing.JFrame {
    private Cliente cliente;
    public TelaJavaflix(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        setLocationRelativeTo(null);
        
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
        btnBuscar = new java.awt.Button();
        btnAddItem = new java.awt.Button();
        btnRemove = new java.awt.Button();
        btnCarrinho = new java.awt.Button();
        btnFinalizar = new java.awt.Button();
        btnPerfil = new java.awt.Button();
        btnSair = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("JAVAFLIX");

        btnBuscar.setLabel("Buscar produto");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAddItem.setLabel("Adicionar item ao carrinho");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnRemove.setLabel("Remover item do carrinho");
        btnRemove.setMaximumSize(new java.awt.Dimension(200, 200));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCarrinho.setLabel("Carrinho de compras");
        btnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoActionPerformed(evt);
            }
        });

        btnFinalizar.setLabel("Finalizar compra");
        btnFinalizar.setMaximumSize(new java.awt.Dimension(200, 200));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnPerfil.setLabel("Meu perfil");
        btnPerfil.setMaximumSize(new java.awt.Dimension(200, 200));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnSair.setActionCommand("Sair");
        btnSair.setLabel("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(200, 200));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                        .addComponent(btnCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAddItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 260, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscar(cliente).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddCarrinho(cliente).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDelCarrinho(cliente).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarrinho(cliente).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnCarrinhoActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedido(cliente).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerfil(cliente).setVisible(true);
            }
        });
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaModoEntrada().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnSairActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAddItem;
    private java.awt.Button btnBuscar;
    private java.awt.Button btnCarrinho;
    private java.awt.Button btnFinalizar;
    private java.awt.Button btnPerfil;
    private java.awt.Button btnRemove;
    private java.awt.Button btnSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}