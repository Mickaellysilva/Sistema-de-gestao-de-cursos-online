public class Main {
    public static void main(String[] args) {

        CursoDeProgramacao c1 = new CursoDeProgramacao( "Programação em Java", " Mickaelly", 40, 20, "Java");
        CursoDeDesign curso1 = new CursoDeDesign( "Fundamentos do Figma", "Roberta Bezerra", 50, 45, " Figma");
        CursoDeProgramacao c2 = new CursoDeProgramacao("Assembly", "Mickaelly", 56, 90, "Assembly");

        c1.mostrarDados();
        curso1.mostrarDados();
        c2.mostrarDados();

        c1.gerarRelatorio();
        curso1.gerarRelatorio();
        c2.gerarRelatorio();
    }
}
