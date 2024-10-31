
public class LatihanIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nilai = 19;
		if (nilai >= 80 && nilai <=100){
			System.out.println("Sempurna");
		} else if (nilai >= 60 && nilai < 80 ){
			System.out.println("Bagus Sekali");
		} else if (nilai >= 40 && nilai < 60 ){
			System.out.println("Bagus");
		} else if (nilai >= 20 && nilai < 40 ){
			System.out.println("Jelek");
		} else if (nilai >= 0 && nilai < 20 ){
			System.out.println("Jelek Sekali");
		} else {
			System.out.println("Input bukan angka 0 - 100(tidak sesuai)");
		}
	}

}
