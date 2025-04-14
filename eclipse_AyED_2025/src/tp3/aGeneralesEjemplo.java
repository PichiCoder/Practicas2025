package tp3;

import java.util.LinkedList;
import java.util.List;

public class aGeneralesEjemplo {
	public static GeneralTree<String> aGeneralStrings_1 () {
		GeneralTree<String> a1 = new GeneralTree<String>("1");
		List<GeneralTree<String>> children2 = new LinkedList<GeneralTree<String>>();
		children2.add(new GeneralTree<String>("21"));
		children2.add(new GeneralTree<String>("22"));
		children2.add(new GeneralTree<String>("23"));
		GeneralTree<String> a2 = new GeneralTree<String>("2", children2);
		List<GeneralTree<String>> children3 = new LinkedList<GeneralTree<String>>();
		children3.add(new GeneralTree<String>("31"));
		children3.add(new GeneralTree<String>("32"));
		GeneralTree<String> a3 = new GeneralTree<String>("3", children3);
		List<GeneralTree<String>> childen = new LinkedList<GeneralTree<String>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTree<String> a = new GeneralTree<String>("0", childen);
		
		return a;
	}
	
	public static GeneralTree<Integer> aGeneralIntegers_1 () {
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(1);
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(21));
		children2.add(new GeneralTree<Integer>(22));
		children2.add(new GeneralTree<Integer>(23));
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, children2);
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		children3.add(new GeneralTree<Integer>(31));
		children3.add(new GeneralTree<Integer>(32));
		GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);
		List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTree<Integer> a = new GeneralTree<Integer>(0, childen);
		
		return a;
	}
}
