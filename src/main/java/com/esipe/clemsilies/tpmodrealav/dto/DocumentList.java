package com.esipe.clemsilies.tpmodrealav.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DocumentList {

    private int page;
    private int nbElement;
    private List<DocumentSummary> data;
}
