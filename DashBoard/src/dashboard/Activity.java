package dashboard;

import java.sql.Date;

public class Activity {

		private Date start;
		private Date stop;
		private int Id;
		private int nrOfPages;
		private int courseId;
		
		public Activity(Date start, Date stop, int Id, int nrOfPages, int courseId)
		{
			this.start = start;
			this.stop = stop;
			this.Id = Id;
			this.nrOfPages = nrOfPages;
			this.courseId = courseId;
		}
		
		public void setStart(Date start)
		{
			this.start = start;
		}
		public void setStop(Date stop)
		{
			this.stop = stop;
		}
		public double getDuration()
		{
			return start.compareTo(stop);
		}
}
