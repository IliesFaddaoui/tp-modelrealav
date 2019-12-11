package com.esipe.clemsilies.tpmodrealav.model;

import com.esipe.clemsilies.tpmodrealav.dto.DocumentDto;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Id;
import javax.persistence.Transient;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@org.springframework.data.mongodb.core.mapping.Document
public class Document {
    @Id
    private String documentId;
    @CreatedDate
    private String created;
    @LastModifiedDate
    private String updated;
    private String title;
    @NotNull
    private String creator;
    @NotNull
    private String editor;
    @NotNull
    private String body;
    @Transient
    private String etag;
    /**
     * @param documentId
     * @param created
     * @param updated
     * @param title
     * @param creator
     * @param editor
     * @param body
     */
    @PersistenceConstructor
    public Document(String documentId, String created, String updated, String title, String creator, String editor, String body) {
        this.documentId = documentId;
        this.created = created;
        this.updated = updated;
        this.title = title;
        this.creator = creator;
        this.editor = editor;
        this.body = body;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public DocumentDto toDto() {
        DocumentDto documentDto = new DocumentDto(this.documentId,this.created,this.updated,this.title,this.creator,this.editor, this.body);
        return documentDto;
    }
}
