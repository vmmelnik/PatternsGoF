package ru.vmmelnik.patterns.observer.own.subject;

import ru.vmmelnik.patterns.observer.own.observer.Observer;

public interface Subject {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();

}
