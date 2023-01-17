package api.factura.factura.Factura;

import java.math.BigDecimal;

import api.factura.factura.Producto.Producto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class FacturaLinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Producto producto;
    private BigDecimal cantidad;
    private BigDecimal precio;
}
