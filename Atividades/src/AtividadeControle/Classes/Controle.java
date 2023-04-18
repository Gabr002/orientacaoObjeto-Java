package Classes;
import Interface.Controlador;

public class Controle implements Controlador {
    @Override
    public void DesligarMudo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void desligar() {
        this.setLigando(false);
        
    }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ligar() {
        this.setLigando(true);
        
    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }
    private int volume;
    private boolean ligando;
    private boolean tocando;
    
    public Controle() {
        this.volume  = 50;
        this.ligando = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isLigando() {
        return ligando;
    }
    public void setLigando(boolean ligando) {
        this.ligando = ligando;
    }
    public boolean isTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos abstratos

    
}
