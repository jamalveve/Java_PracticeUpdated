package pass.byvalue.byreference;

public class Mug {

	private String contents;

	public Mug(String contents) {
		this.contents = contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getContents() {
		return contents;
	}

	public static void spill(Mug myMug) {
		myMug.setContents("nothing");
	}
}

 class Jug{
	
//	public Jug(String content) {
//		this.content = content;
//	}//it will change bcz constructor wise
//	public void setContent(String content) {
//		this.content = content;
//	}
//
//	public String getContent() {
//		return content;
//	}

	public static void spilled(String localcontent) {
		localcontent="water";
	}
}
 
class Balloon {

		private String color;

		public Balloon() {}
		
		public Balloon(String c) {
			this.color = c;
		}
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
	}
