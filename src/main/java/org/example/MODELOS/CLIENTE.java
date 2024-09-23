package org.example.MODELOS;

public class CLIENTE {
    private String Nombre;

    private Integer ID;

    private Integer Monto_a_gastar;

    private String Licor;

    private String pareja;

    public CLIENTE() {
    }

    public CLIENTE(String nombre, Integer ID, Integer monto_a_gastar, String licor, String pareja) {
        Nombre = nombre;
        this.ID = ID;
        Monto_a_gastar = monto_a_gastar;
        Licor = licor;
        this.pareja = pareja;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getMonto_a_gastar() {
        return Monto_a_gastar;
    }

    public void setMonto_a_gastar(Integer monto_a_gastar) {
        Monto_a_gastar = monto_a_gastar;
    }

    public String getLicor() {
        return Licor;
    }

    public void setLicor(String licor) {
        Licor = licor;
    }

    public String getPareja() {
        return pareja;
    }

    public void setPareja(String pareja) {
        this.pareja = pareja;
    }
}
