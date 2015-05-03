package demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    @JsonProperty("ack_id")
    private String ackId;
    private String subscription;
    private MessageData message;

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getAckId() {
        return ackId;
    }

    public void setAckId(String ackId) {
        this.ackId = ackId;
    }

    public MessageData getMessage() {
        return message;
    }

    public void setMessage(MessageData message) {
        this.message = message;
    }

    public Message withAckId(String input) {
        this.ackId = input;
        return this;
    }

    public Message withSubscription(String input) {
        this.subscription = input;
        return this;
    }

    public Message withMessage(MessageData data) {
        this.message = data;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Message that = (Message) o;
        return java.util.Objects.equals(subscription, that.subscription) &&
                java.util.Objects.equals(ackId, that.ackId) &&
                java.util.Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(subscription, ackId, message);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("subscription", subscription)
                .add("ackId", ackId)
                .add("message", message)
                .toString();
    }
}
