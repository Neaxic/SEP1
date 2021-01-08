package Module;

public class Task {
    private String Description;
    private String Status;

    public Task(){
        Description = "0";
        Status = "0";
    }

    public Task(String Description, String Status){
        this.Description = Description;
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
