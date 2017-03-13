package com.agenda.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.agenda.modelo.UsuarioServices;
import com.agenda.modelo.Usuario;
// 2º creamos el servlet

@WebServlet(name = "/registroServlet", urlPatterns = { "/registroServlet.do" })

public class RegistroController extends HttpServlet {
	                                                  //req=son las peticiones de la pagina jsp
	private static final long serialVersionUID = 1L;   //resp=es la respuesta del servlet a esas peticioones

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String nombre=req.getParameter("name");
		String apellido=req.getParameter("ape");
		String edad=req.getParameter("edad");
		String telefono=req.getParameter("tel");
		String ciudad=req.getParameter("city");
		
		//3º creamos la entidad contacto que tendra estos atributos
		
		//si el nombre or el apeliido or..
		if(nombre.equals("") || apellido.equals("") || edad.equals("") || telefono.equals("") || ciudad.equals("")) {
		
			//establesco un atributo llamado usuario
			req.setAttribute("mensaje", "Debe se insertar todos los datos");
			req.getRequestDispatcher("vistas/resultado.jsp").forward(req, resp);
			//el request dispatcher siempre devuelve una vista jsp 
			//por eso cdo lo usamos debemos crear una vista jsp , o usar una ya creada
			
		} else {//si esta todo ok con los parametro procedemos a insertar el usuario
			
			UsuarioServices usuarioservices=new UsuarioServices();
			Usuario usuario=new Usuario(nombre, apellido, edad, telefono, ciudad);
			usuarioservices.INSERT(usuario);
		   // serv.INSERT(new Usuario(nombre, apellido, edad, telefono, ciudad));
			 
			req.setAttribute("mensaje", "Se ha insertado usuario");
			req.getRequestDispatcher("vistas/resultado.jsp").forward(req, resp);
			//direccionamoa a resultado.jsp         . ademas le mandamos el obj mensaje, con el mensaje
		}
	}
	 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException {
		UsuarioServices usuarioservices=new UsuarioServices();
			req.setAttribute("userList", usuarioservices.mostrarUsuarios());
			req.getRequestDispatcher("vistas/user.jsp").forward(req, resp);
	}
	
}
