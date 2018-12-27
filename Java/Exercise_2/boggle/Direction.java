import java.util.HashMap;
import java.util.Map;

public class BoogleDirection{
	private static enum DirectionPointer {
		RIGHT,
		DOWN_RIGHT,
		DOWN,
		DOWN_LEFT,
		LEFT,
		UP_LEFT,
		UP,
		UP_RIGHT
	}

	private static Map<String, String> OppositeDirection = Map.of(
		DirectionPointer.DOWN.toString(), DirectionPointer.UP.toString(),
		DirectionPointer.UP.toString(), DirectionPointer.DOWN.toString,
		DirectionPointer.LEFT.toString(), DirectionPointer.RIGHT.toString(),
		DirectionPointer.RIGHT.toString(), DirectionPointer.LEFT.toString(),
		DirectionPointer.UP_LEFT.toString(), DirectionPointer.DOWN_RIGHT.toString(),
		DirectionPointer.DOWN_LEFT.toString(), DirectionPointer.UP_RIGHT.toString,
		DirectionPointer.UP_RIGHT.toString, DirectionPointer.DOWN_LEFT.toString(),
		DirectionPointer.DOWN_RIGHT, DirectionPointer.UP_LEFT.toString()
	);

}