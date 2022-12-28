
public class Task extends JournalEntry {
    private String comment;
    private String dateDeadline;

    public Task(int priority, String name, String comment, String dateDeadline, String fullNameAuthor) {
        super(priority, name, fullNameAuthor);
        this.comment = comment;
        this.dateDeadline = dateDeadline;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDateDeadline() {
        return dateDeadline;
    }

    public void setDadteDeadline(String dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    @Override
    public String toString() {
        return getId() + getPriority() + getName() + getComment() + getDateDeadline() + getFullNameAuthor() + "\n";
    }

}
