public class Bilhete extends Main{
    private int numero;
    private int assento;
    private String passageiro;
    private String horario;
    private String situacao;
    
    public Bilhete(int numero, int assento, String passageiro, String horario, String situacao) {
        this.numero = numero;
        this.assento = assento;
        this.passageiro = passageiro;
        this.horario = horario;
        this.situacao = situacao;
    }
    
    public void reservar(Passageiro passageiro) {
        Bilhete bilhete = new Bilhete(1234, 1, "maria", "10:00", "Reservado");
        System.out.println(bilhete);
    }
    
    public void comprar() {
        System.out.println("Por favor, finalize a compra do bilhete:");
        
    }
    
    
    public void cancelarReserva() {
        this.situacao = "Cancelado";
        System.out.println("A reserva do bilhete " + this.numero + " foi cancelada com sucesso.");
    }

    
    public void checkin(Bagagem bagagem) {
        System.out.println("O check-in do passageiro " + this.passageiro + " foi realizado com sucesso.");
        System.out.println("O número do assento é " + this.assento + ".");
        System.out.println("A bagagem " + bagagem.getDescricao() + " foi despachada com sucesso.");
    }
    
    // getters e setters
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAssento() {
        return assento;
    }
    
    public void setAssento(int assento) {
        this.assento = assento;
    }
    
    public String getPassageiro() {
        return passageiro;
    }
    
    public void setPassageiro(String passageiro) {
        this.passageiro = passageiro;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String getSituacao() {
        return situacao;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
