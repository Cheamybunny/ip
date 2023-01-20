package duke.commands;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.tasks.Task;

public class UnmarkCommand extends Command {
    private String input;

    public UnmarkCommand(String input) {
        this.input = input;
    }

    public void execute(TaskList taskList, Ui inter, Storage store) {
        Task changed = taskList.unmark(input);
        inter.unmark(changed);
        store.writeTasks(taskList);
    }

    public boolean isExit() {
        return false;
    }
}
