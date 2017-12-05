package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/infoCookies", name = "InfoCookies")
public class InfoCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();

		PrintWriter writer = resp.getWriter();

		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h2>Informações dos Cookies do Usuário:</h2>");

		if (cookies != null) {
			for (Cookie cookie : cookies) {
				writer.println("Cookie: " + cookie.getName() + "<br>");
				writer.println("Valor: " + cookie.getValue() + "<br>");
				writer.println("Validade: " + cookie.getMaxAge() + "<br>");
				writer.println("-------------------------------------<br>");
			}
		} else {
			writer.println("Nenhum cookie salvo no cliente.");
		}

		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

}
