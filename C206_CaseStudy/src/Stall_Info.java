
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20013890, 10 Aug 2021 11:35:12 pm
 */

public class Stall_Info {
	
	private int stallId;
	private String name;
	private String operationdate;
	private String description;

	public Stall_Info(int stallId, String name, String operationdate, String description) {
		this.stallId = stallId;
		this.name = name;
		this.operationdate = operationdate;
		this.description = description;
	}

	public int getStallId() {
		return stallId;
	}

	public String getName() {
		return name;
	}

	public String getOperationdate() {
		return operationdate;
	}

	public String getDescription() {
		return description;
	}
}
