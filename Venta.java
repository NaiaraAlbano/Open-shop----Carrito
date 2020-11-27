
package openshop;

import java.util.Date;

/**
 *
 * @author Naiara
 */
public class Venta {
    Cliente cliente;
    float monto;
    Date fechaVenta;

    public Venta(Cliente cliente, float monto, Date fechaVenta) {
        this.cliente = cliente;
        this.monto = monto;
        this.fechaVenta = fechaVenta;
        
    
    }
    
    
}
