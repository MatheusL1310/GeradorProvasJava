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
public class Discursiva extends Questao {
    
    public String criteriosCorrecao = "";
    
    public Discursiva(){
    }
    
    public void criaDisc(){
        //Discursiva disc = new Discursiva();
        this.criaQuest();
        
        
        Scanner s = new Scanner(System.in);
       
        System.out.println("Digite os criterios de correcao: ");
        this.criteriosCorrecao = s.nextLine();
        //return disc;
    }
    
    public String retornaQuestao(){
        String disc = "";
        return disc = this.pergunta+" (Peso "+this.peso+") \n Criterios - "+this.criteriosCorrecao+".\n"
                + "__________________________________________________________________________________\n"
                + "__________________________________________________________________________________\n"
                + "__________________________________________________________________________________\n"
                + "__________________________________________________________________________________\n";
    }
}
