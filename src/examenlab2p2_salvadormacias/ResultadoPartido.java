/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab2p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class ResultadoPartido {

    private String NombreEquipo;
    private String NombreRival;
    private String PuntosEquipo;
    private String PuntosRival;

    public ResultadoPartido(String NombreEquipo, String NombreRival, String PuntosEquipo, String PuntosRival) {
        this.NombreEquipo = NombreEquipo;
        this.NombreRival = NombreRival;
        this.PuntosEquipo = PuntosEquipo;
        this.PuntosRival = PuntosRival;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }

    public String getNombreRival() {
        return NombreRival;
    }

    public void setNombreRival(String NombreRival) {
        this.NombreRival = NombreRival;
    }

    public String getPuntosEquipo() {
        return PuntosEquipo;
    }

    public void setPuntosEquipo(String PuntosEquipo) {
        this.PuntosEquipo = PuntosEquipo;
    }

    public String getPuntosRival() {
        return PuntosRival;
    }

    public void setPuntosRival(String PuntosRival) {
        this.PuntosRival = PuntosRival;
    }

    @Override
    public String toString() {
        return "ResultadoPartido{" + "NombreEquipo=" + NombreEquipo + ", NombreRival=" + NombreRival + ", PuntosEquipo=" + PuntosEquipo + ", PuntosRival=" + PuntosRival + '}';
    }

}
