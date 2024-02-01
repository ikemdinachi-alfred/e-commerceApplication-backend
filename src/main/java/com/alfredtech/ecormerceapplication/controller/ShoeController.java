package com.alfredtech.ecormerceapplication.controller;

import com.alfredtech.ecormerceapplication.dto.requests.ShoeRequest;
import com.alfredtech.ecormerceapplication.dto.response.ShoeResponse;
import com.alfredtech.ecormerceapplication.service.shoeService.ShoeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce")
public class ShoeController {

    private ShoeService shoeService;
    @PostMapping("/buyShoe")
    public ShoeResponse purchaseShoe(ShoeRequest shoeRequest){
        return shoeService.shoePurchase(shoeRequest);

    }

}
