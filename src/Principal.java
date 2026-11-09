import javax.swing.JFrame;

public class Principal extends JFrame {

	public static void main(String[] args) {

		//criar uma instância do jogo
		Jogo game = new Jogo();

		//criar a janela do jogo
		JFrame janelaprincipal = new JFrame("Cobrinha");


		//adicionar o jogo na tela
		janelaprincipal.add(game);
		//permitir alterar dimensões na tela de acordo com jogo
		janelaprincipal.pack();
		//limpar as configurações de posicionamento da tela
		janelaprincipal.setLocationRelativeTo(null);
		//encerrar o programa quando clicar no X da janela
		janelaprincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//não deixar o usuário alterar o tamanho da janela
		janelaprincipal.setResizable(false);
		//mostrar a tela
		janelaprincipal.setVisible(true);


		//iniciar a Thread do jogo
		new Thread(game).start();
	}

}
