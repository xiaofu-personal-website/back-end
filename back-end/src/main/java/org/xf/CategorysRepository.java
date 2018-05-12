package org.xf;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by apple on 18/4/28.
 */
public interface CategorysRepository extends JpaRepository<Category,String> {
}