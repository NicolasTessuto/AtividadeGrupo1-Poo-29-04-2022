public class Main {
    public static void main(String[] args) {

        Cachorro cachorroExemplo = new Cachorro("Canis lupus familiaris",
                "Cinza",
                4,
                234,
                "au au au",
                "cachorro",
                "Golden"
        );

        Tartaruga tartarugaExemplo = new Tartaruga("Testudines",
                "Casco verde",
                10,
                129,
                "Tartaruga",
                true
        );

        cachorroExemplo.fazerBarulho(); //O METODO FAZER BARULHO FOI TRATADO PELA CLASSE CACHORRO,
        // JÁ QUE O ANIMAL FAZ BARULHO

        tartarugaExemplo.fazerBarulho(); //O METODO FAZER BARULHO NAO FOI MODIFICADO PELA CLASSE TARTARUGA,
        // POR ISSO A CLASSE NAO EXIBE NADA NA TELA
        tartarugaExemplo.comer(); //Metodo padrao de todos as classes, (definida na classe pai) filhos apenas herdam o metodo e o executam da mesma maneira)
        cachorroExemplo.comer();




    }
}