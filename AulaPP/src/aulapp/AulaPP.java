/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapp;

import javax.swing.JOptionPane;

/**
 *
 * @author natan_nascimento
 */
public class AulaPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*JOptionPane.showMessageDialog(null, "Teste");
        String nome  = JOptionPane.showInputDialog("Entre com seu nome");
        JOptionPane.showMessageDialog(null, "Olá " + nome );
        int idade = Integer.parseInt(JOptionPane.showInputDialog(("Entre com sua idade: ")));
        
        if(idade < 18){
            JOptionPane.showMessageDialog(null, "Menor" );
        }else{
            JOptionPane.showMessageDialog(null, "Maior" );
        }*/
        
        Livro livro1 = new Livro();
        livro1.cadastrarLivro();
        livro1.exibirLivro();
    }
    
} 
