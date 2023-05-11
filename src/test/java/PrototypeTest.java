import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.prototypepattern.Cricle;

public class PrototypeTest {
    @Test
    public void testCloneCircle() {
        Circle circle = new Circle(10.0, 20.0, 5.0);
        Circle clonedCircle = circle.clone();

        Assertions.assertNotSame(circle, clonedCircle);
        Assertions.assertEquals(circle.getLatitude(), clonedCircle.getLatitude());
        Assertions.assertEquals(circle.getLongitude(), clonedCircle.getLongitude());
        Assertions.assertEquals(circle.getRadius(), clonedCircle.getRadius());
    }
}

