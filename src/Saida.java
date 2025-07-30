import java.util.Scanner;
public class Saida {
    public static void main(String[] args) {
        Banco b1 = new Banco();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

    //SISTEMA VISUAL
        while (continuar) {
            System.out.println("------------------------------");
            System.out.println("ESCOLHA UMA OPÇÃO");
            System.out.println("------------------------------");
            System.out.println("[1] ABRIR CONTA");
            System.out.println("------------------------------");
            System.out.println("[2] FECHAR CONTA");
            System.out.println("------------------------------");
            System.out.println("[3] DEPOSITAR");
            System.out.println("------------------------------");
            System.out.println("[4] SACAR");
            System.out.println("------------------------------");
            System.out.println("[5] PAGAR MENSALIDADE");
            System.out.println("------------------------------");
            System.out.println("[6] VER CONTA");
            System.out.println("------------------------------");
            System.out.println("[0] SAIR");
            System.out.println("------------------------------");
            int resposta = scanner.nextInt();
            scanner.nextLine();
            switch (resposta) {
                case 1:
                    System.out.println("DIGITE SEU NOME : ");
                    String nome = scanner.nextLine();
                    b1.setDono(nome);
                    System.out.println("CRIE A SENHA DA CONTA : ");
                    int senha = scanner.nextInt();
                    scanner.nextLine();
                    b1.setNumConta(senha);
                    System.out.println("DIGITE O TIPO DE CONTA QUE DESEJA CRIAR :                                                                                           *Opções : CP : Conta Poupança");
                    System.out.println("                                                                                                                                              CC : Conta Corrente");
                    String conta = scanner.nextLine();
                    if (conta.equalsIgnoreCase("CC") || conta.equalsIgnoreCase("CP")) {
                        b1.abrirConta();
                        System.out.println("CONTA CRIADA COM SUCESSO!");
                        System.out.println("");
                        System.out.println("");
                    } else {
                        System.out.println("Opção Inválida");
                        System.out.println("");
                        System.out.println("");
                    }
                    break;

                case 2:
                    if (b1.getStatus() == false){
                        System.out.println("PRIMEIRO CRIE UMA CONTA!!" +
                                "");
                        System.out.println("");
                        System.out.println("");
                    }
                    else { System.out.println("DIGITE A SENHA DA SUA CONTA : ");
                        int s2 = scanner.nextInt();
                        if (s2 == b1.getNumConta()) {
                            System.out.println("DESEJA REALMENTE FECHAR A CONTA? [Y/N]");
                            String rep = scanner.nextLine();
                            if (rep.equalsIgnoreCase("y")) {
                                b1.fecharConta();
                            } else if (rep.equalsIgnoreCase("n")) {
                                System.out.println("Ação cancelada. A conta não foi fechada.");
                            } else {
                                System.out.println("Opção inválida. Ação cancelada.");
                            }
                        }
                        else{
                            System.out.println("SENHA INVÁLIDA");
                            System.out.println("");
                            System.out.println("");
                        }
                    }
                    break;

                case 3:
                    if (b1.getStatus() == false){
                        System.out.println("PRIMEIRO CRIE UMA CONTA!!");
                        System.out.println("");
                        System.out.println("");
                    }
                    else {
                        System.out.println("DIGITE A SENHA DA SUA CONTA : ");
                        int s2 = scanner.nextInt();
                        if (s2 == b1.getNumConta()) {
                            b1.depositar();
                        }
                        else{
                            System.out.println("SENHA INVÁLIDA");
                            System.out.println("");
                            System.out.println("");
                        }
                    }
                    break;

                case 4:
                    if (b1.getStatus() == false){
                        System.out.println("PRIMEIRO CRIE UMA CONTA!!");
                        System.out.println("");
                        System.out.println("");
                    }
                    else {
                        System.out.println("DIGITE A SENHA DA SUA CONTA : ");
                        int s2 = scanner.nextInt();
                        if (s2 == b1.getNumConta()) {
                            b1.sacar();
                        }
                        else{
                            System.out.println("SENHA INVÁLIDA");
                            System.out.println("");
                            System.out.println("");
                        }
                    }
                    break;

                case 5:
                    if (b1.getStatus() == false){
                        System.out.println("PRIMEIRO CRIE UMA CONTA!!");
                        System.out.println("");
                        System.out.println("");
                    }
                    else {
                        System.out.println("DIGITE A SENHA DA SUA CONTA : ");
                        int s2 = scanner.nextInt();
                        if (s2 == b1.getNumConta()) {
                            b1.pagarMensal();
                        }
                        else{
                            System.out.println("SENHA INVÁLIDA");
                            System.out.println("");
                            System.out.println("");
                        }
                    }
                    break;

                case 6:
                    if (b1.getStatus() == false){
                        System.out.println("PRIMEIRO CRIE UMA CONTA!!");
                        System.out.println("");
                        System.out.println("");
                    }
                    else {
                        System.out.println("DIGITE A SENHA DA SUA CONTA : ");
                        int s2 = scanner.nextInt();
                        if (s2 == b1.getNumConta()) {
                            b1.status();
                        }
                        else{
                            System.out.println("SENHA INVÁLIDA");
                            System.out.println("");
                            System.out.println("");
                        }
                    }
                    break;

                case 0:
                    System.out.println("SAINDO...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();

    }
}
