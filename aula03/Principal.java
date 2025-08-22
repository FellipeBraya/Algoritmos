public class Principal {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>("Alunos");

        lista.imprimeLista();
        lista.addInicio("Fellipe");
        lista.addInicio("Daniel");

        lista.imprimeLista();

        lista.addFinal("Daniel");

        lista.imprimeLista();
    }
}