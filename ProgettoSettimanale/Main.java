package ProgettoSettimanale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ElementoMultimediale[] pippo = new ElementoMultimediale[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < pippo.length; i++) {
            System.out.println("Cosa vuoi vedere?");
            System.out.println("img: 1");
            System.out.println("video: 2");
            System.out.println("audio: 3");
            System.out.println("exit: 0");
            System.out.println(":");
            int tipo = sc.nextInt();
            switch (tipo) {
                case 1:
                    System.out.println("Titolo immagine:");
                    String titoloImg = sc.next();
                    pippo[i] = new Immagine(titoloImg);

                    System.out.println("Immagine salvata");
                    break;
                case 2:
                    System.out.println("Titolo Video");
                    String titoloVid = sc.next();
                    System.out.println("Durata video");
                    int durataVid = sc.nextInt();
                    Video vid = new Video(titoloVid, durataVid);
                    pippo[i] = vid;
                    System.out.println("Video salvato");
                    break;
                case 3:
                    System.out.println("Titolo audio");
                    String titoloAud = sc.next();
                    System.out.println("Durata audio");
                    int durataAud = sc.nextInt();
                    RegistrazioneAudio aud = new RegistrazioneAudio(titoloAud, durataAud);
                    pippo[i] = aud;
                    System.out.println("Audio salvato");
                    break;

                case 0:
                    System.out.println("Sei uscito dal programma!");
                    return;
                default:
                    System.out.println("ERRORE RIPROVA!!");
                    return;
            }
        }

        boolean onOf = true;
        while (onOf) {
            System.out.println("Cosa vuoi riprodurre?");
            for (int i = 0; i < pippo.length; i++) {
                System.out.println(pippo[i].titolo + " " + ":" + (i + 1));
            }
            System.out.println("EXIT: 0");
            System.out.println(":");
            int scelta = sc.nextInt();
            if (scelta == 0) {
                onOf = false;
                System.out.println("Sei uscito dal programma!");
                return;
            }
            scelta -= 1;
            if (pippo[scelta] instanceof Video video) {
                video.play();
                video.alzaVolume();
                video.abbassaLuminosita();
            } else if (pippo[scelta] instanceof Immagine img) {
                img.show();
                img.abbassaLuminosita();
            } else if (pippo[scelta] instanceof RegistrazioneAudio audio) {
                audio.play();
                audio.abbassaVolume();
            }

        }

    }
}
