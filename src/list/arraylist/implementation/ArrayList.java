package list.arraylist.implementation;
 
public class ArrayList {
    private int size = 0;//size=몇개의 data가 list에 들어있느냐
    private Object[] elementData = new Object[100];
  //object의 datatype의 배열 생성하여 elementData 삽입.배열 값의 수 100
  //list가 수용할 최대 element: 100
    
    public boolean addLast(Object element) {
    	elementData[size] = element;
    	size++;
    	return true;
    }
    public boolean addFirst(Object element){
    	return add(0,element);
    }
    public boolean add(int index, Object element) {
    	for(int i = size - 1 ; i >= index; i--) {
    		elementData[i + 1] = elementData[i];
    	}
    	elementData[index] = element;
    	size++;//해당 arraylist의 수량 값 1증가
    	return true;
    }
    public String toString(){
    	String str = "[";
    	for(int i = 0; i < size; i++) {
    		str += elementData[i];
    	if(i < size-1){
    		str +=",";
    		}	
    	}
    	return str + "]";  
    }  
    public Object remove(int index) {
    	// 엘리먼트를 삭제하기 전에 삭제할 데이터를 removed 변수에 저장합니다.
        Object removed = elementData[index];
        // 삭제된 엘리먼트 다음 엘리먼트부터 마지막 엘리먼트까지 순차적으로 이동해서 빈자리를 채웁니다.
        for (int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        // 크기를 줄입니다.
        size--;
        // 마지막 위치의 엘리먼트를 명시적으로 삭제해줍니다. 
        elementData[size] = null;
        return removed;
    	}
    public Object removedFirst() {
    	return remove(0);
    }
    public Object removedLast() {
    	return remove(size-1);
    }
    public Object get(int index) {
    	return elementData[index];
    }
    public int size() {
    	return size;
    }
    public int indexOf(Object o ) {
    	for(int i = 0; i<size; i++) {
    		if(o.equals(elementData[i])) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public ListIterator listIterator() {
    	return new ListIterator();
    }
    class ListIterator{
    	private int nextIndex = 0;
    	
    	public boolean hasNext() { //반복문의 종료 조건
			return nextIndex < size();
		}
    	
    	public Object next() {
//    		Object returnData =  elementData[nextIndex];
//    		nextIndex++;
//    		return returnData;
    		
    		return elementData[nextIndex++];
    }

		public Object previous() {
			return elementData[--nextIndex];
		}
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		public void add(Object element) {
			ArrayList.this.add(nextIndex++, element);
		}
		public void remove() {
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
    }
   
   }

