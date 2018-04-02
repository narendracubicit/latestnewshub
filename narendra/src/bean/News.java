package bean;

public class News {
	
	public String State; // AP,TS
	public String Section; // GOs, Proceedings, Teacher, Employee, Student
	public String SubSection;// 
	public String filepath;
	public String url;
	public String description;
	public String id;
	
	
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getSubSection() {
		return SubSection;
	}
	public void setSubSection(String subSection) {
		SubSection = subSection;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

}
