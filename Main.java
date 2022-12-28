public class Main {
    public static void main(String[] args) {
        Task taskOne = new Task(3, "Продукты НГ", "Сельдь, свекла,картофель", "31.12.2022", "Петров Ф.П.");
        Task taskTwo = new Task(2, "Костюм", "Забрать из химчистки Рафаэлка", "01.01.2023", "Петров Ф.П.");
        Task taskThree = new Task(3, "Статья", "Написать статью в журнал", "10.01.2023", "Петров Ф.П.");
        Task taskFour = new Task(2, "Посылка", "В офисе почты России № 35", "01.01.2023", "Петров Ф.П.");

        Planner<Task> planTask = new Planner<>();

        planTask.append(taskOne);
        planTask.append(taskTwo);
        planTask.append(taskThree);
        planTask.append(taskFour);

        ExportToCSV<Task> eCsv = new ExportToCSV<>();
        eCsv.export("fileTaskCSV.csv", planTask);
        ExportToTXT<Task> eTxt = new ExportToTXT<>();
        eTxt.export("fileTaskTXT.txt", planTask);
        ImportFile<Task> pageToCsv = new ImportFile<>();
        pageToCsv.importFile("file.txt");

        Event eventOne = new Event(1, "31.12.2022", "New Year", "Petrov F.P.");
        Planner<Event> planEvent = new Planner<>();
        planEvent.append(eventOne);

        // for (int i = 0; i < plan.count(); i++) {
        // System.out.println(plan.get(i));
        // }

    }

}
