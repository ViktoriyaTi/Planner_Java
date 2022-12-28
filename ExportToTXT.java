import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ExportToTXT<T extends Task> extends ExportToFile<T> {

    Planner<T> p = new Planner<>();

    @Override
    public void export(String fileName, Planner<T> p) {

        String header = "ID Приоритет Краткое описание Комментарий Крайний срок выполнения задачи ФИО автора Дата и время создания записи \n";
        Date start = new Date();
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(header);
            for (T item : p.sortPlannerPriority()) {
                fw.write(item.getId() + " " + item.getPriority() + " " + item.getName() + " " + item.getComment() + " "
                        + item.getDateDeadline()
                        + " " + start + "\n");
            }
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
