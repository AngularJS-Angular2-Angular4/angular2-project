package com.centurylink.pctl.mod.api.domain.blog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Kucharzyk
 */
@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}
