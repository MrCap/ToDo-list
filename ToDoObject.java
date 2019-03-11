class ToDoObject {  
    ToDoObject(String task, int priority, String deadline, boolean done) {
        this.task = task;
        this.priority = priority;
        this.deadline = deadline;
        this.done = done;
    }

    private String task;
    private int priority;
    private String deadline;
    private boolean done;

    // getters and setters

    @Override
    public String toString() {
        return "ToDoObject{" +
                "task='" + task + '\'' +
                ", priotiry=" + priority +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }
}