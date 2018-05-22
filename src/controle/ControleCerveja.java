package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Cerveja;
import persistencia.CervejaDao;



@WebServlet({ "/ControleCerveja", "/excluir.html", "/buscar.html", "/editar.html","/cadastrar.html" })
public class ControleCerveja extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ControleCerveja() {
        
    }

    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	}

	protected void execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			try {
				// pegar a url que foi executada
				String url = request.getServletPath();
				if (url.equalsIgnoreCase("/cadastrar.html")) {
					cadastrar(request,response);
				} else if (url.equalsIgnoreCase("/buscar.html")) {
					buscar(request,response);
				}else if (url.equalsIgnoreCase("/excluir.html")){
					excluir(request,response);
				}else{
					response.sendRedirect("/");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	protected void cadastrar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			try {
				
				String nome = request.getParameter("nome");
				String nota = request.getParameter("nota");
				String pais = request.getParameter("pais");
				String tipo = request.getParameter("tipo");
				
				
				Cerveja func = new Cerveja();
				func.setNome(nome);
				func.setNota(Integer.parseInt(nota));
				func.setPais(pais);
				func.setTipo(tipo);
				
				new CervejaDao().cadastrar(func);
				
				request.setAttribute("msg","<div class='alert alert-success'>Funcionario Cadastrado!</div>");
				
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("msg", "<div class='alert alert-danger'>Funcionario não Cadastrado!</div>");
			}finally{
				 request.getRequestDispatcher("cadastrar.jsp").forward(request, response);
			}
	}
	protected void buscar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			//mANTER NO CAMPO NOME O VALOR BUSCADO
			request.setAttribute("nome", nome);
			
			CervejaDao fd = new CervejaDao();
			List<Cerveja> lista = fd.buscar(nome+"%");
			if(lista.size() == 0){
				request.setAttribute("msg", "<div class='alert alert-danger'>Nenhuma Cerveja encontrada encontrado</div>");
			}
			request.setAttribute("lista", lista);
		} catch (Exception e) {
			e.printStackTrace();// imprimir a linha do erro
			request.setAttribute("msg", "<div class='alert alert-danger'>Erro na busca</div>");
		}finally{
			request.getRequestDispatcher("buscar.jsp").forward(request, response);
		}
	}
	
	protected void excluir(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			Integer id = new Integer(request.getParameter("id"));
			CervejaDao fd = new CervejaDao();
			if(fd.excluir(id)){
				request.setAttribute("msg", "<div class='alert alert-success'>O produto foi excluido</div>");
			}else{
				request.setAttribute("msg", "<div class='alert alert-danger'>O produto não foi excluido, tente novamente</div>");
			}
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "<div class='alert alert-danger'>Erro na exclusão</div>");
		}finally{
			request.getRequestDispatcher("buscar.jsp").forward(request, response);
		}
	}
}
