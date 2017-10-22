package etec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import etec.model.Disciplina;

public class DisciplinaDAO<T extends Disciplina> implements IDAO<T> {

	private Connection conn;

	public DisciplinaDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(T o) throws Exception {
		String sql = "insert into disciplina (nome) values ('" + ((Disciplina) o).getNome() + "')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.execute();
	}

	@Override
	public void compare() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

	

	

	

}
