// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", 30, "joao@email.com", "123456789", "Rua A");
        Usuario usuario2 = new Usuario("Maria", 25, "maria@email.com", "987654321", "Rua B");
        Usuario usuario3 = new Usuario("Pedro", 35, "pedro@email.com", "456789123", "Rua C");

        // Array de usuários
        Usuario[] usuarios = {usuario1, usuario2, usuario3};

        // Imprimir os usuários após serem criados
        Menu.imprimirUsuarios(usuarios);
        Menu.imprimirMenuListagem();
    }
}
