package aiss.model.Calendar;

public class NewEvent {
	private End end;
	private Start start;
	private String summary;
	
	
	public NewEvent(End end, Start start, String summary) {
		super();
		this.end = end;
		this.start = start;
		this.summary = summary;
	}
	public End getEnd() {
		return end;
	}
	public void setEnd(End end) {
		this.end = end;
	}
	public Start getStart() {
		return start;
	}
	public void setStart(Start start) {
		this.start = start;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	
}
