package ProgettoSettimanale;

public class Video extends ElementoMultimediale implements Volume, Luminosita {
    static int volume = 5;
    static int luminonsita = 5;
    int durata;

    public Video(String _titolo, int _durata) {
        super(_titolo);
        this.durata = _durata;
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

    public void play() {
        String sequenzaEsclamativa = "";
        for (int i = 0; i < volume; i++) {
            sequenzaEsclamativa += "!";
        }
        String sequenzaAsterisco = "";
        for (int i = 0; i < luminonsita; i++) {
            sequenzaAsterisco += "*";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "volume=" + " " + sequenzaEsclamativa + " " + "luminosità=" + " " + sequenzaAsterisco);
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

    @Override
    public void alzaVolume() {
        if (volume < MAXVOLUME) {
            volume++;
            System.out.println("volume:" + volume);
        } else {
            System.out.println("RAGGIUNTO VOLUME MASSIMO");
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > MINVOLUME) {
            volume--;
            System.out.println("volume:" + volume);
        } else {
            System.out.println("RAGGIUNTO VOLUME MINIMO");
        }
    }
}
