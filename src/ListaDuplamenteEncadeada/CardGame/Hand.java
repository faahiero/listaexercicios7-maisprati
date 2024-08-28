package ListaDuplamenteEncadeada.CardGame;

public class Hand {
    private Card head;
    private Card tail;

    public Hand() {
        this.head = null;
        this.tail = null;
    }

    public void addCard(String value) {
        Card newCard = new Card(value);
        if (head == null) {
            head = newCard;
            tail = newCard;
        } else {
            tail.setNext(newCard);
            newCard.setPrev(tail);
            tail = newCard;
        }
    }

    public void removeCard(String value) {
        if (head == null) return;

        Card current = head;
        while (current != null && !current.getValue().equals(value)) {
            current = current.getNext();
        }

        if (current == null) return;

        if (current == head) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;
            }
        } else if (current == tail) {
            tail = tail.getPrev();
            if (tail != null) {
                tail.setNext(null);
            } else {
                head = null;
            }
        } else {
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
    }

    public void moveCard(String value, int newPosition) {
        if (head == null) return;

        Card current = head;
        int currentPosition = 0;
        while (current != null && !current.getValue().equals(value)) {
            current = current.getNext();
            currentPosition++;
        }

        if (current == null || newPosition < 0) return;

        removeCard(value);

        Card newCard = new Card(value);
        if (newPosition == 0) {
            newCard.setNext(head);
            if (head != null) {
                head.setPrev(newCard);
            }
            head = newCard;
            if (tail == null) {
                tail = newCard;
            }
        } else {
            Card temp = head;
            for (int i = 0; i < newPosition - 1 && temp.getNext() != null; i++) {
                temp = temp.getNext();
            }
            newCard.setNext(temp.getNext());
            newCard.setPrev(temp);
            if (temp.getNext() != null) {
                temp.getNext().setPrev(newCard);
            }
            temp.setNext(newCard);
            if (newCard.getNext() == null) {
                tail = newCard;
            }
        }
    }

    public void printHand() {
        Card current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}