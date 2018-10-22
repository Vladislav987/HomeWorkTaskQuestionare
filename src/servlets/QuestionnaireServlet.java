package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(urlPatterns = "/quest")
public class QuestionnaireServlet extends HttpServlet {
    static final String TEMPLATE = "<html>" +
            "<head><title>Statistic</title></head>" +
            "<body><h2 align=\"center\">%s</h1></body></html>";

    private AtomicInteger count = new AtomicInteger(0);
    private AtomicInteger vegetariansCount = new AtomicInteger(0);
    private AtomicInteger notVegetarianCount = new AtomicInteger(0);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String meat = req.getParameter("meat");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name + " ");
        stringBuilder.append(surname + ". ");
        stringBuilder.append("You`re " + age + " ");
        stringBuilder.append(gender + " ");
        if (meat.contentEquals("yes")) {
            stringBuilder.append(" and you aren`t vegetarian.");
            notVegetarianCount.getAndAdd(1);
        } else {
            stringBuilder.append(" and you are vegetarian");
            vegetariansCount.getAndAdd(1);
        }

        resp.getWriter().write(String.format(TEMPLATE, stringBuilder.toString()));

        resp.getWriter().write(String.format(TEMPLATE,"<br><a href=\"index.jsp\"> <input type=\"button\" value=\"Try again?\"> </a>"));
        count.getAndAdd(1);
        resp.getWriter().write(String.format(TEMPLATE, "Today was " + count + " people"));
        if (vegetariansCount.get() > notVegetarianCount.get()){
            resp.getWriter().write(String.format(TEMPLATE, "Vegetarians were more)))"));
        }else if (vegetariansCount.get() < notVegetarianCount.get()){
            resp.getWriter().write(String.format(TEMPLATE, "Non vegetarians were more)))"));
        }else{
            resp.getWriter().write(String.format(TEMPLATE, "Vegetarians were as much as vegetarian)))"));

        }
        resp.getWriter().write(String.format(TEMPLATE, "<img src=\"foto.png\">"));


    }
}
