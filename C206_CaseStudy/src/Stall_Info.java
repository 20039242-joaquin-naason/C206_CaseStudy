
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20013890, 10 Aug 2021 11:35:12 pm
 */

public class Stall_Info {
	
	private int stallId;
	private String name1;
	private String operationdate;

	public Stall_Info(int stallId, String name, String operationdate) {
		this.stallId = stallId;
		this.name1 = name;
		this.operationdate = operationdate;
	}

	public int getStallId() {
		return stallId;
	}

	public String getName() {
		return name1;
	}

	public String getOperationdate() {
		return operationdate;
	}
	
}
