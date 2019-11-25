package main;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class JuegoServlet
 */
@WebServlet("/JuegoServlet")
public class JuegoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JuegoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Juego juego;
		HttpSession session = request.getSession(false); //Devuelve null si no existe sesión
		// Reviso si existe un juego guardado en session y lo obtengo, sino lo creo de cero
		if (session == null || session.getAttribute("juego") == null) {
			GeneradorPalabra gp = new GeneradorPalabra();
			gp.setPalabraFija("MARADONA");
			juego = new Juego(gp);
			HttpSession sesion = request.getSession();
			sesion.setAttribute("juego", juego);			
		} else {
			juego = (Juego) session.getAttribute("juego");
		}
		
		//valida la letra ingresada
		char letraIngresada = request.getParameter("letraIngresada").charAt(0);
		boolean rta = juego.validarLetra(Character.toUpperCase(letraIngresada));
		
		//devuelvo el nuevo estado de la palabra
		//String estadoPalabra = String.valueOf(juego.getEstadoPalabra());
		char[] estadoPalabra = juego.getEstadoPalabra();
		String nuevoEstado="";
		for(char c:estadoPalabra) {
			nuevoEstado=nuevoEstado+c+" ";
		}
		System.out.println("estado palabra: " + nuevoEstado);
		request.setAttribute("estadoPalabra", nuevoEstado);
		
		//muestro vidas restantes
		System.out.println("Vidas " + juego.getVidas());
		request.setAttribute("vidas", juego.getVidas());
		
		//devuelvo las letras erradas
		String stringLetras="";
		ArrayList<Character> letrasNoAcertadas=juego.getLetrasNoAcertadas();
		for (char lna : letrasNoAcertadas) {
			stringLetras=stringLetras+lna+" ";
		}
		System.out.println("letras no acertadas " + stringLetras);
		request.setAttribute("stringLetras", stringLetras);
		
		//controlo si se gano el juego
		boolean fin=juego.juegoGanado();
		if(fin) {
			System.out.println("Juego Ganado");
			session.setAttribute("juego", null);
			request.setAttribute("juegoFinalizado", "Juego Ganado");
		}
		
		//controlo si se perdio el juego
		if(juego.getVidas()==0) {
			System.out.println("Juego Perdido");
			session.setAttribute("juego", null);
			request.setAttribute("juegoFinalizado", "Juego Perdido");
		}
		
		
		request.getRequestDispatcher("/jotaesepe.jsp").forward(request, response);
		
		
	}

}
