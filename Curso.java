public class Curso {
    protected String titulo;
    protected String instrutor;
    protected int cargaHoraria;
    protected double precoPorHora;

    public Curso(String titulo, String instrutor, int cargaHoraria, double precoPorHora){
        this.titulo = titulo;
        this.instrutor =  titulo;
        this.cargaHoraria = cargaHoraria;
        this.precoPorHora = precoPorHora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(!(titulo==null || titulo.isBlank())){
            this.titulo = titulo;
            System.out.println("Titulo do curso adcionado com sucesso!");
        }
        else{
            System.out.println("Não há um titulo cadastrado nesse curso.");
        }
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        if(!(instrutor==null || instrutor.isBlank())){
            this.instrutor = instrutor;
            System.out.println("O instrutor do curso foi cadastrado com sucesso!");
        }
        else{
            System.out.println("Não há um instrutor cadastrado nesse curso.");
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria>0){
            this.cargaHoraria = cargaHoraria;
            System.out.println("Carga horária adicionada com sucesso!");
        }
        else{
            System.out.println("Não há uma carga horária para esse curso cadastrada");
        }
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        if(precoPorHora>0){
            this.precoPorHora = precoPorHora;
            System.out.println("Preço por hora do curso cadastrada com sucesso.");
        }
        else{
            System.out.println("Não há um preço definido por hora neste curso.");
        }
    }

    public void mostrarDados(){
        System.out.println("Mostrando dados do curso: ");
        System.out.println("Curso: "+ this.titulo);
        System.out.println("Instrutor: " + this.instrutor);
        System.out.println("Carga horária do curso: " +this.cargaHoraria);
        System.out.println("Preço por hora: " + this.precoPorHora);
    }


    public void calcularCusto(){
         double custoTotal = cargaHoraria * precoPorHora;
         System.out.println("Seu curso custará: " + custoTotal);
    }

    public void gerarRelatorio(){
        System.out.println("Relatório do curso: ");
        System.out.println("Curso: "+ this.titulo);
        System.out.println("Instrutor: " + this.instrutor);
        System.out.println("Carga horária do curso: " +this.cargaHoraria);
        System.out.println("Preço por hora: " + this.precoPorHora);
    }
}


