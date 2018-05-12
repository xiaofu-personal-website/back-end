package org.xf;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by apple on 18/5/12.
 */
// 这个JsonSerialize是不返回属性为null的值
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
@Entity
@Table(name="home")
public class Home {
    @Column(name="big_back_pic_url")
    private String bigBackPicUrl;
    @Column(name="small_back_pic_url")
    private String smallBackPicUrl;
    @Id
    @Column(name="slogan")
    private String slogan;

    public String getBigBackPicUrl() {
        return bigBackPicUrl;
    }

    public void setBigBackPicUrl(String bigBackPicUrl) {
        this.bigBackPicUrl = bigBackPicUrl;
    }

    public String getSmallBackPicUrl() {
        return smallBackPicUrl;
    }

    public void setSmallBackPicUrl(String smallBackPicUrl) {
        this.smallBackPicUrl = smallBackPicUrl;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}