package a.b.c;

import org.springframework.stereotype.Component;

@Component("sonySpeaker")
public class SonySpeaker implements Speaker {

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SonySpeaker --- �Ҹ��� �ø���.");
	}

	@Override
	public void volmeDown() {
		// TODO Auto-generated method stub
		System.out.println("SonySpeaker --- �Ҹ��� ������.");

	}

}
