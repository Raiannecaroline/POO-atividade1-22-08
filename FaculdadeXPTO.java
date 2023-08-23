public class FaculdadeXPTO {

    public static void main(String[] args) {

        Professor professor = new Professor("Raiane", "1234567890", "123456789011", "09/09/1999", "23/07/2023", 10000, "Doutorado");

        professor.setCargo("Professora");
        professor.setListaDisciplinas("Física, Quimica, Matemática");
        professor.endereco = "Rua são nunca";
        professor.imprimeDados();
    }

}
