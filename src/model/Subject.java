package model;

public interface Subject {
	public void addObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifys();

	public void validation();
}
