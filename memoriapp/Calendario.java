
package memoriapp;

import java.util.ArrayList;

public class Calendario {
    
    public String metas;
    public String dicas;
    public String meuDia;
    public String diaMensal;
    
    ArrayList<Meta> metasDia;
    ArrayList<Dica> minhasDicas;

    // contructor 
    public Calendario(String metas, String dicas, String meuDia, String diaMensal) {
        this.metas = metas;
        this.dicas = dicas;
        this.meuDia = meuDia;
        this.diaMensal = diaMensal;
    }
    
    // special method 

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas;
    }

    public String getDicas() {
        return dicas;
    }

    public String setDicas(String dicas) {
        this.dicas = dicas;
        return dicas;
    }

    public String getMeuDia() {
        return meuDia;
    }

    public void setMeuDia(String meuDia) {
        this.meuDia = meuDia;
    }

    public String getDiaMensal() {
        return diaMensal;
    }

    public void setDiaMensal(String diaMensal) {
        this.diaMensal = diaMensal;
    }


    public String setDiaMensal() {
        return null;
    }
}
