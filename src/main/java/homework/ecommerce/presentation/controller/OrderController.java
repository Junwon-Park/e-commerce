package homework.ecommerce.presentation.controller;

import homework.ecommerce.presentation.dto.order.request.OrderRequest;
import homework.ecommerce.presentation.dto.order.response.OrderResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {
    @PostMapping
    public @ResponseBody OrderResponse order(
            @RequestBody OrderRequest request
    ) {
        return null;
    }
}
