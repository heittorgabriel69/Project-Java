import java.util.Scanner;

public class Banco {
    Scanner scanner = new Scanner(System.in);
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Integer saldo;
    private Boolean status;

    public Banco() {
        saldo = 0;
        status = false;
    }

    //Getters
    public Integer getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public Boolean getStatus() {
        return status;
    }


    //Setters
    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    //Métodos
    public void abrirConta() {
        setStatus(true);
        setTipo(tipo);
        if (tipo == "CC") {
            saldo = 50;
        } else {
            tipo = "CP";
            saldo = 150;
        }

    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Não é Possível Fechar uma Conta Estando Com Saldo!");
        } else {
            if (saldo == 0) {
                System.out.println("Necessita de Saldo!");
            } else {
                this.status = false;
                System.out.println("Conta Fechada Com Sucesso!");
            }
        }
    }

    public void depositar() {
        if (status == false) {
            System.out.println("Abra a Sua Conta Primeiro!");
        } else {
            System.out.println("Digite O Valor Que Deseja Depositar");
            Integer d = scanner.nextInt();
            setSaldo(this.getSaldo() + d);
            System.out.println("DEPOSITO REALIZADO COM SUCESSO");
        }
    }

    public void sacar() {
        if (status == false) {
            System.out.println("Abra Sua Conta Primeiro");
        } else {
            if (saldo <= 0) {
                System.out.println("Sem Valor Disponível Para Saque =(");
                System.out.println("");
                System.out.println("");
            } else {
                System.out.println("Digite o Valor Que Deseja Sacar : ");
                Integer s = scanner.nextInt();
                if (s > saldo){
                    System.out.println("Não Foi Possível Sacar Essa Quantia =(");
                    System.out.println("");
                    System.out.println("");
                }
                else {
                    saldo = saldo - s;
                }
            }
        }
    }

    public void pagarMensal() {
        if (status == false) {
            System.out.println("Abra Sua Conta Primeiro");
        } else {
            if (saldo <= 0) {
                System.out.println("Sem Valor Disponível Para Realizar O Pagamento =(");
            } else {
                if (tipo == "CC") {
                    setSaldo(saldo - 12);
                } else {
                    tipo = "CP";
                    setSaldo(saldo - 20);
                }
                System.out.println("Mensalidade Paga Com Sucesso!");
            }
        }
    }

    public void status() {
        System.out.println("------------------------------------");
        System.out.println("CONTA");
        System.out.println("------------------------------------");
        System.out.println("DONO : " + dono);
        System.out.println("SENHA : " + numConta);
        System.out.println("TIPO : " + tipo);
        System.out.println("SALDO : " + saldo);
        System.out.println("STATUS : CONTA ABERTA");
        System.out.println("------------------------------------");
    }
}





























