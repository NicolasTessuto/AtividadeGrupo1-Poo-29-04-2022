public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nomeCientifico, String caracteristica, int idade, int codigo, String barulho, String nomePopular, String raca) {
        super(nomeCientifico, caracteristica, idade, codigo, barulho, nomePopular);
        this.raca = raca;
    }

    public void fazerBarulho() {
        System.out.println("au au au au");
    }


}
