import static java.lang.System.out;
 
import java.util.*;
 
public class SortedIntegerList {
    private final List<Integer> list = new LinkedList<>();
    private final boolean isMultiSet;

    public static void main(String[] args) {
        final SortedIntegerList list = new SortedIntegerList(true);
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        out.println(list);
 
        list.remove(5);
        out.println(list);
 
        for (int i = 0; i < 10; i++) {
            list.remove(i);
        }
        out.println(list);
 
        final SortedIntegerList other = new SortedIntegerList(true);
        for (int i = 10; i < 20; i++) {
            other.add(i);
        }
        out.println(list.equals(other));
    }
 
    public SortedIntegerList(final boolean isMultiSet) {
        this.isMultiSet = isMultiSet;
    }
 

    public void add(final int value) {
        int index = Collections.binarySearch(list, value);
        if (!isMultiSet && index >= 0) {
            return;
        }
        if (index < 0) {
            index = -index - 1;
        }
        list.add(index, value);
    }
 
    public void remove(final int value) {
        list.remove((Integer) value);
    }
 
    public void clear() {
        list.clear();
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final SortedIntegerList that = (SortedIntegerList) o;
        return isMultiSet == that.isMultiSet &&
                list.equals(that.list);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(list, isMultiSet);
    }
 
    @Override
    public String toString() {
        return list.toString();
    }

}