package AgendaInteligente;

public class agendaMensal {  // extends Calendario {

        public Boolean darkMode;
        public String eventosSemanais, relatorio;


        public Boolean getDarkMode() {
            return darkMode;
        }

        public void setRelatorio(String relatorio) {
            this.relatorio = relatorio;
        }

        public String getEventosSemanais() {
            return eventosSemanais;
        }

        public String setEventosSemanais(String eventosSemanais) {
            this.eventosSemanais = eventosSemanais;
        }

        public void setDarkMode(Boolean darkMode) {
            this.darkMode = darkMode;
        }

        public String getRelatorio() {
            return relatorio;
        }
}
