package FunctionalInterface;

import java.util.Random;

public class BrideRandomNumberGenerator implements BridgeNumberGenerator {
    @Override
    public int generate() {
        return new Random().nextInt();
    }
}
