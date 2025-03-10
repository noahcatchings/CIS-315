import com.musicrus.*;
import java.util.*;

public class AxeTester {

	public static void main(String[] args) {
		Guitar cutaway = new Acoustic(2019, "Martin");
		Guitar lesPaul = new Electric(1959, "Gibson");
		Guitar strat = new Electric(1967, "Fender");
		Guitar dreadnought = new Acoustic(1983, "Yamaha");
		Guitar tele = new Electric(2017, "Fender");
		
		List<Guitar> axes = new LinkedList<Guitar>();
		axes.add(tele);
		axes.add(dreadnought);
		axes.add(lesPaul);
		axes.add(strat);
		axes.add(cutaway);
		
		for (Guitar g : axes) {
			System.out.println(g);
		}
	}

}
