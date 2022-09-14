package list.doublylinkedlist.implementation.copy;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList numbers = new DoublyLinkedList();
        numbers.addFirst(30);
        numbers.addFirst(20);
        numbers.addFirst(10);
        numbers.addLast(30);
        numbers.addLast(20);
        numbers.addLast(10);
        System.out.println(numbers.node(5));
        numbers.add(2, 25);        
        System.out.println(numbers.removeFirst());
        System.out.println(numbers.remove(2));
        System.out.println(numbers.removeLast());
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        System.out.println(numbers.indexOf(20));
        DoublyLinkedList.ListIterator i = numbers.listIterator();
//        System.out.println(i.next());
//        while(i.hasNext()) {
//        	System.out.println(i.next()); 	
//        }
        i.add(5);
        i.next();
        i.add(15);
        System.out.println(numbers);
        while(i.hasNext()) {
        	if((int)i.next() == 20) {
        		i.remove();
        	}
        	
        }
        System.out.println(numbers);
    }

}