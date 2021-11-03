package view;

import controller.PratoController;
import model.Prato;

public class Main {
    public static void main(String[] args) {
        PratoController pc = new PratoController();

        Prato p1 = new Prato();
        //herdado de base model
        p1.id = 1;
        p1.nome = "Vatapá";
        p1.tipo = "Regional";
        p1.valor = 25.90;
        // uso de CREATE
        pc.adicionar(p1);
        System.out.println("== ADICAO DO PRATO 1 ==");
        exibirDados(pc);
        
        Prato p2 = new Prato();
        //herdado de base model
        p2.id = 1;
        p2.nome = "Vatapá";
        p2.tipo = "Regional";
        p2.valor = 30.99;
        //não permite a adicao de um id já cadastrado
        System.out.println("== ADICAO DE PRATO DE MESMO ID ==");
        pc.adicionar(p2);
        exibirDados(pc);
        // uso de UPDATE
        System.out.println("== ATUALIZACAO DO PRATO DE ID 1 ==");
        pc.atualizar(p2);
        exibirDados(pc);

        Prato p3 = new Prato();
        p3.id =2;
        p3.nome="Maniçoba";
        p3.tipo = "Regional";
        p3.valor = 69.90;
        System.out.println("== ADICAO DE UM PRATO ID 2 ==");
        pc.adicionar(p3);
        exibirDados(pc);

        //uso de DELETE
        System.out.println("== DELECAO DE PRATO DE ID 1 ==");
        pc.excluir(p2);
        exibirDados(pc);

        System.out.println("USO DO LEITOR DE ARQUIVOS");
        Reader leitor = new Reader();
        leitor.ler();
    }


    private static void exibirDados(PratoController pc){
        Writer escritor = new Writer();

        // uso do READ
        for (Prato p : pc.listar()) {
            System.out.println(p);
            System.out.println();
            System.out.println("-----");
            System.out.println();
            
            // escreve no arquivo externo
            escritor.escrever(p);
        }
    }
}
