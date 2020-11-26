
package memoriapp;

public class agendaMensal extends Calendario { 

        public Boolean darkMode;
        public String eventosSemanais, relatorio;
        

    public agendaMensal(int darkMode, String eventosSemanais, String relatorio, String metas, String dicas, String meuDia, String diaMensal) {
        super(metas, dicas, meuDia, diaMensal);
        this.eventosSemanais = eventosSemanais;
        this.relatorio = relatorio;
    }

        

        public Boolean getDarkMode() {
           return darkMode;
        }

        public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
        }

        public String getEventosSemanais() {
            return eventosSemanais;
        }

        public void setEventosSemanais(String eventosSemanais) {
            this.eventosSemanais = eventosSemanais;
        }

        public void setDarkMode(Boolean darkMode) {
            this.darkMode = darkMode;
        }

        public String getRelatorio() {
            return relatorio;
        }
}
