package charaters.stats;

public class Mago extends Principal {
	private int lv2 = 100;
	private int lv3 = 200;
	private String nome;
	private int vida;
	private int magica;
	private int mana;
	private int exp;
	private int level;

	public Mago(String nome, int vida, int magica, int mana) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.magica = magica;
		this.mana = mana;
		this.exp = 0;
		this.level = 1;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMagica() {
		return magica;
	}

	public void setMagica(int magica) {
		this.magica = magica;
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

	public int canhaodoMal(int hpdoInimigo) {
		int levelSkill = 1;
		int dano = 50 + (25 * hpdoInimigo / 100);
		dano = isPossible(40, dano, levelSkill);
		return dano;
	}

	public int canhaodeSatanas(int hpdoInimigo) {
		int levelSkill = 2;
		int dano = 80 + (10 * hpdoInimigo / 100);
		dano = isPossible(120, dano, levelSkill);
		return dano;
	}

	public int putariaInfernal(int hpdoInimigo) {
		int levelSkill = 3;
		int dano = 40 + (40 * hpdoInimigo / 100);
		dano = isPossible(300, dano, levelSkill);
		return dano;
	}

	private int isPossible(int mana, int dano, int levelSkill) {
		if (((this.mana - mana) < 0) && this.level < levelSkill) {

			dano = 0;
			System.out.println("Você missa, pois nao tem nivel para usar essa skill. Logo perde sua vez");
		} else {
			this.mana = this.mana - mana;
		}
		return dano;
	}

	public int levelup(int exp) {
		int lv = this.level;
		if ((this.exp + exp) >= lv2 && (this.exp + exp < lv3)) {
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
