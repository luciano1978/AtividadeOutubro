package etec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import etec.model.Login;
import view.Principal;

public class LoginDAO<T extends Login> implements IDAO<T> {

	private Connection conn;

	public LoginDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(T o) throws Exception {
		// TODO Auto-generated method stub

	}

	public boolean checkLogin(String login, String senha) throws Exception {

		Connection conn = new ConexaoFactory().getMysqlConnection();

		String sql = "SELECT * FROM login WHERE usuario = ? AND senha = ?";
		PreparedStatement stmt = null;
		ResultSet rs = null;

		boolean check = false;

		stmt = conn.prepareStatement(sql);
		stmt.setString(1, login);
		stmt.setString(2, senha);
		rs = stmt.executeQuery();
		if (rs.next()) {
			check = true;
			JOptionPane.showMessageDialog(null, "Bem vindo");
			Principal principal = new Principal();
		} else {
			JOptionPane.showMessageDialog(null, "Usuario ou senha inv�lidos");
		}

		return check;
	}

	@Override
	public void compare() throws Exception {
		Connection conn = new ConexaoFactory().getMysqlConnection();
		String sql = "SELECT * FROM login";
		PreparedStatement stmt = null;
		ResultSet rs = null;

		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();

		while (rs.next()) {

		}

	}
}
