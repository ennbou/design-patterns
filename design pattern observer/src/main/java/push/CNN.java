package push;

import java.util.ArrayList;
import java.util.List;

public class CNN implements Observable {
    private List<String> news = new ArrayList<>();

    private List<Observer> journalists = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        journalists.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        journalists.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        journalists.forEach(journalist -> {
            journalist.update(this);
        });
    }

    public void addNews(String news) {
        this.news.add(news);
        notifyAllObservers();
    }

    public List<String> getNews() {
        return news;
    }
}
