package wang.gagalulu.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zidong.wang on 2015/12/9.
 */
@Controller
@RequestMapping("/firstTest")
public class FirstTest {

    @RequestMapping(value="/index" , method = RequestMethod.GET)
    public String testIndex(HttpServletRequest request,HttpServletResponse response, Model model){
        model.addAttribute("name","test");
        request.setAttribute("aaa","123");
        return "index";
    }
}
