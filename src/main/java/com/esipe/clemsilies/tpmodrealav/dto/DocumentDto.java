package com.esipe.clemsilies.tpmodrealav.dto;

import com.esipe.clemsilies.tpmodrealav.model.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDto {

    private String documentId;
    private String created;
    private String updated;
    private String title;
    private String creator;
    private String editor;
    private String body;

    public Document toEntity(){
        Document document = new Document(this.documentId,this.created,this.updated,this.title,this.creator,this.editor,this.body);
        return document;
    }
}
