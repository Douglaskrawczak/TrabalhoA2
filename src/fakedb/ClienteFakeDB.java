package fakedb;

import java.util.ArrayList;

public abstract class ClienteFakeDB<Tdominio> {

    protected ArrayList<Tdominio> tabela;

    public ArrayList<Tdominio> getTabela() {
        return tabela;
    }

    protected abstract void preencherDados();

    public ClienteFakeDB() {
        this.preencherDados();
    }
}
