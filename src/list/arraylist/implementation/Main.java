package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {
		
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);//addLast=arraylist의 element 배열 맨 마지막에 추가
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1, 15);//중간에 추가 방법
		numbers.addFirst(5);//첫번째 index에 추가 방법
		numbers.removedFirst();
		numbers.removedLast();
		
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
		
		System.out.println(numbers.remove(1));
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println(numbers.indexOf(20));
		
		for(int i=0; i<numbers.size(); i++) {
		System.out.println(numbers.get(i));	
		}
		ArrayList.ListIterator li= numbers.listIterator();
		//ListIterator = datatype ,listIterator = method
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());//더이상 가져올 값 없을 때 null return
		while(li.hasNext()) {//반복문의 종료 조건
		System.out.println(li.next());
		}
		while(li.hasPrevious()) {//반복문의 종료 조건
			System.out.println(li.previous());
			}
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.add(35);
			}
			System.out.println(number);
		}
	}

}
