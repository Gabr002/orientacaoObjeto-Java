import Interface.Controlador;
import Classes.ControleRemoto;

public class App{
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
