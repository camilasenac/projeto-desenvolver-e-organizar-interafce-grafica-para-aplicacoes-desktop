package projeto_1.model;

public class Funcionario { 
    private String nome;
    private String cpf;
    private String cargo;
    private String salario;
    
    public Funcionario(String nome, String cpf, String cargo, String salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
   
}
