package org.full.encapsulation;

public class Television {

	private Integer volume;

	public void decreaseVolume(int volume) {
		if (volume > 0) {
			this.volume = --volume;
		}
	}

	public void increaseVolume(int volume) {
		if (volume < 100) {
			this.volume = ++volume;
		}
	}

	public Integer getVolume() {
		return volume;
	}
}




