package java_basic_07;

class MyTv2{
	private int channel;
	private int prevChannel;
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		setPrevChannel(this.channel);
		this.channel = channel;
	}
	public int getPrevChannel() {
		return prevChannel;
	}
	public void setPrevChannel(int prevChannel) {
		this.prevChannel = prevChannel;
	}
	
	void gotoPrevChannel(){
		setChannel(prevChannel);
	}
	
}

public class java_basic_07_05 {
	public static void main(String[] args) {
		MyTv2 t=new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
