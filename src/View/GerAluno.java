/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import Controller.AlunoController;
import Controller.AlunoGerencia;
import Controller.ValidaAluno;
import Model.Aluno;


/**
 *
 * @author josep
 */
public class GerAluno extends javax.swing.JFrame {   
    /**
     * Creates new form GerAluno
     */
    //Cria uma propriedade para trazer a lista de alunos
    private AlunoController alunoController;
    private String mensagem;
    private List<Aluno> alunos;
    private int posicao;
    //Cria um modelo de tabela
    DefaultTableModel model;

    //Construtor da Classe
    public GerAluno() throws SQLException  {
        
        // Configurações da janela GerAluno
        setLocationRelativeTo(null);
        setTitle("Gerenciador de Alunos");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Lógica para retornar à TelaPrincipal
                // Voltar para Tela Principal
                TelaPrincipal nj = new TelaPrincipal();                
                nj.setVisible(true);
                dispose(); // Fecha a janela
        
            }
        });

        initComponents(); // Inicializa os componentes da GUI 
        // Cria um objeto da classe AlunoController
        alunoController = new AlunoController();         
        // Carregar dados na tabela
        carregarDadosNaTabela();              

    }

      /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //Incluindo uma barra de rolagem na tabela
        JScrollPane scrollPane = new JScrollPane(ga_TabAlunos);
        add(scrollPane, BorderLayout.CENTER);
        //Fim da inclusão da barra de rolagem na tabela
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ga_NomeAluno = new javax.swing.JTextField();
        ga_IdadeAluno = new javax.swing.JTextField();
        ga_Curso = new javax.swing.JComboBox<>();
        ga_Serie = new javax.swing.JComboBox<>();
        ga_AtualizaDados = new javax.swing.JButton();
        ga_Apagar = new javax.swing.JButton();
        ga_LimpaEdicao = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ga_CPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ga_TabAlunos = new javax.swing.JTable();
        ga_ID = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ga_VoltarTPrinc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome aluno:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Idade aluno:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Curso:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Série:");

        ga_IdadeAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ga_IdadeAluno.setToolTipText("");

        ga_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ADS", "Ciência da Computação", "GTI", "Jogos Digitais", "Sistema da Informação" }));
        ga_Curso.setToolTipText("");

        ga_Serie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Primeira", "Segunda", "Terceira", "Quarta", "Quinta", "Sexta", "Sétima", "Oitavo" }));
        ga_Serie.setToolTipText("");

        ga_AtualizaDados.setText("Atualizar Dados");
        ga_AtualizaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ga_AtualizaDadosActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        ga_Apagar.setText("Apagar");
        ga_Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ga_ApagarActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        ga_LimpaEdicao.setText("Limpa a Edição");
        ga_LimpaEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ga_LimpaEdicaoActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CPF");
        jLabel7.setToolTipText("");

        ga_TabAlunos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ga_TabAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "CPF", "Idade", "Curso", "Serie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ga_TabAlunos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ga_TabAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ga_TabAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ga_TabAlunos);

        ga_ID.setEditable(false);
        ga_ID.setToolTipText("");
        ga_ID.setBorder(null);
        ga_ID.setEnabled(false);
        ga_ID.setFocusable(false);

        jMenu1.setText("Arquivo");

        ga_VoltarTPrinc.setText("Voltar a Tela Principal");
        ga_VoltarTPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ga_VoltarTPrincActionPerformed(evt);
            }
        });
        jMenu1.add(ga_VoltarTPrinc);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(ga_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ga_NomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ga_IdadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ga_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ga_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ga_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ga_AtualizaDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ga_Apagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ga_LimpaEdicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(ga_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ga_LimpaEdicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ga_AtualizaDados)
                                .addGap(32, 32, 32)
                                .addComponent(ga_Apagar)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(ga_NomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ga_IdadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ga_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ga_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ga_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /* +--------------------------+
       | Código Personalizado     |
       +--------------------------+ 
    */  

    private void ga_VoltarTPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ga_VoltarTPrincActionPerformed
        // Voltar para Tela Principal
        TelaPrincipal nj = new TelaPrincipal();
        nj.setVisible(true);
        // Centraliza o frame no centro da tela
        nj.setLocationRelativeTo(null);   
        dispose(); // Fecha a janela
        
    }//GEN-LAST:event_ga_VoltarTPrincActionPerformed

    private void ga_TabAlunosMouseClicked (java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ga_TabAlunosMouseClicked
        // Escolhe um aluno na lista para edição
        // Pega a posição do aluno na tabela
        ga_ID.setText("");
        ga_NomeAluno.setText("");
        ga_CPF.setText("");
        ga_IdadeAluno.setText("");
        ga_Curso.setSelectedIndex(0);
        ga_Serie.setSelectedIndex(0);


        posicao = this.ga_TabAlunos.getSelectedRow();
        // Pega linha selecionada
        if (posicao != -1) {
           // Pega os dados do aluno na linha selecionada
           ga_ID.setText(ga_TabAlunos.getValueAt(posicao, 0).toString());
           ga_NomeAluno.setText(ga_TabAlunos.getValueAt(posicao, 1).toString());
           ga_CPF.setText(ga_TabAlunos.getValueAt(posicao, 2).toString());
           ga_IdadeAluno.setText(ga_TabAlunos.getValueAt(posicao, 3).toString());
           ga_Curso.setSelectedItem(ga_TabAlunos.getValueAt(posicao, 4).toString());
           ga_Serie.setSelectedItem(ga_TabAlunos.getValueAt(posicao, 5).toString());
        }
       
    }//GEN-LAST:event_ga_TabAlunosMouseClicked

    // Método para carregar os dados na tabela
     private void carregarDadosNaTabela() throws SQLException {
        //Cria uma lista de alunos
        alunos = alunoController.getAlunos();
        model = (DefaultTableModel) ga_TabAlunos.getModel();
        model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        for (Aluno aluno : alunos) {
            model.addRow(new Object[]{aluno.getId(), aluno.getNome(), aluno.getCpf(), aluno.getIdade(), aluno.getCurso(), aluno.getFase()});
        }
    }  

    /**
     * @param evt
     * @throws SQLException
     */
    private void ga_LimpaEdicaoActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_ga_LimpaEdicaoActionPerformed
        // Limpa a Edição
        ga_ID.setText("");
        ga_NomeAluno.setText("");
        ga_CPF.setText("");
        ga_IdadeAluno.setText("");
        ga_Curso.setSelectedIndex(0);
        ga_Serie.setSelectedIndex(0);      

    }//GEN-LAST:event_ga_LimpaEdicaoActionPerformed


    private void AtualizaDadosNaTabela( int posicao, Aluno aluno) throws SQLException {
        // Atualiza a lista na tabela
        carregarDadosNaTabela();
    }


    /**
     * @param evt
     */
    private void ga_AtualizaDadosActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_ga_AtualizaDadosActionPerformed
        // Atualiza dados na tabela
        // Instacia o objeto Aluno
        Aluno aluno = new Aluno();
        //Atribui os valore dos campos do formulário ao objeto aluno
        aluno.setId(Integer.parseInt(ga_ID.getText()));
        aluno.setNome(ga_NomeAluno.getText());
        aluno.setCpf(ga_CPF.getText());
        aluno.setIdade(Integer.parseInt(ga_IdadeAluno.getText()));
        aluno.setCurso(ga_Curso.getSelectedItem().toString());
        aluno.setFase(ga_Serie.getSelectedItem().toString());
        // Posição na tabela
        posicao = this.ga_TabAlunos.getSelectedRow();

       mensagem = ValidaAluno.valida(aluno);
       if (mensagem == "Valido") {
           // chama o método no Controller para inserir e validar os dados
           mensagem = AlunoGerencia.insereAluno(aluno);
            // Atualiza a lista na tabela
            AtualizaDadosNaTabela(posicao, aluno);
            JOptionPane.showMessageDialog(null, mensagem);
       } else {
           JOptionPane.showMessageDialog(null, mensagem);
       }            

    }//GEN-LAST:event_ga_AtualizaDadosActionPerformed

    private void ga_ApagarActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_ga_ApagarActionPerformed
        // Apaga os dados

        // Instacia o objeto Aluno
        Aluno aluno = new Aluno();

        //Atribui os valore dos campos do formulário ao objeto aluno
        aluno.setId(Integer.parseInt(ga_ID.getText()));
        int id=aluno.getId();
        // Posição na tabela
        posicao = this.ga_TabAlunos.getSelectedRow();

        mensagem = AlunoGerencia.apagaAluno(id);
        JOptionPane.showMessageDialog(null, mensagem);
         // Atualiza a lista na tabela
         AtualizaDadosNaTabela(posicao, aluno);


    }//GEN-LAST:event_ga_ApagarActionPerformed

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
            java.util.logging.Logger.getLogger(GerAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GerAluno().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ga_Apagar;
    private javax.swing.JButton ga_AtualizaDados;
    private javax.swing.JTextField ga_CPF;
    private javax.swing.JComboBox<String> ga_Curso;
    private javax.swing.JTextField ga_ID;
    private javax.swing.JTextField ga_IdadeAluno;
    private javax.swing.JButton ga_LimpaEdicao;
    private javax.swing.JTextField ga_NomeAluno;
    private javax.swing.JComboBox<String> ga_Serie;
    private javax.swing.JTable ga_TabAlunos;
    private javax.swing.JMenuItem ga_VoltarTPrinc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
