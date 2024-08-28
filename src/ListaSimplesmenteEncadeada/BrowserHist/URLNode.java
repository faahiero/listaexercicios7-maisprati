package ListaSimplesmenteEncadeada.BrowserHist;

// Classe URLNode
public class URLNode {
    private String url;
    private URLNode next;

    public URLNode(String url) {
        this.url = url;
        this.next = null;
    }

    public String getUrl() {
        return url;
    }

    public URLNode getNext() {
        return next;
    }

    public void setNext(URLNode next) {
        this.next = next;
    }
}