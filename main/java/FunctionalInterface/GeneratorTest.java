package FunctionalInterface;

import java.util.Random;
public class GeneratorTest {
    public static void main(String[] args) {
        BridgeNumberGenerator bridgeNumberGenerator = () -> new Random().nextInt();
        int randomNumber = bridgeNumberGenerator.generate();
    }
}
