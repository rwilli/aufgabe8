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
		RefrigeratedWarehouse<WildPig> rw1 = new RefrigeratedWarehouse<WildPig>(2);
		Table<WildPigRoast> t1 = new Table<WildPigRoast>(20);
		StonePit<ChristmasTree> sp1 = new StonePit<ChristmasTree>(15);
		VillageSquare<OxBarrow> vs1 = new VillageSquare<OxBarrow>(20);
		
		WildPigHunter wph1 = new WildPigHunter("Hunter1", 5, rw1);
		WildPigHunter wph2 = new WildPigHunter("Hunter2", 8, rw1);
		WildPigHunter wph3 = new WildPigHunter("Hunter3", 2, rw1);
		
		Cook ck1 = new Cook("Cook1", rw1, t1);
		
		Woodman wm1 = new Woodman("Woodman1", t1, sp1);
		Woodman wm2 = new Woodman("Woodman2", t1, sp1);
		Woodman wm3 = new Woodman("Woodman3", t1, sp1);
		Woodman wm4 = new Woodman("Woodman4", t1, sp1);
		Woodman wm5 = new Woodman("Woodman5", t1, sp1);
		
		Logistician l1 = new Logistician("Logistician1", sp1, vs1);
		Logistician l2 = new Logistician("Logistician2", sp1, vs1);
		
		Thread td1 = new Thread(wph1);
		Thread td2 = new Thread(wph2);
		Thread td3 = new Thread(wph3);
		Thread td4 = new Thread(ck1);
		Thread td5 = new Thread(wm1);
		Thread td6 = new Thread(wm2);
		Thread td7 = new Thread(wm3);
		Thread td8 = new Thread(wm4);
		Thread td9 = new Thread(wm5);
		Thread td10 = new Thread(l1);
		Thread td11 = new Thread(l2);
		
		td1.start();
	    td2.start();
	    td3.start();
	    td4.start();
	    td5.start();
	    td6.start();
	    td7.start();
	    td8.start();
	    td9.start();
	    td10.start();
	    td11.start();
	    
	    try {
			Thread.sleep(20);
			/*Thread.sleep(100);
			//td2.sleep(5);
			//td3.sleep(10);*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    System.out.println(rw1.lstProducts.size());
	    System.out.println(t1.lstProducts.size());
	    System.out.println(sp1.lstProducts.size());
	    System.out.println(vs1.lstProducts.size());
	}

}
