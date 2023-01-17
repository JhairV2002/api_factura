package api.factura.factura.Factura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/factura")
@CrossOrigin({"*"})
public class FacturaController {
    @Autowired FacturaService facturaService;

    @GetMapping("/")
    public List<Factura> findAllFacturas() {
        return facturaService.findAll();
    }

    @GetMapping("/{id}/")
    public Factura findFacturaById(@PathVariable Long id) {
        return facturaService.findFacturaById(id);
    }

    @PostMapping("/")
    public Factura saveFactura(@RequestBody Factura entityFactura) {
        return facturaService.saveFactura(entityFactura);
    }

    @PutMapping("/{id}")
    public Factura updateFactura(@RequestBody Factura entityFactura) {
        return facturaService.saveFactura(entityFactura);
    }

    @DeleteMapping("/{id}")
    public void deleteFacturaById(@PathVariable Long id) {
        facturaService.deleteFacturaById(id);
    }


}
