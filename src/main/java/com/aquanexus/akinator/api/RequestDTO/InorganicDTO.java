package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InorganicDTO {

    private ElementSubstanceDTO dissolvedNitrogen;
    private ElementSubstanceDTO aluminum;
    private ElementSubstanceDTO ammoniaAndAmmoniumIon;
    private ElementSubstanceDTO barium;
    private ElementSubstanceDTO beryllium;
    private ElementSubstanceDTO boron;
    private ElementSubstanceDTO bromides;
    private ElementSubstanceDTO vanadium;
    private ElementSubstanceDTO hydrazine;
    private ElementSubstanceDTO hydrocarbonate;
    private ElementSubstanceDTO carbonDioxide;
    private ElementSubstanceDTO commonIron;
    private ElementSubstanceDTO iodides;
    private ElementSubstanceDTO heavyMetalIons;
    private ElementSubstanceDTO iodine;
    private ElementSubstanceDTO cadmium;
    private ElementSubstanceDTO potassium;
    private ElementSubstanceDTO calcium;
    private ElementSubstanceDTO dissolvedOxygen;
    private ElementSubstanceDTO cobalt;
    private ElementSubstanceDTO silicicAcid;
    private ElementSubstanceDTO silicon;
    private ElementSubstanceDTO siliconOxide;
    private ElementSubstanceDTO lithium;
    private ElementSubstanceDTO magnesium;
    private ElementSubstanceDTO manganese;
    private ElementSubstanceDTO copper;
    private ElementSubstanceDTO molybdenum;
    private ElementSubstanceDTO arsenic;
    private ElementSubstanceDTO sodium;
    private ElementSubstanceDTO nickel;
    private ElementSubstanceDTO nitrates;
    private ElementSubstanceDTO nitrites;
    private ElementSubstanceDTO tin;
    private ElementSubstanceDTO polyphosphates;
    private ElementSubstanceDTO mercury;
    private ElementSubstanceDTO lead;
    private ElementSubstanceDTO selenium;
    private ElementSubstanceDTO silver;
    private ElementSubstanceDTO hydrogenSulphide;
    private ElementSubstanceDTO strontium;
    private ElementSubstanceDTO sulfates;
    private ElementSubstanceDTO antimony;
    private ElementSubstanceDTO titanium;
    private ElementSubstanceDTO fluorides;
    private ElementSubstanceDTO chlorineResidualFree;
    private ElementSubstanceDTO chlorineResidualBound;
    private ElementSubstanceDTO chlorides;
    private ElementSubstanceDTO chromium;
    private ElementSubstanceDTO cyanides;
    private ElementSubstanceDTO zinc;
    private ElementSubstanceDTO potassiumPlusSodiumTotal;
    private ElementSubstanceDTO ozoneResidual;
    private ArrayList<ManualInputItemDTO> manualInput;
}
