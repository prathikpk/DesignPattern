package com.Aurionpro.model;

public class Laptop {
	public String ram;
	public String hdd;
	public boolean touchscreen;
	public String keyboard;
	public String mouse;

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public boolean isTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", touchscreen=" + touchscreen + ", keyboard=" + keyboard
				+ ", mouse=" + mouse + "]";
	}

}
