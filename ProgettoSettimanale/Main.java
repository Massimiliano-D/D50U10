package ProgettoSettimanale;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio bambi = new RegistrazioneAudio("cicco pasticcio", 4);
        System.out.println(RegistrazioneAudio.volume);
        bambi.alzaVolume();
    }
}
