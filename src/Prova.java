
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5500907
 */
public class Prova {
    private String nomeDisciplina;
    private double peso;
    private String local;
    private String data;
    ArrayList<Questao> questoes = new ArrayList<Questao>();
    //public Discursiva[] dis;
    //public Objetiva[] objeti;
    public int qtdDis = 0, qtdObj = 0;
    
    
    public Prova(){
        //this.nomeDisciplina = a;
        this.peso = 10.0;
    }
    
    public String obtemDetalhes(){
        String cabecalho = "";
        return cabecalho = "\nNome:                     \t\t\t\tDisciplina: "+this.getNomeDisciplina()+
                    "\nPeso: "+this.getPeso()+"\t\tLocal: "+this.getLocal()+"   \t\tData: "+this.getData()+"\n";
    }

    public String obtemProvaImpressao(){
        String prova = "";
        int cont = 0;
        prova = this.obtemDetalhes();
        
        for(int i = 0;i<questoes.size();i++){
            prova += "\n\tQuestao "+(i+1)+" - "+this.questoes.get(i).retornaQuestao();            
        }
        
        /*for(int i = 0;i<this.qtdDis;i++){
            cont++;
            prova += "\n\tQuestao "+(cont)+" - "+this.dis[i].retornaQuestao();
        }
        for(int j = 0; j<this.qtdObj;j++){
            cont++;
            prova += "\n\tQuestao "+(cont)+" - "+this.objeti[j].retornaQuestao();
        }*/
        return prova;
    }
    
    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
}
