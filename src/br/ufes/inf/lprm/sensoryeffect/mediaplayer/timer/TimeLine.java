package br.ufes.inf.lprm.sensoryeffect.mediaplayer.timer;

public class TimeLine extends java.util.TimerTask {

	public static Status status = Status.STOPPED;
	private long currentTime = 0;
	private long duration = 0;
	
	@Override
	public void run() {
		if (status.getId() == Status.PLAYING.getId() && currentTime <= duration){
			currentTime += 1; 
			System.out.println(currentTime);
		}
	}
	
	public void stop(){
		status = Status.STOPPED;
		System.out.println(">>> STOP at " + currentTime);
		currentTime = 0;
	}
	
	public void pause(long newCurrentTime){
		status = Status.PAUSED;
		currentTime = newCurrentTime;
		System.out.println(">>> PAUSE at " + currentTime);
	}
	
	public void play(long newCurrentTime){
		status = Status.PLAYING;
		currentTime = newCurrentTime;
		System.out.println(">>> PLAY at " + currentTime);
	}
	
	public void setDuration(long duration){
		this.duration = duration;
	}
	
	public enum Status{
		PAUSED(2),
		STOPPED(0),
		PLAYING(1);
		Status(int id) {
			this.id = id;
		}
		private int id;
		public int getId() {
			return id;
		}
	}
}
