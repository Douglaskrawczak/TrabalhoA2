package fakedb;

import java.util.ArrayList;

import dominio.ClasseCliente;

public class ClasseClienteFakeDB extends ClienteFakeDB<ClasseCliente> {

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<ClasseCliente>();
        this.tabela.add(new ClasseCliente(1, "Douglas", "01234567890", "douglasteste@gmail.com", "(67)01234-5678"));
        this.tabela.add(new ClasseCliente(2, "Maria", "24697315893", "mariateste@gmail.com", "(67)89462-7259"));
        this.tabela.add(new ClasseCliente(3, "Mariana", "54930579105", "marianateste@gmail.com", "(67)62389-8987"));
        this.tabela.add(new ClasseCliente(4, "Luis", "94627863460", "luisteste@gmail.com", "(67)64328-9468"));
        this.tabela.add(new ClasseCliente(5, "Daniel", "55642398760", "danielteste@gmail.com", "(67)59461-8487"));
    }

    public ClasseClienteFakeDB() {
        super();
    }
}
