package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MicrobiologicalDTO {

    private ElementSubstanceDTO tkb;
    private ElementSubstanceDTO okb;
    private ElementSubstanceDTO gkb;
    private ElementSubstanceDTO totalMicrobialCount37C;
    private ElementSubstanceDTO totalMicrobialCount22C;
    private ElementSubstanceDTO coliphagi;
    private ElementSubstanceDTO sporesOfSulfite_reducingBacteria;
    private ElementSubstanceDTO giardiaIntestinalis;
    private ElementSubstanceDTO pseudomonasAeruginosa;
    private ElementSubstanceDTO staphylococcusAureus;
    private ElementSubstanceDTO escherichiaColi;
    private ElementSubstanceDTO cryptosporidiumOocysts;
    private ElementSubstanceDTO helminthEggs;
    private ElementSubstanceDTO bacterialEndotoxins;
    private ArrayList<ManualInputItemDTO> manualInput;
}
