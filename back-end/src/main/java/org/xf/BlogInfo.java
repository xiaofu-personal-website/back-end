package org.xf;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by apple on 18/4/27.
 */
@Entity
@Table(name="blog_infos")
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class BlogInfo {
    @Id
    @Column(name = "blog_id")
    private int blogId;
    @Column(name = "title")
    private String title;
    @Column(name = "upload_date")
    private String uploadDate;
    @Column(name = "category")
    private String category;
    @Column(name = "content")
    private String content;

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
