package etec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import etec.model.Pessoa;

public class PessoaDAO<T extends Pessoa> implements IDAO<T> {

	Connection conn;

	public PessoaDAO(Connection conn) {
		this.conn = conn;
	}

	public void inserir(T o) throws Exception {
		String sql = "insert into pessoa (nome) values ('" + ((Pessoa) o).getNome() + "')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.execute();

	}

	@Override
	public void compare() throws Exception {
		// TODO Auto-generated method stub

	}

}
