package charaters.stats;

import java.util.Scanner;

public class Principal {
	private static String algo;
	private static boolean x = false;
	private static int classe;
	private static String nome;
	public static int op;
	private static boolean win = false;
	private static boolean lose = false;

	static Inimigo i1 = new Inimigo("el lixon", 100, 40, 50, 20, 100);
	static Inimigo i2 = new Inimigo("el cuzon", 300, 100, 100, 50, 200);
	static Inimigo i3 = new Inimigo("el fodon", 500, 200, 300, 150, 0);

	public static void main(String[] args) {

		do {
			System.out.println("Deseja come�ar com espadachim ou mago?");
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			algo = s.nextLine();
			System.out.println("Desejamos que voc� digite um nome para seu personagem!");
			nome = s.nextLine();

			if (algo.equals("espadachim")) {
				x = true;
				classe = 1;
			}

			if (algo.equals("mago")) {
				x = true;
				classe = 2;
			}

		} while (x != true);

		System.out.println(nome + ", voc� � um " + algo + "!!!!");
		if (classe == 1) {
			Espadachim e1 = new Espadachim(nome, 100, 50, 100);
			System.out.println(e1.getNome()
					+ ", para come�ar sua jornada, use a for�a de sua imagina��o e sonhe que voc� esta em um castelo onde todos s�o seus inimigos, voc� precisa matar 3 deles para ganhar o jogo. Cada um que voc� matar, ser� rodado um dado e voc� ficar� um pouco mais forte.");
			System.out.println("Seu primeiro adverserio � " + i1.getNome()
					+ ", um merdinha que se acha e voc� deve acbar com ele.");
			do {
				System.out.println(i1.getNome() + " tem " + i1.getVida() + "de vida, Qual sua a��o?");
				System.out.println(
						"1 para usar Ataque B�sico, 2 para usar For�a da Terra, 3 para usar For�a do universo");

				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);

				op = s.nextInt();

				switch (op) {

				case 1:
					i1.setVida(e1.getForca());
					break;
				case 2:
					i1.setVida(e1.forcadaTerra(i1.getVida()));
					break;
				case 3:
					i1.setVida(e1.forcadoUniverso(i1.getVida()));
					break;
				default:
					System.out.println("Invalido");
				}

				if (i1.getVida() <= 0) {
					System.out.println("Parab�ns !! Voc� ganhou!!");
					e1.levelup(i1.getExp());
					win = true;
				} else {
					System.out.println("Ent�o , " + i1.getNome() + " te ataca!");
					e1.setVida(i1.getForca());
				}
				if (e1.getVida() <= 0) {
					System.exit(0);
				}
			} while (win != true || lose != true);

		}

		if (classe == 2) {
			Mago m1 = new Mago(nome, 100, 100, 100);
			System.out.println(m1.getNome()
					+ ", para come�ar sua jornada, use a for�a da sua imagina��o e sonhe que voc� esta em um campo magico onde todos s�o seus inimigos, voc� precisa matar 3 deles para ganhar o jogo. Cada um que voc� matar, ser� rodado um dado e voc� ficar� um pouco mais forte.");
			;
		}

	}

}
