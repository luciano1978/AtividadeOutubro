package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	private JMenu menuarquivo = new JMenu("Arquivos");

	private JMenuItem itemdisciplina = new JMenuItem("Disciplina");
	private JMenuItem itemPessoa = new JMenuItem("Pessoa");

	private JMenuBar menubar = new JMenuBar();

	public Principal() {

		super("Cadastros");

		menuarquivo.add(itemdisciplina);
		menuarquivo.add(itemPessoa);

		menubar.add(menuarquivo);

		this.setJMenuBar(menubar);
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal principal = new Principal();

	}*/
}
