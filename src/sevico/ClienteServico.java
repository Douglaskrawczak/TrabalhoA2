package sevico;

import java.util.ArrayList;

public abstract class ClienteServico<TDominio> {

    // CRUD- Create/ ReadAll & Read/ Update/ Delete

    public abstract ArrayList<TDominio> LerTodos();

    public abstract TDominio Ler(int chave);

    public abstract TDominio Atualizar(TDominio obj);

    public abstract TDominio Criar(TDominio obj);

    public abstract TDominio Deletar(int chave);

}
