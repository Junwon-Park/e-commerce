package homework.ecommerce.presentation.controller;

import homework.ecommerce.presentation.dto.user.request.RechargeBalanceRequest;
import homework.ecommerce.presentation.dto.user.response.BalanceResponse;
import homework.ecommerce.presentation.dto.user.response.RechargeBalanceResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @PostMapping("/{userId}/balance/recharge")
    public @ResponseBody RechargeBalanceResponse rechargeBalance(
            @PathVariable("userId") String userId,
            @RequestBody RechargeBalanceRequest request
    ) {
        return null;
    }

    @GetMapping("/{userId}/balance")
    public @ResponseBody BalanceResponse getBalance(
            @PathVariable("userId") String userId
    ) {
        return null;
    }
}
