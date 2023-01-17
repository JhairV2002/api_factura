package api.factura.factura.Producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired ProductoRepository productoRepository;

    public Producto saveProducto(Producto entityProducto) {
        return productoRepository.save(entityProducto);
    }

    public Producto findProductoById(Long id) {
        return productoRepository.findById(id).orElse(new Producto());
    }

    public void deleteProductoById(Long id) {
        productoRepository.deleteById(id);
    }

    public List<Producto> findAllProductos() {
        return productoRepository.findAll();
    }
    
}
