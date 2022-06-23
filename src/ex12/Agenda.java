package ex12;

import java.util.ArrayList;
import java.util.Iterator;

import ex01.Pessoa;

public class Agenda {
    private ArrayList<Pessoa> p = new ArrayList<Pessoa>();
    
    public void armazenarPessoa(Pessoa p){
        this.p.add(p);
    }

    public void removerPessoa(Pessoa p){
        this.p.remove(p);
    }

    public int buscarPessoa(Pessoa p){
        return this.p.indexOf(p);
    }

    public void imprimirAgenda(){
        System.out.println("Imprimindo todas as pessoas da agenda: ");
        this.p.forEach((p) -> System.out.println(p));
    }

    public void imprimirPessoa(int i){
        System.out.printf("Imprimino pessoa na posicao %d\n", i);
        System.out.println(this.p.get(i));
        
    }

    @Override
    public String toString() {
        return "Agenda [p=" + p + "]";
    }
}
