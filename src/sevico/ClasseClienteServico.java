package sevico;

import java.util.ArrayList;

import dominio.ClasseCliente;
import repositorio.ClasseClienteRepositorio;

public class ClasseClienteServico extends ClienteServico<ClasseCliente> {

    private ClasseClienteRepositorio repositorio;

    public ClasseClienteServico() {
        this.repositorio = new ClasseClienteRepositorio();
    }

    @Override
    public ArrayList<ClasseCliente> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public ClasseCliente Ler(int chave) {
        return this.repositorio.Read(chave);

    }

    @Override
    public ClasseCliente Atualizar(ClasseCliente obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public ClasseCliente Criar(ClasseCliente obj) {
        return this.repositorio.Create(obj);

    }

    @Override
    public ClasseCliente Deletar(int chave) {
        return this.repositorio.Delete(chave);

    }

}