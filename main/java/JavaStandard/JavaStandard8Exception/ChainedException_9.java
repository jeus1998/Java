package JavaStandard.JavaStandard8Exception;

public class ChainedException_9 {

    public static void main(String[] args) {
        boolean enoughSpace = false;
        boolean enoughMemory = false;
        startInstall(enoughSpace, enoughMemory);
    }
    static void startInstall(boolean enoughSpace, boolean enoughMemory)  {
        if(!enoughSpace)
            throw new RuntimeException(new SpaceException("설치할 공간이 부족합니다"));

        if(!enoughMemory)
            throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
    }
}

class SpaceException extends Exception{
    public SpaceException(String msg) {
        super(msg);
    }
}
class MemoryException extends Exception{
    public MemoryException(String msg) {
        super(msg);
    }
}
