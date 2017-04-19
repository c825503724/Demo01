package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by julie on 4/20/17.
 */
@Controller
@RequestMapping(value = "/index")
public class BaseController {
    @RequestMapping(value = "/1")
    public String base(){
        return "/view/main.jsp";
    }
}
