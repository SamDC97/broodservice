package be.cvo.broodservice.service;

import be.cvo.broodservice.domain.BroodEntity;
import be.cvo.broodservice.domain.repository.BroodRepository;
import be.cvo.broodservice.service.dto.Brood;
import be.cvo.broodservice.service.mapper.BroodMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BroodService {

    private BroodRepository broodRepository;
    private BroodMapper broodMapper;

    public BroodService(BroodRepository broodRepository, BroodMapper broodMapper){
        this.broodRepository = broodRepository;
        this.broodMapper = broodMapper;
    }

    public void addBrood(Brood brood){broodRepository.save(broodMapper.toEntity(brood));}

    public List<Brood> getAll(){
        return StreamSupport
                .stream(broodRepository.findAll().spliterator(), false)
                .map( b -> broodMapper.toDTO(b))
                .collect(Collectors.toList());
    }

    public Brood getById(String id){
        Optional<BroodEntity> broodEntityOptional = broodRepository.findById(Integer.parseInt(id));
        if (broodEntityOptional.isPresent()){
            return broodMapper.toDTO(broodEntityOptional.get());
        }
        return null;
    }
}
