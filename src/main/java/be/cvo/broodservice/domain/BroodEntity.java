package be.cvo.broodservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BroodEntity {

    @Id
    private Integer id;
    private String name;
    private Integer price;
    private String description;
}
