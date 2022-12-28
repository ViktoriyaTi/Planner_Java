public class Event extends JournalEntry {

    String dateEvent;

    public Event(int priority, String dateEvent, String name, String fullNameAuthor) {
        super(priority, name, fullNameAuthor);
        this.dateEvent = dateEvent;

    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

}
