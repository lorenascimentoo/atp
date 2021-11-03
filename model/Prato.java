package model;

public class Prato extends Base{
    public String nome;
    public String tipo;
    public double valor;

    @Override
    public String toString() {
        return super.toString() + "\n== NOME: "+this.nome+"\n== TIPO: "+this.tipo+"\n== VALOR: "+this.valor;
    }
}
