package com.dungnv.football.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private String phone;
}
