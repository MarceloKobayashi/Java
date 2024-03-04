public class Compra implements Comparable<Compra> {
    private String nome;
    private double valor;

    public Compra(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra{" + "nome= " + nome  + ", valor= " + valor + '}';
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valor, outraCompra.valor);
    }
}
