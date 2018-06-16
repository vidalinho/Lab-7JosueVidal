/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_josuevidal;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Piezas {

    private String nombre;
    private String material;
    private Piezas padre;
    private int tiempo;
    private ArrayList<Piezas> hijas = new ArrayList();

    public Piezas(String nombre, String material, Piezas padre, int tiempo) {
        this.nombre = nombre;
        this.material = material;
        this.padre = padre;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Piezas getPadre() {
        return padre;
    }

    public void setPadre(Piezas padre) {
        this.padre = padre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public ArrayList<Piezas> getHijas() {
        return hijas;
    }

    public void setHijas(ArrayList<Piezas> hijas) {
        this.hijas = hijas;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
