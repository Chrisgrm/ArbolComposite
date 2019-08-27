

import java.util.Optional;

public class ArbolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArbolNumeros ini = new Node(20);
        ArbolNumeros root = new ArbolNumerosComposite(ini);
        root.add(15);
        root.add(33);
        root.add(10);
        root.add(5);
        root.add(12);
        root.add(18);
        root.add(17);
        root.add(19);
        root.add(25);
        root.add(50);
        root.add(21);
        root.add(27);
        root.add(40);
        root.add(70);
        
 
        Optional<ArbolNumerosComposite> result = root.find(70);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        }
 
        result = root.find(50);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        }
        result = root.find(20);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        } 
        
        System.out.println("Print in order");
        root.printInOrder();
        System.out.println("Print pre order");
        root.printPreOrder();
	}

}
