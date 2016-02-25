package charaters.stats;

public class Espadachim extends Principal {
	private int lv2 = 100;
	private int lv3 = 200;
	private String nome;
	private int vida;
	private int forca;
	private int mana;
	private int level;
	private int exp;

	public Espadachim(String nome, int vida, int forca, int mana) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
		this.mana = mana;
		this.level = 1;
		this.exp = 0;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int dano) {
		this.vida = this.vida - dano;
		if (this.vida <= 0) {
			System.out.println("Você perdeu!!");
		} else {
			System.out.println("Sua vida agora é " + this.vida);
		}
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getMana() {
		return mana;
	}

	public String getNome() {
		return nome;
	}

	public int forcadaTerra(int hpdoInimigo) {
		int levelSkill = 2;
		int dano = 50 + (20 * hpdoInimigo / 100);
		dano = isPossible(40, dano, levelSkill);
		return dano;
	}

	public int forcadoUniverso(int hpdoInimigo) {
		int levelSkill = 3;
		int dano = 100 + (35 * hpdoInimigo / 100);
		dano = isPossible(100, dano, levelSkill);
		return dano;
	}

	private int isPossible(int mana, int dano, int levelSkill) {
		if (this.level >= levelSkill) {
			if (this.mana - mana >= 0) {
				return dano;
			}
		}
		System.out.println("Você missa, seu noob! Você não tem level para isso.");
		return 0;

	}

	public int levelup(int exp) {
		int lv = this.level;
		System.out.println("Você tinha: " + this.exp + ", Agora você tem: " + (this.exp + exp));

		if ((this.exp + exp) >= lv2 && (this.exp + exp) < lv3) {
			this.level = 2;
			if (lv != this.level) {
				System.out.println("LEVEL UPPPP!");
			}
		}

		if ((this.exp + exp) >= lv3) {
			this.level = 3;
			if (lv != this.level) {
				System.out.println("LEVEL UPPPP!");
			}
		}

		return this.level;
	}

}
