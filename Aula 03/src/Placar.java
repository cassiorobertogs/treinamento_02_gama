
public class Placar {
	
	private String time01;
	private String time02;
	private int golsTime01;
	private int golsTime02;

	public Placar(){
		
	}
	public Placar(String time01, String time02){
		this.time01 = time01;
		this.time02 = time02; 
	}
	public Placar(String time01, String time02, int golsTime01, int golsTime02){
		this.time01 = time01;
		this.time02 = time02; 
		this.golsTime01 = golsTime01;
		this.golsTime02 = golsTime02;
	}
	public void mostrPlacar() {
		System.out.println("O jogo de "+time01+" X "+time02+" teve o teve o placar de "+golsTime01+" para o  "+time01+" e "+golsTime02+" para o "+time02);
	}
	
	public String getTime01() {
		return time01;
	}
	public void setTime01(String time01) {
		this.time01 = time01;
	}
	public String getTime02() {
		return time02;
	}
	public void setTime02(String time02) {
		this.time02 = time02;
	}
	public int getGolsTime01() {
		return golsTime01;
	}
	public void setGolsTime01(int golsTime01) {
		this.golsTime01 = golsTime01;
	}
	public int getGolsTime02() {
		return golsTime02;
	}
	public void setGolsTime02(int golsTime02) {
		this.golsTime02 = golsTime02;
	}
	
	
}//fim class
