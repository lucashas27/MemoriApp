
package memoriapp;

public class Dica extends Calendario{
    //attribute
    private String tipoDica;
    private String textoDica;
     
    //method
    public void tipoDica(){
        
    }
    
    public void textoDica(){
        
    }
    
    // constructor

    public Dica(String tipoDica, String textoDica, String metas, String dicas, String meuDia, String diaMensal) {
        super(metas, dicas, meuDia, diaMensal);
        this.tipoDica = tipoDica;
        this.textoDica = textoDica;
    }

    
    
    //special method
    
    public String getTipoDica() {
        return tipoDica;
    }

    public void setTipoDica(String tipoDica) {
        this.tipoDica = tipoDica;
    }

    public String getTextoDica() {
        return textoDica;
    }

    public void setTextoDica(String textoDica) {
        this.textoDica = textoDica;
    }
    
      
    
}
