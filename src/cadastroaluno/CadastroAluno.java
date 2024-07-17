/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroaluno;

import View.TelaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author josep
 */
public class CadastroAluno extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Classe Iniciadora do Programa        
        // Cria o objeto Tela Principal
        TelaPrincipal objetotela = new TelaPrincipal();
        objetotela.setTitle("Cadastro de Alunos");
        //Deixar a janela visivel
        objetotela.setVisible(true);
        // Centralizar a janela Principal
        objetotela.setLocationRelativeTo(null);
        //Finalizar o programa ao clicar no X
        objetotela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  
       
    }
    
}
