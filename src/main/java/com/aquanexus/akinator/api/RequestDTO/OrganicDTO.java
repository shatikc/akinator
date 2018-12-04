package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrganicDTO {

    private ElementSubstanceDTO γ_HCCH_Lindane;
    private ElementSubstanceDTO two2_four4D;
    private ElementSubstanceDTO atrazine;
    private ElementSubstanceDTO benzapyrene;
    private ElementSubstanceDTO bromodichloromethane;
    private ElementSubstanceDTO bromoform;
    private ElementSubstanceDTO ddt;
    private ElementSubstanceDTO dibromochloromethane;
    private ElementSubstanceDTO di2_ethylhexylPhthalate;
    private ElementSubstanceDTO hexachlorobenzene;
    private ElementSubstanceDTO heptachlor;
    private ElementSubstanceDTO oilProducts;
    private ElementSubstanceDTO totalOrganicCarbon;
    private ElementSubstanceDTO polyacrylamide;
    private ElementSubstanceDTO simazin;
    private ElementSubstanceDTO phenolIndex;
    private ElementSubstanceDTO phenolsVolatile;
    private ElementSubstanceDTO formaldehyde;
    private ElementSubstanceDTO chloroform;
    private ElementSubstanceDTO carbonTetrachloride;
    private ArrayList<ManualInputItemDTO> manualInput;
}