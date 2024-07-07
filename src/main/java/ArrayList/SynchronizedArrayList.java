package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		// 1.Collections.synchronizedList
		
		System.out.println("---------------Collections.synchronizedList----------------");
		List<String> synchronizedList = Collections.synchronizedList(new ArrayList<String>());

		synchronizedList.add("Java");
		synchronizedList.add("python");
		synchronizedList.add("Ruby");

		// For add , remove - we dont need to mention explicitly synchronization

		// To fetch traverse the value from this list -- we have to use explicitly
		// synchronization

		synchronized (synchronizedList) {

			Iterator<String> it = synchronizedList.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		System.out.println("---------------copyOnWriteArrayList----------------");
		
		CopyOnWriteArrayList<String> elist = new CopyOnWriteArrayList<String>();
		
		elist.add("sailesh");
		elist.add("suresh");
		elist.add("ramesh");
		
		//we dont need any explicit synchronization for any operation like add/remove/traverse
		
		Iterator<String> it = elist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}