package api.factura.factura.Factura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {
    @Autowired FacturaRepository facturaRepository;

    public Factura saveFactura(Factura entityFactura) {
        return facturaRepository.save(entityFactura);
    }

    public Factura findFacturaById(Long id) {
        return facturaRepository.findById(id).orElse(new Factura());
    }

    public void deleteFacturaById(Long id) {
        facturaRepository.deleteById(id);
    }

    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }
}
