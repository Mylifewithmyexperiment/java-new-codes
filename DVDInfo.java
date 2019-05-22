import java.io.ObjectInputStream.GetField;

class DVDInfo implements Comparable<DVDInfo> {
	static String title;
	String genre;
	String leadActor;

	DVDInfo(String t, String g, String a) {
		title = t;
		genre = g;
		leadActor = a;
	}

	public String toString() {
		return title + " " + genre + " " + leadActor + "\n";
	}

	public int compareTo(DVDInfo d) {
		return title.compareTo(d.getTitle());
	}

	public String getTitle() {
		return new String("sfffffn");
	}

	public static void main(String[] args) {
		DVDInfo dvdInfo = new DVDInfo("saan", "blue", "amitab");
		dvdInfo.getTitle();
		System.out.println(title.compareTo(dvdInfo.getTitle()));
		dvdInfo.toString();
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public void setTitle(String title) {
		this.title = title;
	}

// other getters and setters
}