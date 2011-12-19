/**
 * 
 * @author Gruppe222
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RefrigeratedWarehouse<WildPig> rw1 = new RefrigeratedWarehouse<WildPig>(20);
		Table<WildPigRoast> t1 = new Table<WildPigRoast>(20);
		StonePit<ChristmasTree> sp1 = new StonePit<ChristmasTree>(15);
		VillageSquare<OxBarrow> vs1 = new VillageSquare<OxBarrow>(20);
		
		WildPigHunter wph1 = new WildPigHunter("Hunter1", 5, rw1);
		WildPigHunter wph2 = new WildPigHunter("Hunter2", 8, rw1);
		//WildPigHunter wph3 = new WildPigHunter("Hunter3", 2, rw1);
		
		Cook ck1 = new Cook("Cook1", rw1, t1);
		
		//Woodman wm1 = new Woodman("Woodman1", t1, sp1);
		//Woodman wm2 = new Woodman("Woodman2", t1, sp1);
		//Woodman wm3 = new Woodman("Woodman3", t1, sp1);
		//Woodman wm4 = new Woodman("Woodman4", t1, sp1);
		//Woodman wm5 = new Woodman("Woodman5", t1, sp1);
		
		/*Logistician l1 = new Logistician("Logistician1", sp1, vs1);
		Logistician l2 = new Logistician("Logistician2", sp1, vs1);
		*/
	}

}
