package com.tiny.control;

import com.tiny.model.TestModel;
import com.tiny.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: Tiny
 * Date: 14-1-26
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class TestController {

    @Autowired
    TestService tService;

    public TestService gettService() {
        return tService;
    }

    public void settService(TestService tService) {
        this.tService = tService;
    }

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","Tiny He");

        TestModel t = new TestModel();
        t.setAge(20);
        t.setName("Tiny");
        tService.save(t);

        return "/test/hello";

    }
}
