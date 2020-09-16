package inspired.springkafkademo;

public class SimpleMessage {

    private final String payload;

    public SimpleMessage() {
        this("<empty message>");
    }

    public SimpleMessage(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return payload;
    }
}
