package se.ecutb.webservicejava.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import se.ecutb.webservicejava.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {



}
