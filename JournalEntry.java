import java.util.concurrent.atomic.AtomicInteger;

public abstract class JournalEntry {
    private static AtomicInteger nextId = new AtomicInteger();
    private int id;
    private String name;
    private int priority;
    private String fullNameAuthor;

    public JournalEntry(int priority, String name, String fullNameAuthor) {
        id = nextId.incrementAndGet();
        this.name = name;
        this.priority = priority;
        this.fullNameAuthor = fullNameAuthor;
    }

    public JournalEntry(String name2, String comment2, int priority2, String fullNameAuthor2) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (getPriority() == 1 | getPriority() == 2 | getPriority() == 3)
            this.priority = priority;
        else
            System.out.println("Ошибка");
    }

    public String getFullNameAuthor() {
        return fullNameAuthor;
    }

    public void setFullNameAuthor(String fullNameAuthor) {
        this.fullNameAuthor = fullNameAuthor;
    }

}