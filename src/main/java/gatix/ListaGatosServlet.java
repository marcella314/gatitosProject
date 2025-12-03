package gatix;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaGatos")
public class ListaGatosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/cats_in_the_cradle");
        File pasta = new File(path);

        String[] arquivos = pasta.list((dir, nome) ->
                nome.endsWith(".jpg") || nome.endsWith(".jpeg") || nome.endsWith(".png")
        );

        resp.setContentType("application/json; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.print("[");
        if (arquivos != null) {
            for (int i = 0; i < arquivos.length; i++) {
                out.print("\"" + arquivos[i] + "\"");
                if (i < arquivos.length - 1) out.print(",");
            }
        }
        out.print("]");
    }
}
