package a.b.c;

import org.springframework.stereotype.Component;

@Component("appleSpeaker")
public class AppleSpeaker implements Speaker {

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
			System.out.println("AppleSpeaker --- �Ҹ��� ���ø���.");
	}

	@Override
	public void volmeDown() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker --- �Ҹ��� ��������.");
	}

}
