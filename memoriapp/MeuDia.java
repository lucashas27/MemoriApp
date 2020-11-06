
package memoriapp;

public class MeuDia extends Calendario {
    // attribute 
    private String cor;
    private String novaAtividade;
    
    
    //method
    public void alterarCor(){
        
    }

    public void adicionarAtividade(){
        
    }
    
    //constructor

    public MeuDia(String cor, String novaAtividade, String metas, String dicas, String meuDia, String diaMensal) {
        super(metas, dicas, meuDia, diaMensal);
        this.cor = cor;
        this.novaAtividade = novaAtividade;
    }
    
    

    //special method
    
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
    
    
    
    
    
}
