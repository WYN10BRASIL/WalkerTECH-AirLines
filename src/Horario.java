import java.util.Date;

public class Horario extends Main{
    private Date dataPartida;
    private Date dataChegada;
    private Date dataVoo;

    public Horario(Date dataPartida, Date dataChegada, Date dataVoo) {
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.dataVoo = dataVoo;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }

    public void mostrarHorario() {
        System.out.println("Data de partida: " + dataPartida);
        System.out.println("Data de chegada: " + dataChegada);
        System.out.println("Data do voo: " + dataVoo);
    }
}
