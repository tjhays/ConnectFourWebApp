package tjhays;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectFourController implements Controller {
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        String userName = request.getParameter("name");
        String result = "";
        if (userName != null)
        {
            result = "Hello, " + userName + ", let's play a game!";
        }

        ModelAndView view = new ModelAndView("connectfour_view");
        view.addObject("greeting", result);
        return view;
   }
}
