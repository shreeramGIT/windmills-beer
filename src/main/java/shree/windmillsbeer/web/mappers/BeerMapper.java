package shree.windmillsbeer.web.mappers;

import org.mapstruct.Mapper;
import shree.windmillsbeer.domain.Beer;
import shree.windmillsbeer.web.model.BeerDto;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
