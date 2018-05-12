package org.xf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 18/4/12.
 */
public class HomeController {
    @Autowired
    private HomeRepository homeRepository;

    private List<Home> list = new ArrayList<Home>();

    /**
     * 请求：GET /home/bigBackPic
     * 返回contentType: application/json
     * responseBody: { "url": "http://123.123.123.123/big.png" }
     */
    @RequestMapping("bigBackPic")
    @ResponseBody
    public Home getBigBackPic() {
        list = homeRepository.findAll();
        Home home = new Home();
        home.setBigBackPicUrl(list.get(0).getBigBackPicUrl());
        return home;
    }

    /**
     * 请求：GET /home/smallBackPic
     * 返回contentType: application/json
     * responseBody: { "url": "http://123.123.123.123/small.png" }
     */
    @RequestMapping("smallBackPic")
    @ResponseBody
    public Home getSmallBackPic() {
        list = homeRepository.findAll();
        Home home = new Home();
        home.setSmallBackPicUrl(list.get(0).getSmallBackPicUrl());
        return home;
    }

    /**
     * 请求：GET /home/slogan
     * 返回contentType: application/json
     * responseBody: { "slogan": "李为的个人网站" }
     */
    @RequestMapping("slogan")
    @ResponseBody
    public Home getSlogan() {
        list = homeRepository.findAll();
        Home home = new Home();
        home.setSlogan(list.get(0).getSlogan());
        return home;
    }
}
