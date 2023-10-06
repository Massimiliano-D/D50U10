package ProgettoSettimanale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ElementoMultimediale[] array = new ElementoMultimediale[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
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
                    Immagine img = new Immagine(titoloImg);
                    array[i] = img;
                    System.out.println("Immagine salvata");
                    break;
                case 2:
                    System.out.println("Titolo Video");
                    String titoloVid = sc.next();
                    System.out.println("Durata video");
                    int durataVid = sc.nextInt();
                    Video vid = new Video(titoloVid, durataVid);
                    array[i] = vid;
                    System.out.println("Video salvato");
                    break;
                case 3:
                    System.out.println("Titolo Video");
                    String titoloAud = sc.next();
                    System.out.println("Durata video");
                    int durataAud = sc.nextInt();
                    RegistrazioneAudio aud = new RegistrazioneAudio(titoloAud, durataAud);
                    array[i] = aud;
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


    }
}
