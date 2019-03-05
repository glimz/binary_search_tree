import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		        int counter = 0;
		         String[] text =  TextReader.readFromFile("/Users/binetafismer/Desktop/speech.txt", " ");
		         HashTable<String, Integer> hashtable = new HashTable(500);
		       
		        for (int i =1; i<text.length;i++){
		            if (hashtable.isColliding(text[i])){
		                counter++;
		            }
		            hashtable.put(text[i], i);
		        }
		       System.out.println("Colliding Counter: "+counter);
		    }
		    
		
	/*
		// TODO Auto-generated method stub
		TextReader reader = new TextReader();
		String[] speech = TextReader.readFromFile("/Users/binetafismer/Desktop/speech.txt", " ");
		BST<String, List<Integer>> binarySearch = new BST();
		HashTable table = new HashTable(100);

		int counter = 0;
		for (int i = 0; i < speech.length; i++) {
			List<Integer> index = new ArrayList<>();

			if (binarySearch.get(speech[i]) != null) {
				index = binarySearch.get(speech[i]);
			}

			index.add(i + 1);
			binarySearch.put(speech[i], index);
			
		}

		System.out.println("Cicero's first speech against Catiline - Index \n");
		for (String keys : binarySearch) {
			System.out.println(keys + " : " +binarySearch.get(keys));
			counter++;
			
		}

		System.out.println("\nNumbers of Keys: " + counter);
		System.out.println("\nDepth: " + binarySearch.depth());
		for (int i = 1; i < 4; i++) {

		
		}
		*/
	}
