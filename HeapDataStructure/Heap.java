package HeapDataStructure;
import java.util.*;

class Heap<T extends Comparable<T>>{
  private ArrayList<T> list;

  public Heap(){
    list = new ArrayList<>();
  }
  private void swap(int f, int s){
    T temp = list.get(f);
    list.set(f, list.get(s));
    list.set(s, temp);
  }

  private int parent(int i){
    return (i-1)/2;
  }
  private int left(int i){
    return (2*i)+1;
  }
  private int right(int i){
    return (2*i)+2;
  }

  private void insert(T data){
    list.add(data);
    upheap(list.size()-1);
  }

  private void upheap(int i){
    if(i == 0){
      return;
    }
    int p = parent(i);
    if(list.get(i).compareTo(list.get(p)) < 0){
      swap(i, p);
      upheap(p);
    }
  }

  public T remove() throws Exception{
    if(list.isEmpty()){
      throw new Exception("Heap is Empty");
    }
    T temp = list.get(0);
    T last = list.remove(list.size()-1);

    if(!list.isEmpty()){
      list.set(0, last);
      downheap(0);
    }
    return temp;
  }

  private void downheap(int i) {
    int min = i;
    int left = left(i);
    int right = right(i);

    if(left< list.size() && list.get(min).compareTo(list.get(left)) > 0){
      min = left;
    }
    if(right< list.size() && list.get(min).compareTo(list.get(right)) > 0){
      min = right;
    }
    if(min != i){
      swap(i, min);
      downheap(min);
    }
  }


  public ArrayList<T> heapSort() throws Exception{
    ArrayList<T> data = new ArrayList<>();
    while(!list.isEmpty()){
      data.add(this.remove());
    }
    return data;
  }
}