package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente criarClientesFisico() {
        System.out.println("\nInsira o id:\n");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        input.nextLine();
        System.out.println("\nInsira o nome completo:\n");
        String nome = input.nextLine();
        System.out.println("\nInsira o tipo de documento:\n");
        String documento = input.nextLine();
        System.out.println("\nInsira o numero do documento:\n");
        String numeroDocumento = input.nextLine();
        Cliente cliente = new PessoaFisico(id, nome, documento, numeroDocumento);

        adicionarCliente(cliente);

        return cliente;
    }

    public Cliente criarClientesJuridico() {
        System.out.println("\nInsira o id:\n");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        input.nextLine();                      //Usa input.nextLine(); para remover os espacos vazios que pode ocorrer de uma forma inespera ao misturar uma entra do tipo nextInt e logo em seguinda nextLine
        System.out.println("\nInsira o tipo de documento:\n");
        String documento = input.nextLine();
        System.out.println("\nInsira o numero do documento:\n");
        String numeroDocumento = input.nextLine();
        System.out.println("\nInsira o nome fantasia:\n");
        String nomeFantasia = input.nextLine();
        Cliente cliente = new PessoaJuridica(id, documento, numeroDocumento, nomeFantasia);

        adicionarCliente(cliente);

        return cliente;
    }

    public boolean verificarSeExisteCliente(int id) {
        for (Cliente cliente : this.clientes) {
            if (id == cliente.getId()) {
                System.out.println(cliente);
                return true;
            }
        }
        System.out.println("\nCliente nao encontrado");
        return false;
    }

    public  void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removerCliente(int id){
        if (this.clientes.removeIf(cliente -> cliente.getId() == id)) {
            System.out.println("\nCliente removido com sucesso!");
        } else {
            System.out.println("\nNao foi possivel concluir a operacao\n");
        }
    }  


    public float somarTodosSaldos(List<Cliente> clientes){
        System.out.println("\nSomando o valor total do saldo dos clientes:\n");

        float totalSaldos = 0f;

        for(int i = 0; i < this.clientes.size(); i ++){
            if(this.clientes.get(i) != null){
                totalSaldos += clientes.get(i).getSaldo();
            }
        }
        System.out.println("\nO saldo total dos clientes e: " + totalSaldos + ".\n");
        return  totalSaldos;
    }

}