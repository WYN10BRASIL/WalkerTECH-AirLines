public class CompanhiaAerea extends Main{
    private String descricao;
    public CompanhiaAerea(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public <T> T method(T type) {
        if (type instanceof String) {
            System.out.println("A string " + type + " foi passada como parâmetro.");
            } else if (type instanceof Integer) {
            System.out.println("O inteiro " + type + " foi passado como parâmetro.");
            } else {
            System.out.println("O parâmetro passado não é nem uma string nem um inteiro.");
            }
        return type;
    }
}    