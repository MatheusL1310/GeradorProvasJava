
import java.util.Scanner;
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
        Scanner s = new Scanner(System.in);
        JOptionPane.showConfirmDialog(null, "Deseja criar uma prova?");
        Prova m1 = new Prova();
        
        // CRIANDO CABECALHO
        System.out.println("Qual a disciplina? ");
        m1.setNomeDisciplina(s.nextLine());        
        System.out.println("Qual o local?");
        m1.setLocal(s.nextLine());
        System.out.println("Qual a data?");
        m1.setData(s.nextLine());
        System.out.println("Qual o peso?");
        m1.setPeso(s.nextInt()); 
        String lixo = s.nextLine(); 
        
        // ADICIONANDO QUESTOES DISCURSIVAS
        System.out.println("Quantas questoes discursivas?");
        m1.qtdDis = s.nextInt();
        //Discursiva discursivas[] = new Discursiva[qtd-1];
        for (int i = 0;i<m1.qtdDis;i++){
            m1.dis[i].criaDisc();
        }
        
        // ADICIONANDO QUESTOES OBJETIVAS
        System.out.println("Quantas questoes objetivas?");
        m1.qtdObj = s.nextInt();
        for (int i = 0;i<m1.qtdObj;i++){
            m1.objeti[i].criaObjeti();
        }
        
        //  IMPRESSAO DA PROVA COMPLETA
        System.out.println(m1.obtemProvaImpressao());
        
        

// TESTE p/ ver se a classe filha consegue usar metodos da classe pai //
        /*Discursiva aux = new Discursiva();
        aux.criaDisc();
        System.out.println("Perg: "+aux.pergunta);
        System.out.println("Peso: "+aux.peso);
        System.out.println("crit: "+aux.criteriosCorrecao);*/
        
        //   ENTRADAS FORCADAS
        //m1.nomeDisciplina = "POO";
        //m1.peso = 10;
        //m1.setLocal("Lab 1");
        //m1.setData("14/03/2017");
        //System.out.println(m1.obtemDetalhes());
      }
}
