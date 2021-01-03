package be.cvo.broodservice.service.mapper;

import be.cvo.broodservice.domain.BroodEntity;
import be.cvo.broodservice.service.dto.Brood;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

//@Mapper(componentModel = "spring")
@Component
public class BroodMapper {

    public BroodEntity toEntity(Brood brood) {
        return new BroodEntity(brood.getId(), brood.getName(), brood.getPrice(), brood.getDescription());
    }
    public Brood toDTO(BroodEntity broodEntity) {
        return new Brood(broodEntity.getId(), broodEntity.getName(), broodEntity.getPrice(), broodEntity.getDescription());
    }
}
