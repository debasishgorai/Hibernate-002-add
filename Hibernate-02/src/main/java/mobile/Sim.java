package mobile;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Sim {
	@Override
	public String toString() {
		return "Sim [sid=" + sid + ", provider=" + provider + ", type=" + type + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Id
private int sid;
private String provider;
private String type;
}
