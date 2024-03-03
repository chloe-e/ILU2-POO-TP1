package histoire;
import villagegaulois.Etal;
import personnages.Gaulois;

public class ScenarioCasDegrade {
	public static void main(String[] args) {
		Etal etal = new Etal();
		Gaulois bob = new Gaulois("bob",2);
		try{
			etal.acheterProduit(1,bob);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fin du test");
	}
}
