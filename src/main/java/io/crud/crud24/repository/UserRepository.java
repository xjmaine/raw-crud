package io.crud.crud24.repository;

import io.crud.crud24.data.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository <User, Long> {
}
