package com.ecom.app.Service;

import com.ecom.app.Model.Product;
import com.ecom.app.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getProducts() {
       return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageDate(image.getBytes());
        return repo.save(product);
    }

    public Product updateProduct(int id,Product product, MultipartFile image) throws IOException {
        if(product.getId()==id)
        {
            product.setImageName(image.getOriginalFilename());
            product.setImageType(image.getContentType());
            product.setImageDate(image.getBytes());
            return repo.save(product);

        }
        else
        {
            return null;
        }

    }

    public void deleteProduct(int id) {
         repo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return repo.searchProducts(keyword);
    }
}
