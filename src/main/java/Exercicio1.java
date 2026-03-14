import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> listaDeNomes = new ArrayList<>();

        boolean continuar = true;

        System.out.println("--- LISTA DE PRESENÇA ---");

        while (continuar) {
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Ver lista de presença");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.print("Digite o nome do aluno: ");
                    String nomeDoAluno = scanner.nextLine();
                    listaDeNomes.add(nomeDoAluno);
                }
                case "2" -> {
                    System.out.println("--- Exibindo lista ---");
                    if (listaDeNomes.isEmpty()) {
                        throw new RuntimeException("Lista vazia");
                    } else {
                        for (String listaDeNome : listaDeNomes) {
                            System.out.println(listaDeNome);
                        }
                    }
                }
                case "3" -> {
                    System.out.println("Saindo...");
                    continuar = false;
                }
                default -> {
                    System.out.println("Digite uma opção válida.");
                }
            }
        }
        scanner.close();
    }
}