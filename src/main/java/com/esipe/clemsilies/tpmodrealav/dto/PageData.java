package com.esipe.clemsilies.tpmodrealav.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;

@Data
@NoArgsConstructor
public class PageData<T> {
    private URI next;
    private int page;
    private int nbElements;
}
