package a.b.c;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	
	public SamsungTV(){
		System.out.println("SamsungTV 객체 생성");
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker){
		this.speaker = speaker;
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
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
//		System.out.println("SamsungTV === 소리를 내린다.");
		speaker.volmeDown();
	}
	
}
