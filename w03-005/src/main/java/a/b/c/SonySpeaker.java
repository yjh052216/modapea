package a.b.c;

import org.springframework.stereotype.Component;

@Component("sonySpeaker")
public class SonySpeaker implements Speaker {

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SonySpeaker --- 소리를 올린다.");
	}

	@Override
	public void volmeDown() {
		// TODO Auto-generated method stub
		System.out.println("SonySpeaker --- 소리를 내린다.");

	}

}
