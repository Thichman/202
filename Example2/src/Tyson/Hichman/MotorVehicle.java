package Tyson.Hichman;

abstract class MotorVehicle {

	protected int odometer;
	protected position position;
	enum TurnDirection {
		Left,Right
	}
	enum FacingDirection{
		north, south, east, west
	}
	
	private FacingDirection facing;
	public MotorVehicle() {
		odometer = 0;
		position = new position();
		facing = FacingDirection.east;
	}
	abstract void drive (int time) {
		
	}
	
}
