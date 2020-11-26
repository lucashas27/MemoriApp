
package memoriapp.agenda;

import memoriapp.Calendario;
import memoriapp.Dica;
import memoriapp.Usuario_Lista;
import memoriapp.Meta;
import memoriapp.agendaMensal;
import memoriapp.Usuario_Lista;
import memoriapp.novaAtividade;



public class agenda {

    public static void main(String[] args) {


        // iniciando um novo usuário


        Usuario_Lista usuario1 = new Usuario_Lista("saulo@gmail.com", "19803@G", "Saulo", "Ramos");
        Calendario calendario1 = new Calendario ( "Correr 2km", "Beber água", "Terça", "25");
        Dica dica1 = new Dica ("Saúde", "Beba Mais água","Correr 2km", "Beber água", "Terça", "Quinta");
        Meta metasDia = new Meta ("amarelo", "correr pela praia", 2,"correr 2km","se alongar antes de correr","reunião as 14h, correr as 19h","25");
        agendaMensal agendaSaulo = new agendaMensal(1, "sair pra beber, correr pela praia, reunião", "Beba mais água durante o seu dia!","beber 2 litros de água","beba em maiores quantidades por vez","","25");
        Usuario_Lista listaDoSaulo = new Usuario_Lista ("saulo@gmail.com", "19803@G", "Saulo", "Ramos");
        novaAtividade reuniao = new novaAtividade("importante", 1,"sair pra beber, correr pela praia, reunião", "Beba mais água durante o seu dia!","beber 2 litros de água","beba em maiores quantidades por vez","","25");


        // criar uma nova tarefa


        String nome = usuario1.setPrimeiroNome("Saulo");
        System.out.println("O seu primeiro nome é " + nome);

        String metaEstudar = metasDia.setNovaAtividade("Estudar por 2 horas seguidas");
        System.out.println("A sua tarefa consiste em " + metaEstudar);

        String DiaDoMes = calendario1.setDiaMensal();
        System.out.println("O dia do mês da sua tarefa é o dia " + DiaDoMes);
        
        String dicaTarefa = calendario1.setDicas("Tente utilizar o método de Pomodoro para estudar");
        System.out.println("A dica para a sua tarefa é " + dicaTarefa);
    }
    
}
