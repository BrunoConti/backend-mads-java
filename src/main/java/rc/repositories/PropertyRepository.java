package rc.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rc.entities.property.Property;

@Repository
public interface PropertyRepository extends MongoRepository<Property,String> {
    Property findById(int id);
}
