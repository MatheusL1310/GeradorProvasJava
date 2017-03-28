
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5500907
 */
public class Principal {
    public static void main (String[] args){
        
        JOptionPane.showConfirmDialog(null, "Quer ver o cabeçalho?");
        Prova m1 = new Prova("POO");
        //m1.nomeDisciplina = "POO";
        //m1.peso = 10;
        m1.setLocal("Lab 1");
        m1.setData("14/03/2017");
 
        System.out.println(m1.obtemDetalhes());
      }
}
