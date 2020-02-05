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
public class Livro {
    String titulo;
    String editora;
    byte ano;
    String resumo;
    
    public void cadastrarLivro(){
        JOptionPane.showMessageDialog(null,"Cadastro de Livros");
        titulo = JOptionPane.showInputDialog("Entre com o titulo do livro");
        editora = JOptionPane.showInputDialog("Entre com o titulo do livro");
        resumo = JOptionPane.showInputDialog("Entre com o resumo do livro");
        ano = Byte.parseByte(JOptionPane.showInputDialog("Entre com o ano: "));
    }
    
    public void exibirLivro(){
        JOptionPane.showMessageDialog(null,"Livro Cadastrado");
        JOptionPane.showMessageDialog(null,"Titulo: " + titulo);
        JOptionPane.showMessageDialog(null,"Editora: " + editora);
        JOptionPane.showMessageDialog(null,"Resumo: " + resumo);
        JOptionPane.showMessageDialog(null,"Resumo: " + ano
        );
    }
}
