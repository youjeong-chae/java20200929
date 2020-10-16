package chap08.textbook.s080301;

import chap08.textbook.s080201.RemoteControl;

public class Audio implements RemoteControl{
	// 필드
	private int volume;
	
	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}	else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 불륨: " + this.volume);
	}
}
