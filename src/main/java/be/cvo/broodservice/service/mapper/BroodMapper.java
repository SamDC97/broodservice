package be.cvo.broodservice.service.mapper;

import be.cvo.broodservice.domain.BroodEntity;
import be.cvo.broodservice.service.dto.Brood;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BroodMapper {

    BroodEntity toEntity(Brood brood);
    Brood toDTO(BroodEntity broodEntity);
}
