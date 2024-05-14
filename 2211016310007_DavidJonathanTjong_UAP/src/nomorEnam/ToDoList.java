package nomorEnam;

import java.util.Stack;

public class ToDoList {

    private Stack<Task> myNote = new Stack<>();
    private Task task;

    public void tambahkanList() {
        myNote.push(task);
    }

    public void hapusList() {
        if (!myNote.isEmpty()) {
            myNote.pop();
        } else {
            System.out.println("Tidak ada ToDoList saat ini");
        }

    }

    public void tampilanList() {
        if (!myNote.isEmpty()) {
            System.out.println("Judul\t\tDeskripsi");
            for (Task i : myNote) {
                System.out.println(i.getJudul() + "\t" + i.getDeskripsi());
            }
        } else {
            System.out.println("Tidak ada ToDoList saat ini");
        }

    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Stack<Task> getMyNote() {
        return myNote;
    }

    public Task getTask() {
        return task;
    }
}
