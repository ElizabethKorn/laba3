import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.LinkedList;

class TimerTest {
    @Test
    void timeByMethod() {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        Timer check = new Timer(1000);
        Integer badValue = 7;
        Long goodValue = 7L;

        // Тестирование Add
        assertThrows(IllegalArgumentException.class, () -> {check.timeForMethod(1000, Timer.MethodType.Add);});

        assertEquals(check.timeForMethod(list, Timer.MethodType.Add).getClass(), goodValue.getClass());
        assertEquals(check.timeForMethod(arr, Timer.MethodType.Add).getClass(), goodValue.getClass());

        assertNotEquals(check.timeForMethod(list, Timer.MethodType.Add).getClass(), badValue.getClass());
        assertNotEquals(check.timeForMethod(arr, Timer.MethodType.Add).getClass(), badValue.getClass());

        // Тестирования Get
        assertThrows(IllegalArgumentException.class, () -> {check.timeForMethod(1000, Timer.MethodType.Get);});

        assertEquals(check.timeForMethod(list, Timer.MethodType.Get).getClass(), goodValue.getClass());
        assertEquals(check.timeForMethod(arr, Timer.MethodType.Get).getClass(), goodValue.getClass());

        assertNotEquals(check.timeForMethod(list, Timer.MethodType.Get).getClass(), badValue.getClass());
        assertNotEquals(check.timeForMethod(arr, Timer.MethodType.Get).getClass(), badValue.getClass());

        // Тестирование Delete
        assertThrows(IllegalArgumentException.class, () -> {check.timeForMethod(1000, Timer.MethodType.Delete);});

        assertEquals(check.timeForMethod(list, Timer.MethodType.Delete).getClass(), goodValue.getClass());
        assertEquals(check.timeForMethod(arr, Timer.MethodType.Delete).getClass(), goodValue.getClass());

        assertNotEquals(check.timeForMethod(list, Timer.MethodType.Delete).getClass(), badValue.getClass());
        assertNotEquals(check.timeForMethod(arr, Timer.MethodType.Delete).getClass(), badValue.getClass());
    }
}
