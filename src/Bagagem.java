public class Bagagem extends Main{
    
    private String tipo;
    private double peso;
    private String bilhete;
    
    // Construtor
    public Bagagem(String tipo, double peso, String bilhete) {
        this.tipo = tipo;
        this.peso = peso;
        this.bilhete = bilhete;
    }
    
    // Métodos getter e setter para cada atributo
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getBilhete() {
        return bilhete;
    }
    
    public void setBilhete(String bilhete) {
        this.bilhete = bilhete;
    }

    public String getDescricao() {
        return null;
    }
}
