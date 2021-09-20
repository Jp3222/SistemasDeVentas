package Controlador;

import Vista.BDProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BDProductosCon implements ActionListener {

    private BDProductos bdProdctos;

    public BDProductosCon(BDProductos bdProdctos) {
        this.bdProdctos = new BDProductos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Agregar":
                String[] info = bdProdctos.info();
                for (int i = 0; i < info.length; i++) {
                    info[i] = clear(info[i]);
                    System.out.println(info[i]);
                }
                
                break;
        }
    }

    public String clear(String txt) {
        return txt.trim().replace(" ", "").toLowerCase();
    }

}
