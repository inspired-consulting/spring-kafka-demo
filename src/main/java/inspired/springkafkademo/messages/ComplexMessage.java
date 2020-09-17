package inspired.springkafkademo.messages;

import java.time.LocalDateTime;
import java.util.List;

public class ComplexMessage implements Message {

    private String id;

    private LocalDateTime timestamp;

    private String description;

    private Integer ref;

    private Boolean isConfidential;

    private MonetaryAmount cost;

    private List<Message> content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRef() {
        return ref;
    }

    public void setRef(Integer ref) {
        this.ref = ref;
    }

    public Boolean getConfidential() {
        return isConfidential;
    }

    public void setConfidential(Boolean confidential) {
        isConfidential = confidential;
    }

    public MonetaryAmount getCost() {
        return cost;
    }

    public void setCost(MonetaryAmount cost) {
        this.cost = cost;
    }

    public List<Message> getContent() {
        return content;
    }

    public void setContent(List<Message> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ComplexMessage{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", description='" + description + '\'' +
                ", ref=" + ref +
                ", isConfidential=" + isConfidential +
                ", cost=" + cost +
                ", content=" + content +
                '}';
    }
}
