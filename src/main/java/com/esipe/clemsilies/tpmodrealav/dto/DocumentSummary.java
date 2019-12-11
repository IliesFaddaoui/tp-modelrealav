package com.esipe.clemsilies.tpmodrealav.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DocumentSummary {
    private String documentId;
    private String created;
    private String updated;
    private String title;
}
