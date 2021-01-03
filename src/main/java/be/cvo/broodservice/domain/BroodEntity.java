package be.cvo.broodservice.domain;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BroodEntity {

    @Id
    private Integer id;
    private String name;
    private Integer price;
    private String description;
}
