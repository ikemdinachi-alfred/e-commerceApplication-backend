package com.alfredtech.ecormerceapplication.service.shoeService;

import com.alfredtech.ecormerceapplication.dto.requests.ShoeRequest;
import com.alfredtech.ecormerceapplication.dto.response.ShoeResponse;
import com.alfredtech.ecormerceapplication.model.Shoe;
import com.alfredtech.ecormerceapplication.repository.shoeRepository.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoeService {

    private ShoeRepository shoeRepository;
    @Autowired
    ShoeRequest shoeRequest;

    public ShoeResponse shoePurchase(ShoeRequest shoeRequest){
        Shoe shoe = new Shoe();
        shoe.setName(shoe.getName());
        shoe.setSize(shoe.getSize());
        shoe.setQuantity(shoe.getQuantity());
        shoe.setColour(shoe.getColour());
//        ShoeRepository repository = new ShoeRepository();
        shoeRepository.save(shoe);
        ShoeResponse shoeResponse = new ShoeResponse();
        shoeResponse.setMessage("purchase successful ");
        return shoeResponse;
    }

}
