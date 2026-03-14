import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> convidados = new LinkedHashSet<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Adicionar convidado");
            System.out.println("2. Listar convidados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.print("Digite o nome do convidado: ");
                    String nome = scanner.nextLine();

                    if (convidados.add(nome)) {
                        System.out.println("Convidado adicionado com sucesso!");
                    } else {
                        System.out.println("Este convidado já está na lista!");
                    }
                }
                case "2" -> {
                    if (convidados.isEmpty()) {
                        System.out.println("A lista de convidados está vazia");
                    } else {
                        System.out.println("Total de convidados: " + convidados.size() + " pessoas");
                        for (String convidado : convidados) {
                            System.out.println(convidado);
                        }
                    }
                }
                case "3" -> {
                    System.out.println("Saindo...");
                    continuar = false;
                }
                default -> {
                    System.out.println("Digite uma opção válida!");
                }
            }
        }
        scanner.close();

    }

}
