package wang.gagalulu.blog;

import org.apache.log4j.Logger;
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

    public static final Logger logger = Logger.getLogger(FirstTest.class);

    @RequestMapping(value="/index" , method = RequestMethod.GET)
    public String testIndex(HttpServletRequest request,HttpServletResponse response, Model model){
        model.addAttribute("name","test");
        request.setAttribute("aaa","123");
        logger.info("这是一次请求");
        return "index";
    }
}
