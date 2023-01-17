package api.factura.factura.Factura;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FacturaRepository extends CrudRepository<Factura, Long> {

    public List<Factura> findAll();
    
}
