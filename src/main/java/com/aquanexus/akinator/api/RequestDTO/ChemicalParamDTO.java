package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChemicalParamDTO {

    private ElementSubstanceDTO hydrogenIndicator;
    private ElementSubstanceDTO totalMineralization;
    private ElementSubstanceDTO totalStiffness;
    private ElementSubstanceDTO carbonateHardness;
    private ElementSubstanceDTO totalAlkalinity;
    private ElementSubstanceDTO pmo;
    private ElementSubstanceDTO bichromateOxidation;
    private ElementSubstanceDTO surfactants;
    private ArrayList<ManualInputItemDTO> manualInput;
}
