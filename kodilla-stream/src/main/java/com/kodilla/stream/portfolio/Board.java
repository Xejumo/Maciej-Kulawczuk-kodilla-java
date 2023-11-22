package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Board {

    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public boolean removeTaskList(TaskList taskList) {
        return taskLists.remove(taskList);
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" + "\n" +
                "name='" + name + '\'' + ",\n" +
                "taskLists=" + taskLists + "\n" +
                '}';
    }
    public double calculateAverageWorkingOnTask() {
        List<TaskList> inProgressTasks = taskLists.stream()
                .filter(taskList -> taskList.getName().equals("In progress"))
                .collect(Collectors.toList());

        return inProgressTasks.stream()
                .flatMap(taskList -> taskList.getTasks().stream())
                .mapToDouble(task -> {
                    long duration = task.getDuration();
                    LocalDate created = task.getCreated();
                    LocalDate now = LocalDate.now();
                    long daysBetween = ChronoUnit.DAYS.between(created, now);
                    return daysBetween - duration;
                })
                .average()
                .orElse(0);
    }
}
