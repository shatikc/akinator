package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GeneralDataItemDTO {

    private String systemAssigment;
    private String waterGradeRequired;
    private String subsystemType;
    private String typeOfHeatingSystem;
    private String fuelType;
    private double workingTemperature;
    private double steamOperatingPressure;
    private String economizerMaterial;
    private String heatingGasTemperature;
    private String mode;
}
