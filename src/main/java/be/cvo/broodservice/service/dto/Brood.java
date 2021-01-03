package be.cvo.broodservice.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brood {

    private Integer id;
    private String name;
    private Integer price;
    private String description;
}
