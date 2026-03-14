import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, Integer> estoque = new HashMap<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Cadastrar/Atualizar um produto e sua quantidade.");
            System.out.println("2. Consultar a quantidade de um produto através do código.");
            System.out.println("3. Listar todos produtos.");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.print("Digite o código do produto: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());

                    estoque.put(id, quantidade);
                    System.out.println("Produto adicionado");
                }
                case "2" -> {
                    System.out.print("Informa o código do produto: ");
                    int idConsulta = Integer.parseInt(scanner.nextLine());

                    if (estoque.containsKey(idConsulta)) {
                        int quantidade = estoque.get(idConsulta);
                        System.out.println("Produto " + idConsulta + " Quantidade em estoque: " + quantidade);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                }
                case "3" -> {
                    System.out.println("Listando produtos...");
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio");
                    } else {
                        for (Integer codigo : estoque.keySet()) {
                            Integer quantidade = estoque.get(codigo);

                            System.out.println("Código: " + codigo + " Quantidade: " + quantidade);
                        }
                    }
                }
                case "4" -> {
                    System.out.println("Saindo...");
                    continuar = false;
                }
                default -> {
                    System.out.println("Opção inválida");
                }
            }
        }
        scanner.close();
    }
}
