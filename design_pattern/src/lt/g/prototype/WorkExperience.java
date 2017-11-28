package lt.g.prototype;

public class WorkExperience implements Cloneable{
	private String workDate;
	private String company;


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	@Override
	public String toString() {
		return "WorkExperience [workDate=" + workDate + ", company=" + company + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
