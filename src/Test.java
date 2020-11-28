public class Test {
    public static void main(String[] args) {
        TestClass1 t = new TestClass1("1", "Hello world!");
        String instanceId = t.getInstanceId();
        StorageManager sm = new StorageManager();
        try {
            sm.writeClassToFile(t);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("an error had occurred when writing");
        }
        TestClass1 tReturend = null;
        try {
            tReturend = sm.readClassFromFile(instanceId);
        } catch (Exception e) {
            System.out.println("an error had occured when reading");
        }
        System.out.println(tReturend);
    }
}
