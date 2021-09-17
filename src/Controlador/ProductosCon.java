package Controlador;

import Vista.BDProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductosCon implements ActionListener {

    private BDProductos bdProductos;

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Productos":
                bdProductos.setVisible(true);
                break;
        }
    }

    public void setVistas(BDProductos bdProductos) {
        this.bdProductos = bdProductos;
    }
    
    

}
