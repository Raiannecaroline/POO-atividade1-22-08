public class Professor extends Funcionario{

    private String formacao;
    private String listaDisciplinas;

    public Professor(String nome, String rg, String cpf, String dataNascimento, String dataAdmissao, double salario, String formacao) {
        super(nome, rg, cpf, dataNascimento, dataAdmissao, salario);
        this.formacao = formacao;
    }

    public String getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(String listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Formacao: " + formacao);
        System.out.println("Disciplinas: " + listaDisciplinas);
    }
}
