package com.aquanexus.akinator.api.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ManualInputItemDTO {

    private String inputBefore;
    private String inputAfter;
}
