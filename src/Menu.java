public class Menu {
    public static void imprimirMenuCadastro() {
        System.out.println("Menu de Opções de Cadastro:");
        System.out.println("1. Cadastrar novo usuário");
        System.out.println("2. Voltar ao menu principal");
    }

    public static void imprimirMenuListagem() {
        System.out.println("Menu de Opções de Listagem:");
        System.out.println("1. Listar todos os usuários");
        System.out.println("2. Voltar ao menu principal");
        System.out.println();
    }

    public static void imprimirUsuarios(Usuario[] usuarios) {
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome() + ", Idade: " + usuario.getIdade() + ", Email: " +
                    usuario.getEmail() + ", Telefone: " + usuario.getTelefone() + ", Endereço: " +
                    usuario.getEndereco());
        }
    }
}

