
package memoriapp;

import java.util.Date;

public class Meta extends Calendario {
    
    //attribute
    private String cor;
    private String novaAtividade;
    private Date diaSemanal;

    //method
    public void alterarCor(){
        
        
    }
    
    public void criarAtividade(){
        
    }
    
    public void marcaDia(){
        
    }

    // constructor 

    public Meta(String cor, String novaAtividade, Date diaSemanal, String metas, String dicas, String meuDia, String diaMensal) {
        super(metas, dicas, meuDia, diaMensal);
        this.cor = cor;
        this.novaAtividade = novaAtividade;
        this.diaSemanal = diaSemanal;
    }

   
    

    // special method
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNovaAtividade() {
        return novaAtividade;
    }

    public void setNovaAtividade(String novaAtividade) {
        this.novaAtividade = novaAtividade;
    }

    public Date getDiaSemanal() {
        return diaSemanal;
    }

    public void setDiaSemanal(Date diaSemanal) {
        this.diaSemanal = diaSemanal;
    }
    
    
    
    
    
  
    
     
   
    
    
    
    
    
    
}
