package homework.ecommerce.presentation.controller;

import homework.ecommerce.presentation.dto.product.response.ProductsResponse;
import homework.ecommerce.presentation.dto.product.response.TopProductsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
    @GetMapping
    public @ResponseBody ProductsResponse getProducts() {
        return null;
    }

    @GetMapping("/top")
    public @ResponseBody TopProductsResponse getTopProducts() {
        return null;
    }
}
