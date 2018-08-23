package pl.mloza.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mloza.entities.JsonbEntity;

public interface JsonbRepository extends CrudRepository<JsonbEntity, Long> { }
