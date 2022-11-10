package Task2;

import Task1.Task;

import java.util.ArrayList;


public interface Container {
    /**
     * Removes a Task.Task from the Task2.Container.
     *
     * @return the removed Task.Task, if the Task2.Container is not empty;
     *         null, otherwise
     */
    Task pop();

    /**
     * Inserts a Task.Task in the Task2.Container.
     *
     * @param task the inserted Task.Task
     */
    void push(Task task);

    /**
     * Returns the number of elements from the Task2.Container.
     *
     * @return The number of elements in this container.
     */
    int size();

    /**
     * Verifies if the Task2.Container is empty or not.
     *
     * @return true,  if the Task2.Container is empty
     *         false, otherwise
     */
    boolean isEmpty();

    /**
     * Transfers all the elements that exist in a Task2.Container in this Task2.Container.
     *
     * @param container the Task2.Container from which we should transfer elements.
     *                  After the transfer, container.size() == 0
     */
    void transferFrom(Container container);

    /**
     * Return all the tasks stored in the Task2.Container.
     *
     * @return The list of the tasks stored in the Task2.Container.
     */
    ArrayList<Task> getTasks();
}