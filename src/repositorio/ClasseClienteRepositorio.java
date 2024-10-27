package repositorio;

import dominio.ClasseCliente;
import fakedb.ClasseClienteFakeDB;

public class ClasseClienteRepositorio extends ClienteRepositorio<ClasseCliente> {

    private ClasseClienteFakeDB db;

    public ClasseClienteRepositorio() {
        this.db = new ClasseClienteFakeDB();
        this.fonteDeDados = this.db.getTabela();
    }

    @Override
    public ClasseCliente Create(ClasseCliente instacia) {

        int proxChave = this.fonteDeDados.getLast().getCodigo() + 1;
        instacia.setCodigo(proxChave);
        this.fonteDeDados.add(instacia);
        return instacia;

    }

    @Override
    public ClasseCliente Read(int chave) {
        for (ClasseCliente cp : this.fonteDeDados) {
            if (cp.getCodigo() == chave) {
                return cp;
            }
        }
        return null;

    }

    @Override
    public ClasseCliente Update(ClasseCliente instacia) {

        ClasseCliente cp = this.Read(instacia.getCodigo());
        if (cp != null) {
            cp.setNome(instacia.getNome());
            cp.setCpf(instacia.getCpf());
            cp.setEmail(instacia.getEmail());
            cp.setTelefone(instacia.getTelefone());
            return cp;
        } else {
            return null;
        }

    }

    @Override
    public ClasseCliente Delete(int chave) {

        ClasseCliente cp = this.Read(chave);
        if (cp != null) {
            this.fonteDeDados.remove(cp);
            return cp;
        } else {
            return null;
        }

    }

}
