package Luta;
import Luta.Classe.Lutador;

public class UltraEmojiCombat {
    public static void main (String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8, 14, 2, 3);
        l[2] = new Lutador("Dead code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);

        l[0].apresentar();
    }
}
