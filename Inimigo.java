package charaters.stats;

public class Inimigo extends Principal {

	private String nome;
	private int vida;
	private int mana;
	private int forca;
	private int magica;
	private int exp;

	public Inimigo(String nome, int vida, int mana, int forca, int magica, int exp) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.forca = forca;
		this.magica = magica;
		this.exp = exp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getMagica() {
		return magica;
	}

	public void setMagica(int magica) {
		this.magica = magica;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int dano) {
		this.vida = this.vida - dano;
	}

	public int getExp() {
		System.out.println("Exp recebida = " + exp);
		return exp;
	}

}
