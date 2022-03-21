package jsp;

import dominio.Cliente;
import dominio.Produto;
import org.jetbrains.annotations.NotNull;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException {
        //processar a requisição
        String nome = request.getParameter("nome");
        int id = Integer.parseInt(request.getRequestedSessionId());
        String newDesc = request.getParameter("Descrição");
        ServletInputStream valor = request.getInputStream( );
        String cpf = request.getParameter("CPF");
        Cliente cliente = new Cliente(id,nome,cpf);
        Produto produto = new Produto(id,newDesc,valor);
        // executar a lógica de negócio
        cliente.setNome(nome);
        produto.setId(id);
        // redirecionar ou encaminhar uma resposta ao usuário
        encaminharResposta(request,response,cliente);


    }

    private void encaminharResposta(HttpServletRequest request, HttpServletResponse response, @NotNull Cliente cliente) throws IOException {
        //        request.getSession().setAttribute("nome",nome);
        // encaminhar ao usuário -> nova requisição
//        response.sendRedirect("home.xhtml");
        // encaminhar a requisição
//        request.getRequestDispatcher("home.xhtml").forward(request,response);


        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nome: " + cliente.getNome() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
