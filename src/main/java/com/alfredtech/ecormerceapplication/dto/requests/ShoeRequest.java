package com.alfredtech.ecormerceapplication.dto.requests;

import lombok.Data;
import org.hibernate.annotations.Comments;
import org.springframework.stereotype.Component;

@Data
@Component()
public class ShoeRequest {
    private String name;
    private int size;
    private int quantity;
    private String colour;
}
