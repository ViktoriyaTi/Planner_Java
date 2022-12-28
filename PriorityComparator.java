import java.util.Comparator;

public class PriorityComparator<T extends JournalEntry> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o2.getPriority() - o1.getPriority();
    }

}
