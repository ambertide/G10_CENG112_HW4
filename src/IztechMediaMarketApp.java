import java.lang.reflect.Executable;
import java.util.Arrays;

import internals.*;
import tree.*;
import utility.*;

public class IztechMediaMarketApp {

	public static void main(String[] args) {
		CSVParser fileReader = new CSVParser("CENG112_HW4_Media.txt");
		IBinarySearchTree<IMedia> tree = fileReader.getTree();
		UserInput userInput = new UserInput(tree);
/*		IBinarySearchTree<Integer> tree = new NyanSearchTree<Integer>();
		Integer[] cat = {15, 23, 454, 643, 234, 123, 321, 321, 12, 1, 2, 3, 4, 7, 8, 4, 3, 2, 100, 156, 1000, 96, 567, 1321, -54, -345};
		for (Integer entry: cat) {
			tree.addEntry(entry);
		Book book = new Book("Cat", 15, 34, "Ismail Tarator");
		System.out.println(book.mediaType()); *//*		
		IBinarySearchTree<Integer> tree = new NyanSearchTree<Integer>();
		tree.addEntry(12);
		tree.addEntry(10);
		tree.addEntry(14);
		tree.addEntry(9);
		tree.addEntry(11);
		tree.addEntry(13);
		tree.addEntry(15);
		ITreeIterator<Integer> iterator = new NyanTreeIterator<Integer>(tree);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/ 
	}
}

