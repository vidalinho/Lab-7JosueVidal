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
public class Carro {

    private String nombre;
    private ArrayList<Piezas> pieces = new ArrayList();

    public Carro() {
    }

    public Carro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getPiezas() {
        return pieces;
    }

    public void setPiezas(ArrayList piezas) {
        this.pieces = piezas;
    }

    public ArrayList<Piezas> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piezas> pieces) {
        this.pieces = pieces;
    }
    

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
