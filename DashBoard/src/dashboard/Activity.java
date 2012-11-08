package dashboard;

import java.sql.Date;

import javax.persistence.Id;

public class Activity {

		@Id Long id;
	
		private Date start;
		private Date stop;
		
		
		
		private int nrOfPages;
		
		private int courseId;
		
		private int appreciation;
		
		public Activity(Date start, Date stop, int nrOfPages, int courseId, int appreciation)
		{
			this.start = start;
			this.stop = stop;
			this.nrOfPages = nrOfPages;
			this.courseId = courseId;
			this.appreciation = appreciation;
		}
		
		
		//getters and setter
		
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
		
		public long getId()
		{
			return id;
		}


		public int getNrOfPages() {
			return nrOfPages;
		}


		public void setNrOfPages(int nrOfPages) {
			this.nrOfPages = nrOfPages;
		}


		public int getAppreciation() {
			return appreciation;
		}


		public void setAppreciation(int appreciation) {
			this.appreciation = appreciation;
		}


		public int getCourseId() {
			return courseId;
		}
}
