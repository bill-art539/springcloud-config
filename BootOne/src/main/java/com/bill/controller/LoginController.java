package com.bill.controller;


import com.bill.pojo.User;
import com.bill.service.LoginService;
import com.bill.utils.VerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Map;

@Controller
public class LoginController {

//    @Autowired
//    private LoginService loginService ;

    @GetMapping("/verifyCode")
    public void getCode(HttpServletResponse response) throws Exception {
        Map<String, Object> map = VerifyUtil.createImage();
        String code =  VerifyUtil.code;//这里就可以通过类名.属性的方法获取生成的验证码啦
        System.out.println("验证码"+code);
        //将图片输出给浏览器
        BufferedImage image = (BufferedImage) map.get("image");
        response.setContentType("image/png");
        OutputStream os = response.getOutputStream();
        ImageIO.write(image, "png", os);
    }


    @RequestMapping("/login")
    public String login(String username, ModelMap map){
        System.out.println(username);//获取输入的值，用于开发检测
//        User user = loginService.login(username);
//        System.out.println(user);
        map.addAttribute("user", "user");
        return "index";
    }

    @RequestMapping("/")
    public String index() {
        return "login";
    }
}

