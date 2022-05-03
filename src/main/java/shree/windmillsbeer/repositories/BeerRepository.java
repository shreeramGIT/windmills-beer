package shree.windmillsbeer.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import shree.windmillsbeer.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
