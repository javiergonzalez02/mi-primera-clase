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

    public void cargarBateria(int porcentajeCarga) {
        porcentajeBateria += porcentajeCarga;
    }

    public void cambiarEstadoGarantia() {
        if (incluyeGarantia) {
            incluyeGarantia = false;
        } else {
            incluyeGarantia = true;
        }
    }

    public String getObjState() {
        String garantia;
        if (incluyeGarantia) {
            garantia = "si";
        } else {
            garantia = "no";
        }

        return "Marca: " + marca + " | Porcentaje de batería: " + porcentajeBateria + "% | Incluye garantía: " + garantia;
    }

    public void printObjState() {
        String garantia;
        if (incluyeGarantia) {
            garantia = "si";
        } else {
            garantia = "no";
        }
        System.out.println("Marca: " + marca + " | Porcentaje de batería: " + porcentajeBateria + "% | Incluye garantía: " + garantia);
    }
}