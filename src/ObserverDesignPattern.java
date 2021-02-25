import java.util.*;

class Subscriber {

	private String name;
	private Channel channel=new Channel();
	
	public void update(Channel ch) {
		System.out.println("Hey "+name+" , vidoeo uploaded "+ch.getVideoTitle());
		
	}
	public Subscriber(String name) {
		this.name=name;
	}
	public void subscribe(Channel ch) {
		// TODO Auto-generated method stub
		this.channel= ch;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


class Channel{
	private String channelName;
	private List<Subscriber> subscriberList = new ArrayList<>();
	private String videoTitle;
	
	public void addSubscriber(Subscriber s) {
		this.subscriberList.add(s);
	}
	public void removeSubscriber(Subscriber s) {
		this.subscriberList.remove(s);
	}
	public void notifySubscriber() {
		for(Subscriber s:this.subscriberList) {
		s.update(this);
		}
	}
	public void videoUplod(String title) {
		this.setVideoTitle(title);
		notifySubscriber();
	}
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
}
public class ObserverDesignPattern {
	public static void main(String[] args) {
	Subscriber s1= new Subscriber("A");
	Subscriber s2= new Subscriber("B");
	Subscriber s3= new Subscriber("C");
	Channel ch = new Channel();
	s1.subscribe(ch);
	s2.subscribe(ch);
	s3.subscribe(ch);
	
	
	ch.addSubscriber(s1);
	ch.addSubscriber(s2);
	ch.addSubscriber(s3);
	
	ch.removeSubscriber(s3);
	ch.videoUplod("title aise hi");
	}
}
