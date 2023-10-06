package ProgettoSettimanale;

public class RegistrazioneAudio extends ElementoMultimediale implements Volume {
    static int volume = 5;
    int durata;

    public RegistrazioneAudio(String _titolo, int _durata) {
        super(_titolo);
        this.durata = _durata;
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

    public void play() {
        String sequenzaEsclamativa = "";
        for (int i = 0; i < volume; i++) {
            sequenzaEsclamativa += "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "volume=" + " " + sequenzaEsclamativa);
        }
    }
}
