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
    private int peso;
    private String local;
    private String data;
    public Discursiva[] dis;
    public Objetiva[] objeti;
    
    
    
    public Prova(){
        //this.nomeDisciplina = a;
        this.peso = 10;
    }
    
    public String obtemDetalhes(){
        String cabecalho = "";
        return cabecalho = "\n\tNome:                     \tDisciplina: "+this.getNomeDisciplina()+
                    "\n\tPeso: "+this.getPeso()+"\tLocal: "+this.getLocal()+"   Data: "+this.getData()+"\n";
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
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
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
