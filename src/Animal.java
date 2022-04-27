public abstract class Animal {
    //CARACTERISTICAS PADRÃO DE TODOS ANIMAIS NO EXEMPLO DO NOSSO SISTEMA vv

    private String nomePopular;
    private String nomeCientifico;
    private String caracteristica;
    private int idade;
    private int codigo;
    private String barulho;

    //CARACTERISTICAS PADRÃO DE TODOS ANIMAIS NO EXEMPLO DO NOSSO SISTEMA ^^

    public void comer(){ //O METODO COMER É UM METODO PADRÃO DE TODOS ANIMAIS (NO NOSSO EXPLO)
        // ELE JA FOI IMPLEMENTADO DIRETO NA CLASSE ABSTRATA.
        System.out.println("Comendo...");
    }

    public abstract void  fazerBarulho();//COMO NEM TODOS ANIMAIS FAZEM BARULHO ESSE MÉTODO ABSTRATO ESTÁ VAZIO
    //E SERÁ TRATADO DIFERENTE POR CADA CLASSE, ANIMAIS QUE NAO FAZEM BARULHO TEM O METODO IMPLEMENTADA,(POR SEREM FILHAS É OBRIGADOTRIO),
    //PORÉM ELE FICA COMO ESTE, VAZIO.

    public Animal(String nomeCientifico, String caracteristica, int idade, int codigo, String nomePopular) {//Temos 2 construtores, 1 para animais que fazem barulho
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.caracteristica = caracteristica;
        this.idade = idade;
        this.codigo = codigo;

    }

    public Animal(String nomeCientifico, String caracteristica, int idade, int codigo, String barulho, String nomePopular) {// E um para animais que nao fazem barulho
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.caracteristica = caracteristica;
        this.idade = idade;
        this.codigo = codigo;
        this.barulho = barulho;

    }
}
