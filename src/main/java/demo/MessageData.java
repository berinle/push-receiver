package demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageData implements Serializable {
    @JsonProperty
    private String data;
    @JsonProperty
    private Map<String, String> attributes;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageData that = (MessageData) o;
        return java.util.Objects.equals(data, that.data) &&
                java.util.Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(data, attributes);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("data", data)
                .add("attributes", attributes)
                .toString();
    }
}