package ProgettoSettimanale;

public class Immagine extends ElementoMultimediale implements Luminosita {
    static int luminonsita = 5;

    public Immagine(String _titolo) {
        super(_titolo);
    }

    @Override
    public void alzaLuminosita() {
        if (luminonsita < MAXLUMINOSITA) {
            luminonsita++;
            System.out.println("luminosità:" + luminonsita);
        } else {
            System.out.println("RAGGIUNTA LUMINOSITÀ MASSIMA");
        }
    }

    @Override
    public void abbassaLuminosita() {
        if (luminonsita > MINLUMINOSITA) {
            luminonsita--;
            System.out.println("luminosità:" + luminonsita);
        } else {
            System.out.println("RAGGIUNTA LUMINOSITÀ MINIMA");
        }
    }
}
