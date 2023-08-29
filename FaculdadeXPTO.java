public class FaculdadeXPTO {

    public static void main(String[] args) {

        Professor professor = new Professor("Raiane", "1234567890", "123456789011", "09/09/1999", "23/07/2023", 10000, "Doutorado");

        professor.setCargo("Professora");
        professor.setListaDisciplinas("Física, Quimica, Matemática");
        professor.endereco = "Rua são nunca";
        professor.imprimeDados();
    }

    /**
     *     a. Por que foi possível acessar diretamente o atributo endereço através do
     *     objeto do tipo professor?
     *     R: Porque o endereço estava numa superclasse funcionário, que é filha da classe professor.
     *     E como os atributos podem ser acessados por uma mesma classe, a classe filha faz parte da superclasse.
     *
     *     b. Qual o valor da matrícula do objeto do tipo funcionário e do objeto do tipo
     *     professor?
     *     R: O valor de ambos vai ser o mesmo, pois o atributo vai herdar o valor da superclasse. Vai ser 1.
     *
     *     c. Por que foi possível imprimir os valores armazenados nos atributos
     *     privados na classe Funcionário através do método imprimeDados() da
     *     classe Professor, uma vez que método imprimeDados() foi sobrescrito na
     *     classe filha?
     *     R: Porque fez uma sobrecarga dentro do método trazendo o método da superclasse e
     *     atribuindo normalmente os outros atríbutos da classe filha em imprimirDados().
     *
     */

}
