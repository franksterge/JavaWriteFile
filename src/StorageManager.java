import java.io.*;


public class StorageManager {
    private FileOutputStream fos;
    private PrintStream ps;

    public StorageManager() {

    }

    public void writeClassToFile(TestClass1 instance) throws IOException {
        String instanceId = instance.getInstanceId();
        String dirPath = "data/" + instanceId + "/";
        File dir = new File(dirPath);
        dir.getParentFile().mkdirs();
        dir.mkdir();

        String fileName = dirPath + instanceId + ".dat";
        File instanceFile = new File(fileName);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(instanceFile));
        oos.writeObject(instance);
        oos.close();
    }

    public TestClass1 readClassFromFile(String instanceId) throws IOException, ClassNotFoundException  {
        String fileName = "data/" + instanceId + "/" + instanceId + ".dat";
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois= new ObjectInputStream(fis);
        return (TestClass1) ois.readObject();

    }
}
