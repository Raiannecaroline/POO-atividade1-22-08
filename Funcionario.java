
public class Funcionario extends FaculdadeXPTO{

    private static int gerarMatricula = 0;

    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String dataAdmissao;
    private double salario;
    private int matricula;
    private String cargo;
    protected String endereco;

    public Funcionario(String nome, String rg, String cpf, String dataNascimento, String dataAdmissao, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.matricula = gerarMatricula++;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                '}';
    }

    public void imprimeDados() {
        System.out.println("Nome:" + nome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Matriculo " + matricula);
        System.out.println("Cargo: " + cargo);
        System.out.println("Endereço: " + endereco);
    }
}
