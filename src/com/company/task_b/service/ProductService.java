package com.company.task_b.service;

import com.company.task_b.model.Product;
import com.company.task_b.model.TypeOfProduct;

public interface ProductService {

    Product newProduct(TypeOfProduct enums);
    String deleteProduct();
    Product searchProduct();
}
