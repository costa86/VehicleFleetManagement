/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Metodos.Generico;
import Modelo.Carro;
import Modelo.Fabricante;
import Modelo.Funcionario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        funcionario = new javax.swing.JMenuItem();
        fornecedor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        carro = new javax.swing.JMenuItem();
        fabricante = new javax.swing.JMenuItem();
        marca = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        abastecimento = new javax.swing.JMenuItem();
        viagem = new javax.swing.JMenuItem();
        acidente = new javax.swing.JMenuItem();
        multa = new javax.swing.JMenuItem();
        manutencao = new javax.swing.JMenuItem();
        cadastroBackup = new javax.swing.JMenu();
        cadastro = new javax.swing.JMenu();
        funcionarioBackup = new javax.swing.JMenuItem();
        veiculoBackup = new javax.swing.JMenuItem();
        fabricanteBackup = new javax.swing.JMenuItem();
        fornecedorBackup = new javax.swing.JMenuItem();
        marcaBackup = new javax.swing.JMenuItem();
        lancamento = new javax.swing.JMenu();
        abastecimentoBackup = new javax.swing.JMenuItem();
        manutencaoBackup = new javax.swing.JMenuItem();
        viagemBackup = new javax.swing.JMenuItem();
        multaBackup = new javax.swing.JMenuItem();
        acidenteBackup = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem4.setText("jMenuItem4");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar5.add(jMenu11);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("File");
        jMenuBar6.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar6.add(jMenu3);

        jMenuItem3.setText("jMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA GESTÃO DE FROTAS");

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/address_book.png"))); // NOI18N
        jMenu12.setMnemonic('C');
        jMenu12.setText("CADASTRO");

        funcionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.SHIFT_MASK));
        funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/man.png"))); // NOI18N
        funcionario.setMnemonic('f');
        funcionario.setText("FUNCIONÁRIO");
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });
        jMenu12.add(funcionario);

        fornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK));
        fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/address_book.png"))); // NOI18N
        fornecedor.setMnemonic('O');
        fornecedor.setText("FORNECEDOR");
        fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorActionPerformed(evt);
            }
        });
        jMenu12.add(fornecedor);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/emoji.png"))); // NOI18N
        jMenu1.setMnemonic('V');
        jMenu1.setText("VEÍCULO");

        carro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK));
        carro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/access_point.png"))); // NOI18N
        carro.setMnemonic('V');
        carro.setText("VEÍCULO");
        carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carroActionPerformed(evt);
            }
        });
        jMenu1.add(carro);

        fabricante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_MASK));
        fabricante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/apps.png"))); // NOI18N
        fabricante.setMnemonic('f');
        fabricante.setText("FABRICANTE");
        fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricanteActionPerformed(evt);
            }
        });
        jMenu1.add(fabricante);

        marca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_MASK));
        marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/checkbox_circle.png"))); // NOI18N
        marca.setMnemonic('M');
        marca.setText("MARCA");
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });
        jMenu1.add(marca);

        jMenu12.add(jMenu1);

        jMenuBar1.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/paste.png"))); // NOI18N
        jMenu13.setMnemonic('L');
        jMenu13.setText("LANÇAMENTO");

        abastecimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.SHIFT_MASK));
        abastecimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/currency_euro_sign.png"))); // NOI18N
        abastecimento.setMnemonic('a');
        abastecimento.setText("ABASTECIMENTO");
        abastecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abastecimentoActionPerformed(evt);
            }
        });
        jMenu13.add(abastecimento);

        viagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.SHIFT_MASK));
        viagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/bell.png"))); // NOI18N
        viagem.setMnemonic('v');
        viagem.setText("VIAGEM");
        viagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viagemActionPerformed(evt);
            }
        });
        jMenu13.add(viagem);

        acidente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.SHIFT_MASK));
        acidente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/clip.png"))); // NOI18N
        acidente.setMnemonic('s');
        acidente.setText("SINISTRO");
        acidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acidenteActionPerformed(evt);
            }
        });
        jMenu13.add(acidente);

        multa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.SHIFT_MASK));
        multa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/clipboard.png"))); // NOI18N
        multa.setMnemonic('m');
        multa.setText("MULTA");
        multa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multaActionPerformed(evt);
            }
        });
        jMenu13.add(multa);

        manutencao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.SHIFT_MASK));
        manutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/eject.png"))); // NOI18N
        manutencao.setMnemonic('m');
        manutencao.setText("MANUTENÇÃO");
        manutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manutencaoActionPerformed(evt);
            }
        });
        jMenu13.add(manutencao);

        jMenuBar1.add(jMenu13);

        cadastroBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/download.png"))); // NOI18N
        cadastroBackup.setMnemonic('b');
        cadastroBackup.setText("BACKUP DE MÓDULOS");

        cadastro.setMnemonic('C');
        cadastro.setText("CADASTRO");

        funcionarioBackup.setMnemonic('f');
        funcionarioBackup.setText("FUNCIONÁRIO");
        funcionarioBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioBackupActionPerformed(evt);
            }
        });
        cadastro.add(funcionarioBackup);

        veiculoBackup.setMnemonic('V');
        veiculoBackup.setText("VEÍCULO");
        veiculoBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoBackupActionPerformed(evt);
            }
        });
        cadastro.add(veiculoBackup);

        fabricanteBackup.setMnemonic('A');
        fabricanteBackup.setText("FABRICANTE");
        fabricanteBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricanteBackupActionPerformed(evt);
            }
        });
        cadastro.add(fabricanteBackup);

        fornecedorBackup.setMnemonic('o');
        fornecedorBackup.setText("FORNECEDOR");
        cadastro.add(fornecedorBackup);

        marcaBackup.setMnemonic('M');
        marcaBackup.setText("MARCA");
        cadastro.add(marcaBackup);

        cadastroBackup.add(cadastro);

        lancamento.setMnemonic('L');
        lancamento.setText("LANÇAMENTO");

        abastecimentoBackup.setMnemonic('A');
        abastecimentoBackup.setText("ABASTECIMENTO");
        lancamento.add(abastecimentoBackup);

        manutencaoBackup.setMnemonic('M');
        manutencaoBackup.setText("MANUTENÇÃO");
        lancamento.add(manutencaoBackup);

        viagemBackup.setMnemonic('V');
        viagemBackup.setText("VIAGEM");
        viagemBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viagemBackupActionPerformed(evt);
            }
        });
        lancamento.add(viagemBackup);

        multaBackup.setMnemonic('U');
        multaBackup.setText("MULTA");
        lancamento.add(multaBackup);

        acidenteBackup.setMnemonic('S');
        acidenteBackup.setText("SINISTRO");
        lancamento.add(acidenteBackup);

        cadastroBackup.add(lancamento);

        jMenuBar1.add(cadastroBackup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricanteActionPerformed
        try {
            new FormFabricante().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fabricanteActionPerformed

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        try {
            new FormFuncionario().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_funcionarioActionPerformed

    private void fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorActionPerformed
        try {
            new FormFornecedor().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fornecedorActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        try {
            new FormMarca().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_marcaActionPerformed

    private void carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carroActionPerformed

        ArrayList<Object> lista = new ArrayList<>();
        ArrayList<Object> lista1 = new ArrayList<>();
        try {
            Generico.carregaLista("fabricantes.txt", lista);
            Generico.carregaLista("marcas.txt", lista1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (lista.isEmpty()) {
            try {
                new FormFabricante().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (lista1.isEmpty()) {
            try {
                new FormMarca().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                new FormCarro().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_carroActionPerformed

    private void viagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viagemActionPerformed
        try {
            new FormViagem().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viagemActionPerformed

    private void acidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acidenteActionPerformed
        try {
            new FormAcidente().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_acidenteActionPerformed

    private void multaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multaActionPerformed
        try {
            new FormMulta().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_multaActionPerformed

    private void abastecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abastecimentoActionPerformed
        try {
            new FormAbastecimento().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }     }//GEN-LAST:event_abastecimentoActionPerformed

    private void manutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manutencaoActionPerformed
        try {
            new FormManutencao().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }     }//GEN-LAST:event_manutencaoActionPerformed

    private void viagemBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viagemBackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viagemBackupActionPerformed

    private void veiculoBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoBackupActionPerformed
        ArrayList<Object> lista = new ArrayList<>();
        String origem = "carros.txt";
        String destino = "carros.csv";
        try {
            Generico.carregaLista(origem, lista);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormBackup.class.getName()).log(Level.SEVERE, null, ex);
        }
        Carro obj;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            bw.write("id,nome,fabricante,marca,notas,placa,chassi,tipo,status,odometro,receita,despesa,pendencia");
            bw.newLine();
            for (Object cada : lista) {
                obj = (Carro) cada;
                bw.write(obj.getId() + "," + obj.getNome() + "," + obj.getFabricante().getNome()
                        + "," + obj.getMarca().getNome() + "," + obj.getNotas() + "," + obj.getPlaca()
                        + "," + obj.getChassi() + "," + obj.getTipo() + "," + obj.getStatus()
                        + "," + obj.getOdometro() + "," + obj.getReceita() + "," + obj.getDespesa() + "," + obj.getPendencia());
                bw.newLine();
            }
            JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso: " + destino);
        } catch (IOException ex) {
            Logger.getLogger(FormBackup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_veiculoBackupActionPerformed

    private void funcionarioBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioBackupActionPerformed
        ArrayList<Object> lista = new ArrayList<>();
        String origem = "funcionarios.txt";
        String destino = "funcionarios.csv";
        try {
            Generico.carregaLista(origem, lista);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormBackup.class.getName()).log(Level.SEVERE, null, ex);
        }
        Funcionario obj;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            bw.write("id,nome,habilitacao,categoria,fone,email,notas,vencimentoHabilitacao,status");
            bw.newLine();
            for (Object cada : lista) {
                obj = (Funcionario) cada;
                bw.write(obj.getId() + "," + obj.getNome() + "," + obj.getHabilitacao() + ","
                        + obj.getCategoria() + "," + obj.getFone() + "," + obj.getEmail()
                        + "," + obj.getNotas() + "," + obj.getVencimento() + "," + obj.getStatus());
                bw.newLine();
            }
            JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso: " + destino);
        } catch (IOException ex) {
            Logger.getLogger(FormBackup.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_funcionarioBackupActionPerformed

    private void fabricanteBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricanteBackupActionPerformed
        ArrayList<Object> lista = new ArrayList<>();
        String origem = "fabricantes.txt";
        String destino = "fabricantes.csv";
        try {
            Generico.carregaLista(origem, lista);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormBackup.class.getName()).log(Level.SEVERE, null, ex);
        }
        Fabricante obj;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            bw.write("id,nome");
            bw.newLine();
            for (Object cada : lista) {
                obj = (Fabricante) cada;
                bw.write(obj.getId() + "," + obj.getNome());
                bw.newLine();
            }
            JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso: " + destino);
        } catch (IOException ex) {
            Logger.getLogger(FormBackup.class.getName()).log(Level.SEVERE, null, ex);
         }    }//GEN-LAST:event_fabricanteBackupActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abastecimento;
    private javax.swing.JMenuItem abastecimentoBackup;
    private javax.swing.JMenuItem acidente;
    private javax.swing.JMenuItem acidenteBackup;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenu cadastroBackup;
    private javax.swing.JMenuItem carro;
    private javax.swing.JMenuItem fabricante;
    private javax.swing.JMenuItem fabricanteBackup;
    private javax.swing.JMenuItem fornecedor;
    private javax.swing.JMenuItem fornecedorBackup;
    private javax.swing.JMenuItem funcionario;
    private javax.swing.JMenuItem funcionarioBackup;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenu lancamento;
    private javax.swing.JMenuItem manutencao;
    private javax.swing.JMenuItem manutencaoBackup;
    private javax.swing.JMenuItem marca;
    private javax.swing.JMenuItem marcaBackup;
    private javax.swing.JMenuItem multa;
    private javax.swing.JMenuItem multaBackup;
    private javax.swing.JMenuItem veiculoBackup;
    private javax.swing.JMenuItem viagem;
    private javax.swing.JMenuItem viagemBackup;
    // End of variables declaration//GEN-END:variables
}
