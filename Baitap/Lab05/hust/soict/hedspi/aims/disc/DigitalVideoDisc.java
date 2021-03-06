package disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int lenght;
	private float cost;

	public DigitalVideoDisc(String title, String category, String director, int lenght, float cost){
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.lenght = lenght;
		this.cost = cost;

	}
	public DigitalVideoDisc(String title){
		super();
		this.title = title;
	}


	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getCategory(){
		return category;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getDirector(){
		return director;
	}

	public void setDirector(String director){
		this.director = director;
	}

	public int getLenght(){
		return lenght;
	}

	public void setLenght(int lenght){
		this.lenght = lenght;
	}

	public float getCost(){
		return cost;
	}

	public void setCost(float cost){
		this.cost = cost;
	}

	public boolean search(String title){
		title = title.toLowerCase();
		String [] part = title.split(" ");
		int i;
		String tit = this.getTitle();
		tit = tit.toLowerCase();
		for (i = 0; i < part.length; i++){
			if (tit.contains(part[i]) == false)
				return false;
		}
		return true;
	}
}