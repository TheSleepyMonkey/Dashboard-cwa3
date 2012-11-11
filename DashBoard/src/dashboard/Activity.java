package dashboard;

import java.util.Date;

import javax.persistence.Id;

public class Activity {

		@Id Long id;
	
		private Date start;
		private Date stop;
		private int nrOfPages;
		
		private int courseId;
		
		private int appreciation;
		
		private String place;
		
		private String type;
		
		public Activity(Date start, int courseId, String type)
		{
			this.start = start;
			this.stop = null;
			this.nrOfPages = 0;
			this.courseId = courseId;
			this.appreciation = 0;
			this.place = null;
			this.type = type;
		}
		
		
		
		//getters and setter
		
	
		public void setStop(Date stop)
		{
			this.stop = stop;
		}
		
		public double getDuration()
		{
			return start.compareTo(stop);
		}
		
		public Date getStart(){
			return start;
		}
		public Date getStop(){
			return stop;
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
		
		public void setPlace(String place) {
			this.place = place;
		}
		
		public String getPlace() {
			return place;
		}
		
	
		public String getType() {
			return type;
		}
}
