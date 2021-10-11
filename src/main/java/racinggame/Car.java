package racinggame;

public class Car {
	private final String name;
	private int position;

	public Car(String name) {
		vaildateCarName(name);
		this.name = name;
		this.position = 0;
	}

	public int getPosition() {
		return position;
	}

	private void vaildateCarName(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자이하만 가능합니다.");
		}
	}

	public void move(int number) {
		if (number >= 4) {
			this.position++;
		}
	}
}
