/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_josuevidal;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author josue
 */
public class Hilos extends Thread {
    private JTable tabla;
    ArrayList<Piezas> list;
    tabla t=new tabla();
    Carro c;

    public Hilos(JTable tabla, ArrayList<Piezas> list, Carro c) {
        this.tabla = tabla;
        this.list = list;
        this.c = c;
    }

    public Hilos(Carro c) {
        this.c = c;
    }
    public void listar_todo(ArrayList p, ArrayList m) {
        try {
        
            ArrayList<Piezas> l3 = p;
          
            for (Piezas temp : l3) {
                if (temp.getHijas().isEmpty()) {
                    
                    m.add(temp);
                } else {
                    
                    m.add(temp);
                    listar_todo(temp.getHijas(), m);
                }
            }
        } catch (Exception e) {
        }
    }
    @Override
    public void run() {
        super.run();
        ArrayList<Piezas> p2 = new ArrayList();
        listar_todo(c.getPiezas(), p2);
        Collections.reverse(p2);
        t.setVisible(true);
        for (Piezas pieza : p2) {
            try {
                Thread.sleep(pieza.getTiempo()*1000);
            } catch (Exception e) {
            }
            Object []row={c.getNombre(),pieza.getNombre(),pieza.getTiempo()};
            DefaultTableModel m =(DefaultTableModel)t.jt_carros.getModel();
            m.addRow(row);
            t.jt_carros.setModel(m);
        }
    }
    
}
