
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class Objetiva extends Questao {
	
    public String[] opcoes = new String[5];    
    public int respostaCorreta;
    
    public void criaObjeti(){
  
        this.criaQuest();
        
        Scanner s = new Scanner(System.in);
       
        for (int i = 0;i<5;i++){
        System.out.println("Digite a opcao - "+(i+1)+" : ");
        this.opcoes[i] = s.nextLine();
        }
        System.out.println("Digite a opcao correta: [1=a,2=b,...]");
        this.respostaCorreta = (Integer.parseInt(s.nextLine()))-1;
        //String lixo = s.nextLine();
    }
    
    public String retornaQuestao(){
        String objeti = "";
        return objeti = this.pergunta+" (Peso "+this.peso+") \n"
                + "a) "+this.opcoes[0]+"\n"
                + "b) "+this.opcoes[1]+"\n"
                + "c) "+this.opcoes[2]+"\n"
                + "d) "+this.opcoes[3]+"\n"
                + "e) "+this.opcoes[4]+"\n";
    }

}
