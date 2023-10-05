public class Cargo extends Main{
    private String descricao;

    public Cargo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void mostrarCargo() {
        System.out.println("Cargo: " + descricao);
    }
}
