package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PhysicalParamDTO {

    private ElementSubstanceDTO waterPressure;
    private ElementSubstanceDTO waterTemperature;
    private ElementSubstanceDTO smellAt20C;
    private ElementSubstanceDTO smellAt60C;
    private ElementSubstanceDTO smack;
    private ElementSubstanceDTO suspendedSubstances;
    private ElementSubstanceDTO turbidity;
    private ElementSubstanceDTO chromaticity;
    private ElementSubstanceDTO transparency;
    private ElementSubstanceDTO resistivity;
    private ArrayList<ManualInputItemDTO> manualInput;
    private ElementSubstanceDTO electricalConductivity;
    private ElementSubstanceDTO total_α_radioactivity;
    private ElementSubstanceDTO total_β_radioactivity;
}
