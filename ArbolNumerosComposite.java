package arbol.UD;

import java.util.Optional;

/**
 * @author raidentrance
 *
 */
public class ArbolNumerosComposite extends ArbolNumeros{
    
   
    private Node left;
    private Node right;
 

    public void add(Integer value) {
        if (value < this.value) {
            if (left != null) {
                left.add(value);
            } else {
                left = new Node(value);
            }
        } else {
            if (right != null) {
                right.add(value);
            } else {
                right = new Node(value);
            }
        }
    }
 
    public Optional<Node> find(Integer value) {
        if (value == this.value) {
            return Optional.of(this);
        } else if (value < this.value) {
            if (this.left != null) {
                return this.left.find(value);
            } else {
                return Optional.empty();
            }
        } else {
            if (this.right != null) {
                return this.right.find(value);
            } else {
                return Optional.empty();
            }
        }
    }
 
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(value);
        if (right != null) {
            right.printInOrder();
        }
    }
 
    public void printPreOrder() {
        System.out.println(value);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }
 
    public void printPosOrder() {
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
        System.out.println(value);
    }
 
    @Override
    public String toString() {
        return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
    }
 
}
