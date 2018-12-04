package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WaterAnalizeDTO {

    private int systemNumber;
    private PhysicalParamDTO physicalParameters;
    private ChemicalParamDTO chemicalParameters;
    private InorganicDTO inorganicCompounds;
    private OrganicDTO organicCompounds;
    private MicrobiologicalDTO microbiologicalParameters;

}
