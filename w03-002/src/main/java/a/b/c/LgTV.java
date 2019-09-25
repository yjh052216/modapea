package a.b.c;

public class LgTV implements TV {
	
	Speaker speaker;
	
	public LgTV(){
		System.out.println("LgTV 객체 생성");
	}
	
	public LgTV(Speaker speaker){
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV === 전원을 켠다.");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV === 전원을 끈다.");

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
//		System.out.println("LgTV === 소리를 올린다.");
		speaker.volumeUp();

	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
//		System.out.println("LgTV === 소리를 내린다.");
		speaker.volmeDown();
	}

}
