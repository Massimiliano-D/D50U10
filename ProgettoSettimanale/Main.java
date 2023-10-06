package ProgettoSettimanale;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio bambi = new RegistrazioneAudio("cicco pasticcio", 4);
        Immagine imgagine = new Immagine("prova");
        Video bello = new Video("video Bello", 4);
        System.out.println(bambi.volume);
        bambi.alzaVolume();
        bambi.abbassaVolume();
        System.out.println(imgagine.luminonsita);
        imgagine.alzaLuminosita();
        imgagine.abbassaLuminosita();
        System.out.println(bello.luminonsita);
        System.out.println(bello.volume);
        bello.alzaVolume();
        bello.abbassaVolume();
        bello.alzaLuminosita();
        bello.abbassaLuminosita();
    }
}
