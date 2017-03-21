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
public abstract class Questao {
    public String pergunta = "";
    public double peso;
	

    public void criaQuest(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a pergunta: ");
        this.pergunta = s.nextLine();
        System.out.println("Digite o peso da questao: ");
        this.peso = Double.parseDouble(s.nextLine());
        }
    public abstract String retornaQuestao();


}
