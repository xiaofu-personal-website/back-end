package org.xf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 18/4/27.
 */
@RestController
@RequestMapping("/blog")
public class BlogInfoController {
    @Autowired
    private BlogInfoRepository blogInfoRepository;

    /**
     * 请求：GET /blog/blogInfos/:start/:count
     * 返回contentType: application/json
     * responseBody: {
     * "blogInfos": [
     *    {
     *      "blogId": 1,
     *      "title": "前端学习（一）",
     *      "uploadDate": "2018-03-12",
     *      "category": "前端",
     *    },
     *    {
     *      "blogId": 2,
     *      "title": "后端学习（一）",
     *      "uploadDate": "2018-02-14",
     *      "category": "后端"
     *    }
     * ]
     * }
     */
    @RequestMapping("/blogInfos/{start}/{count}")
    public List<BlogInfo> getBlogInfos(@PathVariable int start, @PathVariable int count) {
        List<BlogInfo> list = new ArrayList<BlogInfo>();
        list = blogInfoRepository.findAll();
        List<BlogInfo> resultList = new ArrayList<BlogInfo>();
        for (int i = start; i < start + count && i < list.size(); i++) {
            list.get(i).setContent(null);
            resultList.add(list.get(i));
        }
        return resultList;
    }

    /**
     * 请求：GET /blog/:blogId
     * 返回contentType: application/json
     * responseBody: {
     *    "blog": {
     *        "blogId": 1,
     *        "title": "前端学习",
     *        "uploadDate": "2018-03-12",
     *        "content": "..."
     *    }
     * }
     */
    @RequestMapping("/{blogId}")
    public BlogInfo getBlogInfo(@PathVariable int blogId) {
        BlogInfo blogInfo = new BlogInfo();
        blogInfo = blogInfoRepository.findByBlogId(blogId);
        blogInfo.setCategory(null);
        return blogInfo;
    }

}