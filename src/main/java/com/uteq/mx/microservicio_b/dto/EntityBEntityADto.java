package com.uteq.mx.microservicio_b.dto;

import lombok.Data;

@Data
public class EntityBEntityADto {
    private int id;
    private int entityAId;

    public EntityBEntityADto(){}

    public EntityBEntityADto(int id, int entityAid){
        this.id = id;
        this.entityAId = entityAid;
    }

    @Override
    public String toString() {
        return "EntityBEntityADto [id=" + id + ", entityAId=" + entityAId + "]";
    }


}
