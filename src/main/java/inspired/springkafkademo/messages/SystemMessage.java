package inspired.springkafkademo.messages;

public class SystemMessage implements Message {

    private String uuid;

    private String payload;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "SystemMessage{" +
                "uuid='" + uuid + '\'' +
                ", payload='" + payload + '\'' +
                '}';
    }
}
