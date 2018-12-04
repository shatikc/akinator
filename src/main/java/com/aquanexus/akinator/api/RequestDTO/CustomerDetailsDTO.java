package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailsDTO {
    private String inn;
    private String company;
    private String contactFullName;
    private String contactPosition;
    private String phoneNumber;
    private String email;
    private String customerStatus;
    private String customerType;
    private String orderSource;
    private String region;
    private String locality;
    private String comment;
}
