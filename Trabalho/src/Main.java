import Model.Banco;
import Model.Cliente;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static void printMenu() {
        System.out.println("\nBem vindo ao Banco Java:\n\n");
        System.out.println("1 - Cadastrar Cliente Fisico");
        System.out.println("2 - Cadastrar Cliente Juridico");
        System.out.println("3 - Consultar Cliente");
        System.out.println("4 - Remover Cliente");
        System.out.println("5 - Depositar");
        System.out.println("6 - Sacar");
        System.out.println("7 - Transferir");
        System.out.println("8 - Somar todos os saldos dos Clientes");
        System.out.println("0 - Sair\n\n");
    }
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner input = new Scanner(System.in);

        printMenu();

        int opcao = input.nextInt();

        while (opcao != 0) {
            if (opcao == 1) {
                banco.criarClientesFisico();

            }else if (opcao == 2) {
                banco.criarClientesJuridico();

            }else if (opcao == 3) {
                System.out.println("\nDigite o identificador do cliente:\n");
                int id = input.nextInt();

                banco.verificarSeExisteCliente(id);

            }else if (opcao == 4) {
                System.out.println("\nDigite o identificador: ");
                int identificador = input.nextInt();

                banco.removerCliente(identificador);

            }else if (opcao == 5) {
                System.out.println("\nDigite o identificador: ");
                int id = input.nextInt();

            if(banco.verificarSeExisteCliente(id)) {
                System.out.println("\nDigite o valor a ser depositado: ");
                float valor = input.nextFloat();
                banco.getClientes().get(id).depositar(valor);
                } else {
                    System.out.println("\nNao foi possivel concluir a operacao\n");
                }



            }else if (opcao == 6) {
                System.out.println("\nDigite o identificador: ");
                int id = input.nextInt();

                if(banco.verificarSeExisteCliente(id)) {
                System.out.println("\nDigite o valor a ser sacado: ");
                float valor = input.nextFloat();
                banco.getClientes().get(id).sacar(valor);
                } else {
                    System.out.println("\nNao foi possivel concluir a operacao\n");
                }



            }else if (opcao == 7) {
                System.out.println("\nDigite o id da conta origem: ");
                int idOrigem = input.nextInt();
                System.out.println("\nDigite o id da conta destino: ");
                int idDestino = input.nextInt();
                System.out.println("\nDigite o valor a ser transferido: ");
                float valor = input.nextFloat();

                if(banco.verificarSeExisteCliente(idOrigem) && banco.verificarSeExisteCliente(idDestino)) {
                    banco.getClientes().get(idOrigem).TransferirSaldo(
                        banco.getClientes().get(idOrigem),
                        banco.getClientes().get(idDestino),
                        valor);
                } else {
                    System.out.println("\nNao foi possivel concluir a operacao\n");
                }

            } else if (opcao == 8) {

                List<Cliente> clientes = banco.getClientes();

                banco.somarTodosSaldos(clientes);
            }

            printMenu();
            opcao = input.nextInt();
        }


    }

}

