import java.util.ArrayList;
import java.util.Iterator;

public class LearningArrayLists {

	// 1
	public static ArrayList createArrayList() {

		ArrayList<String> s = new ArrayList<String>();

		return s;

	}

	// 2
	public static void addToArrayList(ArrayList testList, String string) {

		testList.add(string);

	}

	// 3
	public static Object getNumberOfItems(ArrayList testList) {

		int s = testList.size();

		return s;
	}

	// 4
	public static String getItem(ArrayList testList, int i) {

		String s = (String) testList.get(i);

		return s;
	}

	// 5
	public static String iterateOver(ArrayList testList) {

		String s = "";
		
		for (int i = 0; i < testList.size(); i++) {

			String g = (String) testList.get(i);
			
			s+=g;
			
			System.out.println(s);

		}

		return s;
	}

	
	//6
	public static Object findItemOnList(ArrayList testList, String string) {
		
		int index = testList.indexOf(string);
		
		return index;
	}
	
	//7
	public static Object replaceItem(ArrayList testList, int i, String string){
		
		Object replace = testList.set(i, string);
		
		return replace;
	}
	
	//8 
	public static void insertItem(ArrayList testList, int i, String string){
		
		testList.add(i, string);
	
	}
	
	//10 
	public static ArrayList<Integer> createTypedArrayList(){
		
		ArrayList<Integer> createTypedArrayList = new ArrayList<Integer>();
		
		return createTypedArrayList;
	
	}
	
	//11
	public static Integer addAllInteger(ArrayList<Integer> testList){
		
		int add = testList.get(0) + testList.get(1) + testList.get(2); 
		
		return add ; 
	}
	
	//12
	public static String addAllString(ArrayList<String>testList){
		
		ArrayList<String> createStringTypedArrayList = new ArrayList<String>();
		
		String s = "";
		
		for (int i = 0; i < testList.size(); i++) {

			String g = testList.get(i);
			
			s+=g;
			
			System.out.println(s);

		}

		return s;
	}

}
