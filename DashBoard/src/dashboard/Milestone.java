package dashboard;

import java.sql.Date;

public class Milestone {

	private Date start;
	private Date end;
	private int userId;
	private int goal;
	private String type;
	private boolean finished = false;
	
	public Milestone(Date start, Date end, int userId, int goal, String type)
	{
		this.start = start;
		this.end = end;
		this.userId = userId;
		this.goal = goal;
		this.type = type;
	}
}
