package org.xf;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by apple on 18/4/27.
 */
public interface BlogInfoRepository extends JpaRepository<BlogInfo,String> {
    public BlogInfo findByBlogId(int BlogId);
}