package a.b.c;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	
	public SamsungTV(){
		System.out.println("SamsungTV ��ü ����");
	}
	
	public SamsungTV(Speaker speaker){
		this.speaker = speaker;
	}
	


	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV === ������ �Ҵ�.");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV === ������ ����.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
//		System.out.println("SamsungTV === �Ҹ��� �ø���.");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
//		System.out.println("SamsungTV === �Ҹ��� ������.");
		speaker.volmeDown();
	}
	
}
