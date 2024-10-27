package visao;

import java.util.Scanner;

public abstract class ClienteMenu {

    protected Scanner scanner;

    public ClienteMenu() {
        this.scanner = new Scanner(System.in);// System.in aponta para entrada padrão do sistema
    }

    public abstract void ExibirMenu();

    public abstract void Listar();

    public abstract void Localizar();

    public abstract void Adicionar();

    public abstract void Atualizar();

    public abstract void Remover();

}
