package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InputDTOModel implements Serializable {
    @Id
    private CustomerDetailsDTO customerDetails;
    private ArrayList<SystemParamDTO> systemAssigment;
    private ArrayList<GeneralDataItemDTO> generalTechnicalData;
    private GeneralDataOnTheWaterSourceDTO generalDataOnTheWaterSource;
    private ArrayList<WaterAnalizeDTO> waterSourceAnalysis;
}
