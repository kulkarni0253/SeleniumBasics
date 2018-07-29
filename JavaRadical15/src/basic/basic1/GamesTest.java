package basic.basic1;

public class GamesTest {

	public static void main(String[] args) {
		
		InDoorGames ing = new InDoorGames();
		OutDoorGames odg = new OutDoorGames();
		Badminton bad = new Badminton();
		Cricket cric = new Cricket();
		
		Games obj5 = new Cricket();
		obj5.noofplayers();
		((Cricket) obj5).equipmentrequired();
	
		ing.noofplayers();
		odg.noofplayers();
		bad.noofplayers();
		bad.equipmentrequired();
		cric.noofplayers();
		cric.equipmentrequired();
		
		
		

	}

}