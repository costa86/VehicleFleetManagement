/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Metodos.Generico;
import Modelo.Acidente;
import Modelo.Carro;
import Modelo.Funcionario;
import Modelo.Viagem;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class FormAcidente extends javax.swing.JFrame {

    ArrayList<Object> lista = new ArrayList<>();
    ArrayList<Object> funcionarios = new ArrayList<>();
    ArrayList<Object> carros = new ArrayList<>();
    static DefaultTableModel tab;
    Carro carro;
    Funcionario funcionario;
    public static String arquivo = "acidentes.txt";
    Acidente acidente = new Acidente();

    public FormAcidente() throws ClassNotFoundException {
        initComponents();
        Generico.carregaLista(arquivo, lista);
        Generico.carregaLista("carros.txt", carros);
        Generico.carregaLista("funcionarios.txt", funcionarios);
        quantidade.setText("QUANTIDADE: " + Integer.toString(lista.size()));
        tab = (DefaultTableModel) jTable1.getModel();
        tab.setNumRows(0);

        for (Object obj : lista) {
            Acidente cada = (Acidente) obj;
            Object item[] = {cada.getId(), cada.getCarro().getNome(), cada.getFuncionario().getNome(), cada.getData(), cada.getHora()};
            tab.addRow(item);
        }

        String listaCarros[] = new String[carros.size()];

        for (int i = 0; i < carros.size(); i++) {
            Carro cada = (Carro) carros.get(i);
            listaCarros[i] = cada.getNome();
        }

        carroBox.setModel(new javax.swing.DefaultComboBoxModel<>(listaCarros));

        String listaFuncionarios[] = new String[funcionarios.size()];

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario cada = (Funcionario) funcionarios.get(i);
            listaFuncionarios[i] = cada.getNome();
        }

        funcionarioBox.setModel(new javax.swing.DefaultComboBoxModel<>(listaFuncionarios));

        jTable1.setModel(tab);
        jTable1.requestFocus();
        jTable1.changeSelection(0, 0, false, false);
        if (lista.size()>0){
            KeyEvent evt = null;
            jTable1KeyReleased(evt);
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

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenuBar10 = new javax.swing.JMenuBar();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar11 = new javax.swing.JMenuBar();
        jMenu21 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenuBar12 = new javax.swing.JMenuBar();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        quantidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idCampo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        carroBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        funcionarioBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        dataCampo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        horaCampo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notasCampo = new javax.swing.JTextArea();
        jMenuBar13 = new javax.swing.JMenuBar();
        adicionarMenu = new javax.swing.JMenu();
        adicionarItem = new javax.swing.JMenuItem();
        salvarItem = new javax.swing.JMenuItem();
        editarMenu = new javax.swing.JMenu();
        editarItem = new javax.swing.JMenuItem();
        atualizarItem = new javax.swing.JMenuItem();
        excluirMenu = new javax.swing.JMenu();
        excluirItem = new javax.swing.JMenuItem();
        recomecarMenu = new javax.swing.JMenu();
        recomecarItem = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar4.add(jMenu11);

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar5.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar5.add(jMenu2);

        jMenu6.setText("File");
        jMenuBar6.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar6.add(jMenu7);

        jMenu12.setText("File");
        jMenuBar7.add(jMenu12);

        jMenu13.setText("Edit");
        jMenuBar7.add(jMenu13);

        jMenu14.setText("File");
        jMenuBar8.add(jMenu14);

        jMenu15.setText("Edit");
        jMenuBar8.add(jMenu15);

        jMenu16.setText("jMenu16");

        jMenu17.setText("File");
        jMenuBar9.add(jMenu17);

        jMenu18.setText("Edit");
        jMenuBar9.add(jMenu18);

        jMenu19.setText("File");
        jMenuBar10.add(jMenu19);

        jMenu20.setText("Edit");
        jMenuBar10.add(jMenu20);

        jMenuItem2.setText("jMenuItem2");

        jMenu21.setText("File");
        jMenuBar11.add(jMenu21);

        jMenu22.setText("Edit");
        jMenuBar11.add(jMenu22);

        jMenu23.setText("File");
        jMenuBar12.add(jMenu23);

        jMenu24.setText("Edit");
        jMenuBar12.add(jMenu24);

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIAGEM");
        setForeground(java.awt.Color.white);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "VEÍCULO", "FUNCIONÁRIO", "DATA", "HORA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        quantidade.setText("REGISTROS:");

        jLabel2.setText("ID");

        idCampo.setEnabled(false);

        jLabel4.setText("Carro");

        carroBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        carroBox.setEnabled(false);

        jLabel1.setText("Funcionário");

        funcionarioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        funcionarioBox.setEnabled(false);

        jLabel11.setText("Hora");

        dataCampo.setEditable(false);
        dataCampo.setEnabled(false);
        dataCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCampoActionPerformed(evt);
            }
        });

        jLabel12.setText("Data");

        horaCampo.setEditable(false);
        horaCampo.setEnabled(false);
        horaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaCampoActionPerformed(evt);
            }
        });

        jLabel14.setText("Notas");

        notasCampo.setColumns(20);
        notasCampo.setRows(5);
        notasCampo.setEnabled(false);
        jScrollPane2.setViewportView(notasCampo);

        adicionarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/add.png"))); // NOI18N
        adicionarMenu.setMnemonic('a');
        adicionarMenu.setText("ADICIONAR");

        adicionarItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.SHIFT_MASK));
        adicionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/add.png"))); // NOI18N
        adicionarItem.setMnemonic('N');
        adicionarItem.setText("NOVO");
        adicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarItemActionPerformed(evt);
            }
        });
        adicionarMenu.add(adicionarItem);

        salvarItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK));
        salvarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/diskette.png"))); // NOI18N
        salvarItem.setMnemonic('S');
        salvarItem.setText("SALVAR");
        salvarItem.setEnabled(false);
        salvarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarItemActionPerformed(evt);
            }
        });
        adicionarMenu.add(salvarItem);

        jMenuBar13.add(adicionarMenu);

        editarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/pencil.png"))); // NOI18N
        editarMenu.setMnemonic('e');
        editarMenu.setText("EDITAR");

        editarItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK));
        editarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/pencil.png"))); // NOI18N
        editarItem.setMnemonic('e');
        editarItem.setText("EDITAR");
        editarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarItemActionPerformed(evt);
            }
        });
        editarMenu.add(editarItem);

        atualizarItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_MASK));
        atualizarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/synchronize.png"))); // NOI18N
        atualizarItem.setMnemonic('a');
        atualizarItem.setText("ATUALIZAR");
        atualizarItem.setEnabled(false);
        atualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarItemActionPerformed(evt);
            }
        });
        editarMenu.add(atualizarItem);

        jMenuBar13.add(editarMenu);

        excluirMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/delete.png"))); // NOI18N
        excluirMenu.setMnemonic('x');
        excluirMenu.setText("EXCLUIR");

        excluirItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_MASK));
        excluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/delete.png"))); // NOI18N
        excluirItem.setMnemonic('e');
        excluirItem.setText("EXCLUIR");
        excluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirItemActionPerformed(evt);
            }
        });
        excluirMenu.add(excluirItem);

        jMenuBar13.add(excluirMenu);

        recomecarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/reload.png"))); // NOI18N
        recomecarMenu.setMnemonic('r');
        recomecarMenu.setText("RECOMEÇAR");

        recomecarItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.SHIFT_MASK));
        recomecarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32/reload.png"))); // NOI18N
        recomecarItem.setMnemonic('r');
        recomecarItem.setText("RECOMEÇAR");
        recomecarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomecarItemActionPerformed(evt);
            }
        });
        recomecarMenu.add(recomecarItem);

        jMenuBar13.add(recomecarMenu);

        setJMenuBar(jMenuBar13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carroBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(funcionarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(dataCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(horaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(carroBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(funcionarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(horaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantidade)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        int linhaAtual = jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(linhaAtual, 0);
        for (Object obj : lista) {
            Acidente cada = (Acidente) obj;
            if (cada.getId() == id) {
                acidente = cada;
            }
        }
        idCampo.setText(Integer.toString(acidente.getId()));
        horaCampo.setText(acidente.getHora());
        dataCampo.setText(acidente.getData());
        notasCampo.setText(acidente.getNotas());
        carroBox.setSelectedItem(acidente.getCarro().getNome());
        funcionarioBox.setSelectedItem(acidente.getFuncionario().getNome());
    }//GEN-LAST:event_jTable1KeyReleased

    private void adicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarItemActionPerformed
        this.setTitle("NOVO ACIDENTE");
        editarMenu.setEnabled(false);
        excluirMenu.setEnabled(false);
        salvarItem.setEnabled(true);
        JTextField campos[] = {dataCampo, horaCampo};
        for (JTextField cada : campos) {
            cada.setEnabled(true);
            cada.setText("");
        }
        notasCampo.setEnabled(true);
        carroBox.setEnabled(true);
        funcionarioBox.setEnabled(true);
        notasCampo.setText("");
        carroBox.grabFocus();
    }//GEN-LAST:event_adicionarItemActionPerformed

    private void salvarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarItemActionPerformed
        if (dataCampo.getText().isEmpty()
                || horaCampo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Em branco");

        } else {
            int max = 0;
            for (Object obj : lista) {
                Acidente cada = (Acidente) obj;
                max = (cada.getId() > max) ? cada.getId() : max;
            }

            int indiceC = carroBox.getSelectedIndex();
            carro = (Carro) carros.get(indiceC);

            int indiceF = funcionarioBox.getSelectedIndex();
            funcionario = (Funcionario) funcionarios.get(indiceF);

            acidente.setId(max + 1);
            acidente.setCarro(carro);
            acidente.setFuncionario(funcionario);
            acidente.setData(dataCampo.getText());
            acidente.setHora(horaCampo.getText());
            acidente.setNotas(notasCampo.getText().trim().replaceAll("\\s+", " "));

            lista.add(acidente);
            Object linha[] = {acidente.getId(), acidente.getCarro().getNome(),
                acidente.getFuncionario().getNome(), acidente.getData(), acidente.getHora()};
            tab.addRow(linha);
            try {
                Generico.salvaFicheiro(arquivo, lista);
                JOptionPane.showMessageDialog(null, "acidente id " + acidente.getId() + " criado");
                quantidade.setText("QUANTIDADE: " + Integer.toString(lista.size()));
                jTable1.requestFocus();
                jTable1.changeSelection(0, 0, false, false);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_salvarItemActionPerformed

    private void editarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarItemActionPerformed
        this.setTitle("EDITAR ACIDENTE");
        adicionarMenu.setEnabled(false);
        excluirMenu.setEnabled(false);
        atualizarItem.setEnabled(true);

        JTextField campos[] = {dataCampo, horaCampo};
        for (JTextField cada : campos) {
            cada.setEnabled(true);
        }
        notasCampo.setEnabled(true);
        carroBox.setEnabled(true);
        funcionarioBox.setEnabled(true);
    }//GEN-LAST:event_editarItemActionPerformed

    private void excluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirItemActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Quer apagar esse registo?", "Exclusão de registo", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {

            int linhaAtual = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(linhaAtual, 0);
            for (Object obj : lista) {
                Acidente cada = (Acidente) obj;
                if (cada.getId() == id) {
                    acidente = cada;
                }
            }
            lista.remove(acidente);
            try {
                Generico.salvaFicheiro(arquivo, lista);
                JOptionPane.showMessageDialog(null, "Registo excluído");
                tab.removeRow(jTable1.getSelectedRow());
                jTable1.requestFocus();
                jTable1.changeSelection(0, 0, false, false);
                quantidade.setText("QUANTIDADE: " + Integer.toString(lista.size()));

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
     }//GEN-LAST:event_excluirItemActionPerformed

    private void recomecarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomecarItemActionPerformed
        this.dispose();
        try {
            new FormAcidente().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormAcidente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_recomecarItemActionPerformed

    private void atualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarItemActionPerformed
        this.setTitle("ACIDENTE");
        int linhaAtual = jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(linhaAtual, 0);
        for (Object obj : lista) {
            Acidente cada = (Acidente) obj;
            if (cada.getId() == id) {
                acidente = cada;
            }
        }
        int indiceC = carroBox.getSelectedIndex();
        carro = (Carro) carros.get(indiceC);

        int indiceF = funcionarioBox.getSelectedIndex();
        funcionario = (Funcionario) funcionarios.get(indiceF);

        acidente.setCarro(carro);
        acidente.setFuncionario(funcionario);
        acidente.setData(dataCampo.getText());
        acidente.setHora(horaCampo.getText());
        acidente.setNotas(notasCampo.getText().trim().replaceAll("\\s+", " "));

        try {
            Generico.salvaFicheiro(arquivo, lista);
            JOptionPane.showMessageDialog(null, "acidente id " + acidente.getId() + " editado");
            jTable1.requestFocus();
            jTable1.changeSelection(0, 0, false, false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        jTable1.setValueAt(acidente.getId(), linhaAtual, 0);
        jTable1.setValueAt(acidente.getCarro().getNome(), linhaAtual, 1);
        jTable1.setValueAt(acidente.getFuncionario().getNome(), linhaAtual, 2);
        jTable1.setValueAt(acidente.getData(), linhaAtual, 3);
        jTable1.setValueAt(acidente.getHora(), linhaAtual, 4);
    }//GEN-LAST:event_atualizarItemActionPerformed

    private void dataCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCampoActionPerformed
        dataCampo.setText(Generico.diaMesAno("Data"));
    }//GEN-LAST:event_dataCampoActionPerformed

    private void horaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaCampoActionPerformed
        horaCampo.setText(Generico.horaMinuto("Hora"));
    }//GEN-LAST:event_horaCampoActionPerformed

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
            java.util.logging.Logger.getLogger(FormAcidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAcidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAcidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAcidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormAcidente().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormAcidente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem adicionarItem;
    private javax.swing.JMenu adicionarMenu;
    private javax.swing.JMenuItem atualizarItem;
    private javax.swing.JComboBox<String> carroBox;
    private javax.swing.JTextField dataCampo;
    private javax.swing.JMenuItem editarItem;
    private javax.swing.JMenu editarMenu;
    private javax.swing.JMenuItem excluirItem;
    private javax.swing.JMenu excluirMenu;
    private javax.swing.JComboBox<String> funcionarioBox;
    private javax.swing.JTextField horaCampo;
    private javax.swing.JTextField idCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar10;
    private javax.swing.JMenuBar jMenuBar11;
    private javax.swing.JMenuBar jMenuBar12;
    private javax.swing.JMenuBar jMenuBar13;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuBar jMenuBar9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea notasCampo;
    private javax.swing.JLabel quantidade;
    private javax.swing.JMenuItem recomecarItem;
    private javax.swing.JMenu recomecarMenu;
    private javax.swing.JMenuItem salvarItem;
    // End of variables declaration//GEN-END:variables
}
