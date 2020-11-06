
package memoriapp;

public class novaAtividade extends agendaMensal {

    public String classificacaoDeAtividades;

    void nomearAtividade() {

    }

    public novaAtividade(String classificacaoDeAtividades, Boolean darkMode, String eventosSemanais, String relatorio, String metas, String dicas, String meuDia, String diaMensal) {
        super(darkMode, eventosSemanais, relatorio, metas, dicas, meuDia, diaMensal);
        this.classificacaoDeAtividades = classificacaoDeAtividades;
    }

    

    public String getClassificacaoDeAtividades() {
        return classificacaoDeAtividades;
    }

    public void setClassificacaoDeAtividades(String classificacaoDeAtividades) {
        this.classificacaoDeAtividades = classificacaoDeAtividades;
    }

}
