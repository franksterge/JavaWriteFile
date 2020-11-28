import java.io.Serializable;

public class TestClass1 implements Serializable {
    private String instanceId;
    private String message;

    public TestClass1(String instanceId, String message) {
        this.instanceId = instanceId;
        this.message = message;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return this.instanceId + ": " + message;
    }
}
