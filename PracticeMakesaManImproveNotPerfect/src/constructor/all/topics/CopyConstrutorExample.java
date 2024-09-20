package constructor.all.topics;

public class CopyConstrutorExample {
	private String job;
	int experiance;

	public CopyConstrutorExample(String job, int experiance) {
		this.job = job;
		this.experiance = experiance;
	}

	public CopyConstrutorExample(CopyConstrutorExample reference) {
		this.job = reference.job;
		this.experiance = reference.experiance;

	}

	public void display() {
		System.out.println("I am fired from this role " + job + " with in" + experiance + " of experiance");
	}
}
