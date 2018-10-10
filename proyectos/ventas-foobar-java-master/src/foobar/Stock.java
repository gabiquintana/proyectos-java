
package foobar;

public class Stock {
    public final int MAX_EMP = 60;
    public final int MAX_MED = 120;
    public final double PRECIO_EMP = 11;
    public final double PRECIO_MED = 4.5;
    private int cantCarne;
    private int cantPollo;
    private int cantJamon;
    private int cantManteca;
    private int cantGrasa; 
    
    public Stock(int cantCarne, int cantPollo, int cantJamon, int cantManteca, int cantGrasa) {
        setCantCarne(cantCarne);
        setCantPollo(cantPollo);
        setCantJamon(cantJamon);
        setCantManteca(cantManteca);
        setCantGrasa(cantGrasa);
    }

    public void setCantCarne(int cantCarne) {
        if (cantCarne > 0 && cantCarne <= this.MAX_EMP) {
            this.cantCarne = cantCarne;
        }
    }

    public void setCantPollo(int cantPollo) {
        if (cantPollo > 0 && cantPollo <= this.MAX_EMP) {
            this.cantPollo = cantPollo;
        }    
    }

    public void setCantJamon(int cantJamon) {
        if (cantJamon > 0 && cantJamon <= this.MAX_EMP) {
            this.cantJamon = cantJamon;
        }    
    }

    public void setCantManteca(int cantManteca) {
        if (cantManteca > 0 && cantManteca <= this.MAX_MED) {
            this.cantManteca = cantManteca;
        }    
    }

    public void setCantGrasa(int cantGrasa) {
        if (cantGrasa > 0 && cantGrasa <= this.MAX_MED) {
            this.cantGrasa = cantGrasa;
        }    
    }
    
    public int getCantCarne() {
        return cantCarne;
    }

    public int getCantPollo() {
        return cantPollo;
    }

    public int getCantJamon() {
        return cantJamon;
    }

    public int getCantManteca() {
        return cantManteca;
    }

    public int getCantGrasa() {
        return cantGrasa;
    }
}
