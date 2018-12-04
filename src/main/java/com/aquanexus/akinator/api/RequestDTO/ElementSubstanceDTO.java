package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ElementSubstanceDTO {

     private String unit;
     private double valueBefore;
     private double valueAfter;

}
