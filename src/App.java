import ex01.Pessoa;
import ex02.ContaCorrente;
import ex03.BombaCombustivel;
import ex04.Elevador;
import ex05.Aluno;
import ex06.Invoice;
import ex07.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        // ex06();
        ex07();
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

        //Aumento de 10%
        fulano.setSalario(fulano.getSalario() * 1.1f);
        ciclano.setSalario(ciclano.getSalario() * 1.1f);
        System.out.printf("Salário anual: R$ %.2f\n", fulano.getAnual());
        System.out.printf("Salário anual: R$ %.2f\n", ciclano.getAnual());

    }
}
