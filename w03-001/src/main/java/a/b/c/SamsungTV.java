package a.b.c;

import org.springframework.beans.factory.annotation.Autowired;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	
	public SamsungTV(){
		System.out.println("SamsungTV 객체 생성");
	}
	


	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV === 전원을 켠다.");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV === 전원을 끈다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
//		System.out.println("SamsungTV === 소리를 올린다.");
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
//		System.out.println("SamsungTV === 소리를 내린다.");
		speaker = new SonySpeaker();
		speaker.volmeDown();
	}
	
}
