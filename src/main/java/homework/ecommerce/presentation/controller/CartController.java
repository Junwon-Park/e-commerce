package homework.ecommerce.presentation.controller;

import homework.ecommerce.presentation.dto.cart.request.CartRequest;
import homework.ecommerce.presentation.dto.cart.request.CreateItemRequest;
import homework.ecommerce.presentation.dto.cart.request.DeleteItemRequest;
import homework.ecommerce.presentation.dto.cart.response.CartResponse;
import homework.ecommerce.presentation.dto.cart.response.CreateItemResponse;
import homework.ecommerce.presentation.dto.cart.response.DeleteItemResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cart")
public class CartController {
    @PostMapping("/items")
    public @ResponseBody CreateItemResponse createItem(
            @RequestBody CreateItemRequest request
    ) {
        return null;
    }

    @DeleteMapping("/items/{productId}")
    public @ResponseBody DeleteItemResponse deleteItem(
            @PathVariable("productId") int productId,
            @RequestBody DeleteItemRequest request
    ) {
        return null;
    }

    @GetMapping
    public @ResponseBody CartResponse getCart(
            @RequestBody CartRequest request
    ) {
        return null;
    }
}
