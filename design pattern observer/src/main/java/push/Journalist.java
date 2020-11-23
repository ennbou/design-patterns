package push;

import java.util.List;

public class Journalist implements Observer {

    private String name;
    private List<String> news;

    public Journalist(String name) {
        this.name = name;
    }

    public List<String> displayNews() {
        news.forEach(news -> {
            System.out.println(news);
        });
        return news;
    }

    @Override
    public void update(Observable o) {
        System.out.println(name + " get news from CNN.");
        this.news = ((CNN) o).getNews();

    }
}
