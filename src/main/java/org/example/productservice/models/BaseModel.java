package org.example.productservice.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
public class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;
    private boolean isDeleted;

}
