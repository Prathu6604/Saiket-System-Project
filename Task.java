class Task {
    private String title;
    private boolean completed;

    // Constructor
    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    // Mark task as completed
    public void markCompleted() {
        this.completed = true;
    }

    // Get task status
    public String getStatus() {
        return completed ? "Completed" : "Pending";
    }

    // Display task details
    public String toString() {
        return title + " [" + getStatus() + "]";
    }
}
