package com.distribuida.principaldao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class LibroDAOPrincipal {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
		
		// create
		Autor autor = autorDAO.findOne(1);
		Categoria categoria = categoriaDAO.findOne(1);
		Libro libro = new Libro();
		libro.setIdLibro(1);
		libro.setTitulo("arbol 2");
		libro.setEditorial("CASA1");
		libro.setNumPaginas(1);
		libro.setEdicion("edicion 3");
		libro.setIdioma("español");
		libro.setFechaPublicacion(new Date());
		libro.setDescripcion("libro de consulta");
		libro.setTipoPasta("pasta dura");
		libro.setIsbn("isbn q");
		libro.setNumEjemplares(1);
		libro.setPortada("Arbol x");
		libro.setPresentacion("segunda");
		libro.setPrecio(7.50);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		libroDAO.add(libro);
		
		libroDAO.findAll().forEach(item -> {
			System.out.println(item.toString());
		});
	}

}
