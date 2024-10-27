package visao;

import java.util.ArrayList;

import dominio.ClasseCliente;
import sevico.ClasseClienteServico;

public class ClasseClienteMenu extends ClienteMenu {

    private ClasseClienteServico srv;

    public ClasseClienteMenu() {
        super();
        this.srv = new ClasseClienteServico();
    }

    @Override
    public void ExibirMenu() {

        int opção = 0;
        while (opção != 9) {

            System.out.println("Classe Cliente:");
            System.out.println("=================");
            System.out.println("Menu de Opções:");
            System.out.println("=================");
            System.out.println("1 Listar:");
            System.out.println("2 Localizar:");
            System.out.println("3 Adicionar:");
            System.out.println("4 Atualizar:");
            System.out.println("5 Remover:");
            System.out.println("9 sair:");
            System.out.println("Digite sua opção:");
            opção = this.scanner.nextInt();

            switch (opção) {
                case 1:
                    this.Listar();
                    break;

                case 2:
                    this.Localizar();
                    break;

                case 3:
                    this.Adicionar();
                    break;

                case 4:
                    this.Atualizar();
                    break;

                case 5:
                    this.Remover();
                    break;

                case 9:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

    }

    @Override
    public void Listar() {
        Util.ClearConsole();
        System.out.println("Listando...");
        ArrayList<ClasseCliente> lista = srv.LerTodos();
        for (ClasseCliente cp : lista) {
            this.Imprimir(cp);
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    @Override
    public void Localizar() {
        Util.ClearConsole();
        System.out.println("Localizando...");
        System.out.print("Informe o Código da Classe Produto:");
        int codigo = scanner.nextInt();

        ClasseCliente cp = this.srv.Ler(codigo);

        if (cp != null) {
            Imprimir(cp);
        } else {
            System.out.println("Problema - Classe não Encontrada...");
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    @Override
    public void Adicionar() {
        Util.ClearConsole();
        System.out.println("Adicionando...");

        System.out.print("Imforme a Descrição da Classe de Produto:");
        String descricao = scanner.next();

        ClasseCliente cp = new ClasseCliente();
        cp.setCodigo(0);
        cp.setNome(descricao);
        cp.setCpf(descricao);
        cp.setEmail(descricao);
        cp.setTelefone(descricao);

        ClasseCliente cpNovo = this.srv.Criar(cp);

        if (cpNovo != null) {
            System.out.println("Classe de Produto adicionada com sucesso");
        } else {
            System.out.println("Problema - Classe de Produto não foi adicionada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    @Override
    public void Atualizar() {
        Util.ClearConsole();
        System.out.println("Atualizando...");

        System.out.println("Informe o código da Classe Produto:");

        int codigo = scanner.nextInt();

        ClasseCliente cp = this.srv.Ler(codigo);
        if (cp != null) {
            System.out.print("Informe a nova Descrição para esta Classe de Produto: ");
            String descricao = scanner.next();
            cp.setNome(descricao);
            cp.setCpf(descricao);
            cp.setEmail(descricao);
            cp.setTelefone(descricao);
            if (this.srv.Atualizar(cp) != null) {
                System.out.println("Classe de Produto atualizada com sucesso");
            } else {
                System.out.println("Problema - Classe de Produto não foi atualizada");
            }
        } else {
            System.out.println("Problema - Classe de Produto não encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();

    }

    @Override
    public void Remover() {
        Util.ClearConsole();
        System.out.println("Removendo...");
        System.out.print("Informe o código da Classe de Produto: ");
        int codigo = scanner.nextInt();

        ClasseCliente cp = this.srv.Ler(codigo);
        if (cp != null) {
            if (this.srv.Deletar(codigo) != null) {
                System.out.println("Classe de Produto removida com sucesso");
            } else {
                System.out.println("Problema - Classe de Produto não foi removida");
            }
        } else {
            System.out.println("Problema - Classe de Produto não encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    private void Imprimir(ClasseCliente cp) {
        System.out.println("Classe de Cliente:");
        System.out.println("Código: " + cp.getCodigo());
        System.out.println("Nome: " + cp.getNome());
        System.out.println("Cpf: " + cp.getCpf());
        System.out.println("Email:" + cp.getEmail());
        System.out.println("Telefone:" + cp.getTelefone());
        System.out.println("-------------------------------------------------------");
    }

}
