package persistencia;

import java.util.ArrayList;
import java.util.List;

import entidade.Cerveja;


public class CervejaDao extends Dao {
	
	
	public boolean cadastrar(Cerveja f)throws Exception{
		boolean success = false;
		try {
			open();// abrir banco de dados
			stmt = conn.prepareStatement("insert into cerveja values(null,?,?,?,?)");
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getTipo());
			stmt.setString(3, f.getPais());
			stmt.setInt(4, f.getNota());
			stmt.execute();
			success = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return success;
	}
	
	public List<Cerveja> buscar(String nome)throws Exception{		
		List<Cerveja> lista = new ArrayList<Cerveja>();
		try {
			open();// abrir banco de dados
			// montar a instrução de seleção
			stmt = conn.prepareStatement("select * from cerveja where nome like ?");
			// substituindo o caracter coringa ? pelo dado nome
			stmt.setString(1, nome);
			// a variável rs recebe o resultado da execução da consulta
			rs = stmt.executeQuery();
			while(rs.next()){
				Cerveja f = new Cerveja(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5));
						
					
				// adicionar o objeto funcionario, com os dados vindo do banco a minha lista
				lista.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return lista;
	}
	
	public Cerveja buscarPorId(int id)throws Exception{
			Cerveja f = null;
			
			try {
				// abrir banco de dados
				open();
				stmt = conn.prepareStatement("select * from cerveja where nome = ?");
				stmt.setInt(1, id);
				
				rs = stmt.executeQuery();
				
				if(rs.next()){
					f =new Cerveja(rs.getInt("idcerveja"),
							rs.getString("nome"),
							rs.getString("tipo"),
							rs.getString("pais"),
							rs.getInt("nota"));
							
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				close();
			}
		
			return f;
	}
	
	public boolean excluir(int id)throws Exception {
		boolean flag = false;
		try {
			open();
			stmt = conn.prepareStatement("delete from cerveja where idcerveja = ?");
			stmt.setInt(1, id);
			stmt.executeUpdate();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return flag;
	}
} 


