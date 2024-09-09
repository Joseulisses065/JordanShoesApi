package com.github.jordanshopapi.domain.dto.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

import java.util.List;

public class EntityMapper {

    public static final ModelMapper modelMapper = new ModelMapper();

    public static<S,D> D mapToObject(S source, Class<D> destinationClass) {
        return modelMapper.map(source, destinationClass);
    }

    public static <S,D> List<D> mapToList(List<S> source,Class<D> destination){
        return  source.stream().map((s)->{
            return modelMapper.map(s,destination);
        }).toList();

    }
    public static <S,D> Page<D> mapToPage(Page<S> source, Class<D> destination){
        return  source.map((s)->{
            return modelMapper.map(s,destination);});
    }
}
