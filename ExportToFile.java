
public abstract class ExportToFile<T extends Task> {
    public abstract void export(String fileName, Planner<T> newplan);
}
