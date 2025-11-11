public class CursoDeDesign extends  Curso{
    private String ferramenta;

    public CursoDeDesign(String titulo, String instrutor, int cargaHoraria, double precoPorHora, String ferramente){
        super(titulo, instrutor, cargaHoraria, precoPorHora);
        this.ferramenta = ferramenta;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        if(!(ferramenta.isBlank())){
            this.ferramenta = ferramenta;
            System.out.println("Ferramenta adicionada com sucesso.");
        }
        else{
            System.out.println("Ferramenta não definida.");
        }
    }

   @Override
    public void mostrarDados(){
       super.mostrarDados();
       System.out.println("Ferramenta utilizada: " + this.ferramenta);
    }

    @Override
    public void calcularCusto(){
        double custoTotal = cargaHoraria * precoPorHora;
        if(cargaHoraria<20){
            custoTotal =  custoTotal * 1.05;
            System.out.println("O curso total é: " + custoTotal);
        }
        else{
            System.out.println("O curso total é: " + custoTotal);
        }
    }

    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.println("Ferramenta: " + this.ferramenta);
    }
}
