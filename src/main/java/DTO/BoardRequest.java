package DTO;

public class BoardRequest {
    private int id_task;
    private int all_tasks;
    private int debt;

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public void setAll_tasks(int all_tasks) {
        this.all_tasks = all_tasks;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getId_task() {
        return id_task;
    }

    public int getAll_tasks() {
        return all_tasks;
    }

    public int getDebt() {
        return debt;
    }


}
