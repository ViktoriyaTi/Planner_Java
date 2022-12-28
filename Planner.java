import java.util.ArrayList;
import java.util.Collections;

public class Planner<T extends JournalEntry> {
    private ArrayList<T> planner = new ArrayList<>();

    public ArrayList<T> getplanner() {
        return planner;
    }

    public void append(T content) {
        planner.add(content);
    }

    public ArrayList<T> sortPlannerPriority() {
        ArrayList<T> sortArrayList = getplanner();
        PriorityComparator<T> pc = new PriorityComparator<>();
        Collections.sort(sortArrayList, pc);
        return sortArrayList;
    }

    // public int count() {
    // return planner.size();
    // }

    // public T get(Integer index) {
    // return planner.get(index);
    // }

}