public class ListItem <Item> {
    private Item data;
    private ListItem<Item> prev;
    private ListItem<Item> next;
    ListItem(Item d){
        data=d;
        next=null;
        prev=null;
    }
    ListItem(Item d,ListItem<Item> p){
        data=d;
        prev=p;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public ListItem<Item> getNext() {
        return next;
    }

    public ListItem<Item> getPrev() {
        return prev;
    }

    public void setNext(ListItem<Item> li) {
        next = li;
    }

    public void setPrev(ListItem<Item> li) {
        prev = li;
    }
}
