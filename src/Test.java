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
		RefrigeratedWarehouse<WildPig> rw1 = new RefrigeratedWarehouse<WildPig>(5);
		Table<WildPigRoast> t1 = new Table<WildPigRoast>(20);
		StonePit<ChristmasTree> sp1 = new StonePit<ChristmasTree>(15);
		VillageSquare<OxBarrow> vs1 = new VillageSquare<OxBarrow>(50);
		
		WildPigHunter wph1 = new WildPigHunter("Hunter1", 10, 5, rw1);
		WildPigHunter wph2 = new WildPigHunter("Hunter2", 20, 8, rw1);
		WildPigHunter wph3 = new WildPigHunter("Hunter3", 15, 2, rw1);
		
		Cook ck1 = new Cook("Cook1", 30, rw1, t1);
		
		Woodman wm1 = new Woodman("Woodman1", 10, t1, sp1);
		Woodman wm2 = new Woodman("Woodman2", 45, t1, sp1);
		Woodman wm3 = new Woodman("Woodman3", 30, t1, sp1);
		Woodman wm4 = new Woodman("Woodman4", 35, t1, sp1);
		Woodman wm5 = new Woodman("Woodman5", 20, t1, sp1);
		
		Logistician l1 = new Logistician("Logistician1", 20, sp1, vs1);
		Logistician l2 = new Logistician("Logistician2", 40, sp1, vs1);
		
		Thread th1 = new Thread(wph1);
		Thread th2 = new Thread(wph2);
		Thread th3 = new Thread(wph3);
		Thread th4 = new Thread(ck1);
		Thread th5 = new Thread(wm1);
		Thread th6 = new Thread(wm2);
		Thread th7 = new Thread(wm3);
		Thread th8 = new Thread(wm4);
		Thread th9 = new Thread(wm5);
		Thread th10 = new Thread(l1);
		Thread th11 = new Thread(l2);
		
		th1.start();
		th2.start();
		th1.interrupt();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
		th11.start();
	}

}
