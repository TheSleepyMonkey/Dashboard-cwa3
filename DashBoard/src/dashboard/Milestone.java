package dashboard;

import java.sql.Date;

import javax.persistence.Id;

public class Milestone {

	@Id Long id;
	
	private Date start;
	private Date end;
	
	private int goal;
	
	private String type;
	
	private boolean finished = false;
	
	public Milestone(Date start, Date end, int goal, String type)
	{
		this.setStart(start);
		this.setEnd(end);
		this.setGoal(goal);
		this.setType(type);
	}
	
	// getters and setters
	public long getId()
	{
		return id;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}
}
