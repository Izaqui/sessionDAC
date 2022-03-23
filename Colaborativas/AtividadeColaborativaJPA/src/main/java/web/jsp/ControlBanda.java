package web.jsp;

import dominio.Banda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ControlBanda",urlPatterns = {"/controlBanda"})
public class ControlBanda extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        Banda banda = new Banda(nome);
        // executar a lógica de negócio
        banda.getNomeFantasia();
        // redirecionar ou encaminhar uma resposta ao usuário
        encaminharResposta(request,response,banda);


    }

    private void encaminharResposta(HttpServletRequest request, HttpServletResponse response, Banda banda) throws IOException {


        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControlBanda</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nome: " + banda.getNomeFantasia() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
