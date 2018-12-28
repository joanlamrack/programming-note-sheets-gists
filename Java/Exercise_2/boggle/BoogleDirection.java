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

	private static Map<String, String> oppositeDirection = Map.of(
		DirectionPointer.DOWN.toString(), DirectionPointer.UP.toString(),
		DirectionPointer.UP.toString(), DirectionPointer.DOWN.toString,
		DirectionPointer.LEFT.toString(), DirectionPointer.RIGHT.toString(),
		DirectionPointer.RIGHT.toString(), DirectionPointer.LEFT.toString(),
		DirectionPointer.UP_LEFT.toString(), DirectionPointer.DOWN_RIGHT.toString(),
		DirectionPointer.DOWN_LEFT.toString(), DirectionPointer.UP_RIGHT.toString,
		DirectionPointer.UP_RIGHT.toString(), DirectionPointer.DOWN_LEFT.toString(),
		DirectionPointer.DOWN_RIGHT.toString(), DirectionPointer.UP_LEFT.toString()
	);

	private static Map<String, Integer> rowTranslation = Map.of(
		DirectionPointer.RIGHT.toString(), 0,
		DirectionPointer.LEFT.toString(), 0,
		DirectionPointer.UP.toString(), -1,
		DirectionPointer.DOWN.toString(), 1,
		DirectionPointer.UP_LEFT.toString(), -1,
		DirectionPointer.UP_RIGHT.toString(), 1,
		DirectionPointer.DOWN_LEFT.toString(), 1,
		DirectionPointer.DOWN_RIGHT.toString(), 1
	);

	private static Map<String, Integer> colTranslation = Map.of(
		DirectionPointer.RIGHT.toString(), 1,
		DirectionPointer.LEFT.toString(), -1,
		DirectionPointer.UP.toString(), 0,
		DirectionPointer.DOWN.toString(), 0,
		DirectionPointer.UP_LEFT.toString(), -1,
		DirectionPointer.UP_RIGHT.toString(), 1,
		DirectionPointer.DOWN_LEFT.toString(), -1,
		DirectionPointer.DOWN_RIGHT.toString(), 1
	);

	public static String getOppositeDirection(String direction){
		if( oppositeDirection.containsKey(direction) == true ){
			return oppositeDirection.get(direction);
		}
		throw new Exception("Invalid Direction");
	}

	public static int getRowTranslation(String direction){
		if( rowTranslation.containsKey(direction) == true ){
			return rowTranslation.get(direction);
		}
		throw new Exception("Invalid Direction");
	}

	public static int getColTranslation(String direction){
		if( colTranslation.containsKey(direction) == true ){
			return colTranslation.get(direction);
		}
		throw new Exception("Invalid Direction");
	}
}