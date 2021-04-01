package ExceptionsListsThreadsFiles;

public class Module2Quiz2 {
    void myFunc(int arg)
            throws IllegalArgumentException
    {
        if (arg < 0) {
            throw new IllegalArgumentException();
        }
    }
}
