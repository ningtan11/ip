public class Event extends Task {
    private final String time;
    private static final String TYPE = "[E]";

    public Event(String name, String time) {
        super(name);
        this.time = time;
    }

    public Event(String name, String time, boolean isDone) {
        super(name, isDone);
        this.time = time;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return TYPE + super.toString() + " (on: " + time + ")";
    }
}
