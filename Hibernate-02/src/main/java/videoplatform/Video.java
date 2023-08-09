package videoplatform;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Video {

	@Id
	private int vid;
	private String title;
	private int duration;
	@ManyToMany
	private Platform p;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Platform getP() {
		return p;
	}
	public void setP(Platform p) {
		this.p = p;
	}
}
