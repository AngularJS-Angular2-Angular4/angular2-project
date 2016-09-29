package com.centurylink.pctl.mod.api.domain.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Kucharzyk
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
