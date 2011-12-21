/**
 * Testclass
 * 
 * @author Gruppe222
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// testcase 1
		System.out.println("----------Testcase 1----------");
		
		RefrigeratedWarehouse<WildPig> rw1 = new RefrigeratedWarehouse<WildPig>(5);
		Table<WildPigRoast> t1 = new Table<WildPigRoast>(20);
		StonePit<ChristmasTree> sp1 = new StonePit<ChristmasTree>(15);
		VillageSquare<OxBarrow> vs1 = new VillageSquare<OxBarrow>(50);
		
		WildPigHunter wph1 = new WildPigHunter("Hunter1", 10, 5, rw1);
		WildPigHunter wph2 = new WildPigHunter("Hunter2", 20, 8, rw1);
		
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
		Thread th3 = new Thread(ck1);
		Thread th4 = new Thread(wm1);
		Thread th5 = new Thread(wm2);
		Thread th6 = new Thread(wm3);
		Thread th7 = new Thread(wm4);
		Thread th8 = new Thread(wm5);
		Thread th9 = new Thread(l1);
		Thread th10 = new Thread(l2);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
	
		
		// wait until all threads have exited 
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
			th6.join();
			th7.join();
			th8.join();
			th9.join();
			th10.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// then print all variables
		//TODO
		
		
		// Unternehmens auflšsung
		// interrupt all
		
		th1.interrupt();
		th2.interrupt();
		th3.interrupt();
		th4.interrupt();
		th5.interrupt();
		th6.interrupt();
		th7.interrupt();
		th8.interrupt();
		th9.interrupt();
		th10.interrupt();
		
		// testcase 2
		System.out.println("----------Testcase 2----------");
		
		rw1 = new RefrigeratedWarehouse<WildPig>(10);
		t1 = new Table<WildPigRoast>(8);
		sp1 = new StonePit<ChristmasTree>(10);
		vs1 = new VillageSquare<OxBarrow>(50);
		
		wph1 = new WildPigHunter("Hunter1", 5, 5, rw1);
		wph2 = new WildPigHunter("Hunter2", 15, 8, rw1);
		
		ck1 = new Cook("Cook1", 40, rw1, t1);
		
		wm1 = new Woodman("Woodman1", 10, t1, sp1);
		wm2 = new Woodman("Woodman2", 15, t1, sp1);
		wm3 = new Woodman("Woodman3", 10, t1, sp1);
		wm4 = new Woodman("Woodman4", 25, t1, sp1);
		wm5 = new Woodman("Woodman5", 10, t1, sp1);
		
		l1 = new Logistician("Logistician1", 10, sp1, vs1);
		l2 = new Logistician("Logistician2", 25, sp1, vs1);
		
		th1 = new Thread(wph1);
		th2 = new Thread(wph2);
		th3 = new Thread(ck1);
		th4 = new Thread(wm1);
		th5 = new Thread(wm2);
		th6 = new Thread(wm3);
		th7 = new Thread(wm4);
		th8 = new Thread(wm5);
		th9 = new Thread(l1);
		th10 = new Thread(l2);
		
		// testcase 1
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
	
		
		// wait until all threads have exited 
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
			th6.join();
			th7.join();
			th8.join();
			th9.join();
			th10.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// then print all variables
		//TODO
		
		
		// Unternehmens auflšsung
		// interrupt all
		
		th1.interrupt();
		th2.interrupt();
		th3.interrupt();
		th4.interrupt();
		th5.interrupt();
		th6.interrupt();
		th7.interrupt();
		th8.interrupt();
		th9.interrupt();
		th10.interrupt();
	}

}
