package Task2;

import Task1.Task;

import java.util.ArrayList;

public class Queue implements Container{
    private ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public Task pop() {
        Task rem_task = tasks.get(0);
        tasks.remove(0);
        return rem_task;
    }

    @Override
    public void push(Task task) {
        tasks.add(task);
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        int max = container.size();
        for(int i = 0; i < max; i++) {
            this.tasks.add(container.pop());
        }

    }

    @Override
    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
