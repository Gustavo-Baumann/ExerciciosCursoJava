package ooHeran�aDesafio;

public interface SportsCar {

	void nitro();
	void nitroShutDown();
	
	default boolean wing() {
		return false;
	}
}
