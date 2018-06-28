import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.ListIterator;

interface ActionListener{
	void actionPerformed();
}

class GUI implements ActionListener{
	
	Button btn;
	
	GUI(){
		btn = new Button();
		btn.addActionListener(this);
		btn.onClick();
	}

	public void actionPerformed() {
		System.out.println("==Action Performed Executed==");
	}
	
}

class Button{
	
	ActionListener aRef;
	
	void addActionListener(ActionListener aRef){
		this.aRef = aRef;
	}
	
	void onClick(){
		aRef.actionPerformed();
	}
}

public class FinalQuery {

	public static void main(String[] args) {
		
		GUI gui = new GUI();
		
		int i = 10; // Primitive Type
		Integer iRef = new Integer(i); // Reference Type i.e. an Object
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Jennie");
		list.add("Jim");
		list.add("Jack");
		list.add("Joe");
		
		ListIterator<String> listItr = list.listIterator();
		while(listItr.hasNext()){
			String name = listItr.next();
			System.out.println(name);
		}
		System.out.println("=======");
		while(listItr.hasPrevious()){
			String name = listItr.previous();
			System.out.println(name);
		}
		
		System.out.println("=======");
		
		Enumeration<String> enm = Collections.enumeration(list);
		while(enm.hasMoreElements()){
			String name = enm.nextElement();
			System.out.println(name);
		}

	}

}
