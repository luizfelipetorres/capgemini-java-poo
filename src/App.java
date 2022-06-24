import ex01.Pessoa;
import ex02.ContaCorrente;
import ex03.BombaCombustivel;
import ex04.Elevador;
import ex05.Aluno;
import ex06.Invoice;
import ex07.Funcionario;
import ex08.Data;
import ex09.Voo;
import ex10.Jogador;
import ex10.Jogador.Posicao;
import ex11.Ingresso;
import ex11.IngressoVip;
import ex12.Agenda;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /*
         * ex01();
         * ex02();
         * ex03();
         * ex04();
         * ex05();
         * ex06();
         * ex07();
         * ex08();
         * ex09();
         * ex10();
         * ex11();
         ex12();
         */

         String valor = "1";
         System.out.println(valor+1+2);
    }

    static void ex12() {
        System.out.println("App.ex12()");
        Agenda a = new Agenda();
        Pessoa p1 = new Pessoa("Luiz", "13/12/1996", 1.8f);
        Pessoa p2 = new Pessoa("Vanda", "13/12/1996", 1.8f);
        Pessoa p3 = new Pessoa("Luis", "13/12/1996", 1.8f);
        Pessoa p4 = new Pessoa("Diego", "13/12/1996", 1.8f);

        a.armazenarPessoa(p1);
        a.armazenarPessoa(p2);
        a.armazenarPessoa(p3);
        a.armazenarPessoa(p4);
        System.out.println(a.buscarPessoa(p3));
        a.removerPessoa(p3);
        a.imprimirAgenda();
        a.imprimirPessoa(2);
    }

    static void ex11() {
        System.out.println("App.ex11()");
        Ingresso i = new Ingresso();
        i.imprimirValor();
        IngressoVip iv = new IngressoVip();
        iv.imprimirValor();

    }

    static void ex10() {
        System.out.println("App.ex10()");
        Jogador ney = new Jogador("Neymar", Posicao.ATAQUE, new Data(13, 12, 1996), 1.8f, 90f);

        System.out.println(ney.toString());
        System.out.println(ney.getIdade());
        System.out.printf("Faltam %d anos para a aposentadoria de %s.\n", ney.getTempoAposentadoria(), ney.getNome());
    }

    static void ex09() {
        Voo v = new Voo("100", new Data(13, 12, 1996));
        System.out.println(v.toString());

        System.out.println("Primeiro assento livre: " + v.proximoLivre());
        v.ocupa(1);
        v.ocupa(2);
        v.ocupa(101);
        v.isVazio(1);
        System.out.println("Primeiro assento livre: " + v.proximoLivre());

    }

    static void ex08() {
        Data d1 = new Data(30, 1, 2022);
        Data d2 = new Data(30, 5, 2022);
        Data d3 = d1.clone();
        System.out.println(d1.toString());
        System.out.println(d1.compare(d2) == -1);
        System.out.println(d3.toString());

    }

    static void ex01() {
        System.out.println("Executando ex01");
        Pessoa p = new Pessoa("Luiz", "13 dezembro 1996", 1.77f);
        System.out.println(p.toString());
    }

    static void ex02() {
        System.out.println("Executando ex02");
        ContaCorrente c = new ContaCorrente("Luiz Felipe", 11122, 100f);
        System.out.println(c.toString());
        c.alterarNome("Carlos Alberto");
        System.out.println(c.toString());
        c.saque(50f);
    }

    static void ex03() {
        BombaCombustivel b1 = new BombaCombustivel("Gasolina", 5.5f, 10f);

        b1.abastecerPorLitro(3f);
        b1.abastecerPorValor(5.5f * 7);
        b1.abastecerPorLitro(1f);
        b1.abastecerPorValor(1f);
        b1.alterarCombustivel("Alcool");
        b1.alterarValor(2f);
        b1.alterarQuantidadeCombustivel(50f);
        b1.abastecerPorLitro(40f);
        System.out.println(b1.toString());

    }

    static void ex04() {
        System.out.println("Iniciando ex4");

        Elevador e = new Elevador();
        e.inicializa(2, 3);
        System.out.println(e.toString());
        e.entra();
        e.entra();
        e.entra();
        System.out.println(e.toString());
        e.sai();
        System.out.println(e.toString());
        for (int i = 0; i < 4; i++) {
            e.sobre();
        }
        System.out.println(e.toString());

    }

    static void ex05() {
        System.out.println("Iniciando ex05");
        Aluno a = new Aluno("20212101", "Luiz F", 3f, 2f, 5f);

        System.out.println("Sua média é " + a.media());
        System.out.println("Voce precisa de " + a.notaFinal() + " para a prova final");

    }

    static void ex06() {
        Invoice i = new Invoice(1, "Cadeira gamer", 3, 1000);
        System.out.printf("Valor faturado total: R$ %.2f\n", i.getInvoiceAmount());

        Invoice j = new Invoice(2, "lapis", -3, -1);
        System.out.printf("Valor faturado total: R$ %.2f\n", j.getInvoiceAmount());
    }

    static void ex07() {
        System.out.println("App.ex07()");
        Funcionario fulano = new Funcionario("Fulano", "de Tal", 1000f);
        Funcionario ciclano = new Funcionario("Ciclano", "de Tal", -20f);

        System.out.printf("Salário anual: R$ %.2f\n", fulano.getAnual());
        System.out.printf("Salário anual: R$ %.2f\n", ciclano.getAnual());

        // Aumento de 10%
        fulano.setSalario(fulano.getSalario() * 1.1f);
        ciclano.setSalario(ciclano.getSalario() * 1.1f);
        System.out.printf("Salário anual: R$ %.2f\n", fulano.getAnual());
        System.out.printf("Salário anual: R$ %.2f\n", ciclano.getAnual());

    }

}
