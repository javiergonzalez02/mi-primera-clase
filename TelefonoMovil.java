public class TelefonoMovil {

    private String marca;
    private int porcentajeBateria;
    private boolean incluyeGarantia;

    public TelefonoMovil(int bateria, String marcaN) {
        porcentajeBateria = bateria;
        marca = marcaN;
        incluyeGarantia = true;
    }

    public String getMarca() {
        return marca;
    }

    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public boolean isIncluyeGarantia() {
        return incluyeGarantia;
    }

    public void setMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    public void cargarBateria(int porcentajeCarga){
        porcentajeBateria += porcentajeCarga;
    }

    public void cambiarEstadoGarantia(){
        if (incluyeGarantia == true){
            incluyeGarantia = false;
        } else {
            incluyeGarantia = true;
        }
    }
}