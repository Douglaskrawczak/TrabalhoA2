package repositorio;

import java.util.ArrayList;

public abstract class ClienteRepositorio<TDominio> {
    // CRUD
    protected ArrayList<TDominio> fonteDeDados;

    public abstract TDominio Create(TDominio instacia);

    public ArrayList<TDominio> ReadAll() {
        return this.fonteDeDados;
    }

    public abstract TDominio Read(int chave);

    public abstract TDominio Update(TDominio instacia);

    public abstract TDominio Delete(int chave);

}
