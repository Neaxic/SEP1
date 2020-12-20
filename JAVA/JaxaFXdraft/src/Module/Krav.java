package Module;

public class Krav {
    private String name;
    private String status;
    private Task task = new Task();

    public Krav(String name, String status){
        this.name = name;
        this.status = status;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
