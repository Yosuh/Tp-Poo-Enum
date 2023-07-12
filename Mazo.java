package tppooenum;

public class Mazo {
    private Cartas[] cartas;

    Mazo() {
        cartas = new Cartas[8];
        cartas[0] = new Cartas(1, Cartas.Palo.TREBOL);
        cartas[1] = new Cartas(2, Cartas.Palo.TREBOL);
        cartas[2] = new Cartas(1, Cartas.Palo.DIAMANTE);
        cartas[3] = new Cartas(2, Cartas.Palo.DIAMANTE);
        cartas[4] = new Cartas(1, Cartas.Palo.PICA);
        cartas[5] = new Cartas(2, Cartas.Palo.PICA);
        cartas[6] = new Cartas(1, Cartas.Palo.CORAZON);
        cartas[7] = new Cartas(2, Cartas.Palo.CORAZON);
    }

    public void imprimir() {
        System.out.println("Lista de cartas");
        for (Cartas carta : cartas)
            carta.imprimir();
    }

    public void sacarUnaCartas() {
        System.out.println("Carta al azar");
        Cartas carta = cartas[(int) (Math.random() * 8)];
        carta.imprimir();
        switch (carta.retornarPalo()) {
        case CORAZON:
            System.out.println("Gana 40 puntos");
            break;
        case DIAMANTE:
            System.out.println("Gana 30 puntos");
            break;
        case PICA:
            System.out.println("Gana 20 puntos");
            break;
        case TREBOL:
            System.out.println("Gana 10 puntos");
            break;
        }

    }

    public static void main(String[] ar) {
        Mazo mazo = new Mazo();
        mazo.imprimir();
        mazo.sacarUnaCartas();
    }

}