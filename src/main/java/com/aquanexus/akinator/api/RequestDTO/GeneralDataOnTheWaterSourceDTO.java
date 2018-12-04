package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GeneralDataOnTheWaterSourceDTO {

    private String region;
    private String locality;
    private WaterSupplySourceDTO waterSupplySource;
}
