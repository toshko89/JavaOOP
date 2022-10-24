package Telephony;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Smartphone implements Browsable, Callable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public List<String> getUrls() {
        return Collections.unmodifiableList(urls);
    }

    public void setNumbers(String number) {
        if (isInt(number)) {
            this.numbers.add(number);
        } else {
            throw new IllegalArgumentException("Invalid number!");
        }
    }

    public void setUrls(String url) {
        if (url.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid URL!");
        } else {
            this.urls.add(url);
        }
    }

    @Override
    public String browse() {
        if (urls.size() > 0) {
            return urls.remove(0);
        }
        return null;
    }

    @Override
    public String call() {
        if (numbers.size() > 0) {
            return numbers.remove(0);
        }
        return null;
    }

    private boolean isInt(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
