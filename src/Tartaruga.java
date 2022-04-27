public class Tartaruga extends Animal {

    private boolean marinha;

    public Tartaruga(String nomeCientifico, String caracteristica, int idade, int codigo, String nomePopular, boolean marinha) {
        super(nomeCientifico, caracteristica, idade, codigo, nomePopular);
        this.marinha = marinha;
    }

    public void fazerBarulho(){}


}
