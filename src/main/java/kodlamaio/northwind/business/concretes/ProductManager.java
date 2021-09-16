package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstacts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }



    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
