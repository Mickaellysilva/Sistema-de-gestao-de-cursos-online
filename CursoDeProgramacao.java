public class CursoDeProgramacao  extends Curso {
    private String linguagem;

    public CursoDeProgramacao(String titulo, String instrutor, int cargaHoraria, double precoPorHora, String linguagem){
        super(titulo, instrutor, cargaHoraria, precoPorHora);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        if (!(linguagem == null || linguagem.isBlank())) {
            this.linguagem = linguagem;
            System.out.println("Linguagem adicionada com sucesso.");
        } else {
            System.out.println("Não há uma linguagem cadastrada para esse curso.");
        }
    }
        @Override
        public void mostrarDados(){
            super.mostrarDados();
            System.out.println("Linguagem: " + this.linguagem);
        }
        @Override
        public void calcularCusto(){
            double custoTotal = cargaHoraria * precoPorHora;
            if(cargaHoraria>50){
                custoTotal =  custoTotal * 0.90;
                System.out.println("O curso total é: " + custoTotal);
            }
            else{
                System.out.println("O curso total é: " + custoTotal);
            }
        }

        @Override
        public void gerarRelatorio(){
            super.gerarRelatorio();
            System.out.println("Linguagem: " + this.linguagem);
        }
    }

