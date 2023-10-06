package ProgettoSettimanale;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio bambi = new RegistrazioneAudio("cicco pasticcio", 4);
        Immagine imgagine = new Immagine("prova");
        Video bello = new Video("video Bello", 1);

        System.out.println(bello);
        bello.play();
        bello.abbassaLuminosita();
        bello.alzaVolume();
        bello.play();
    }
}
