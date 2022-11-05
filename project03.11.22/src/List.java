public class List<Item>{
    private int kol;
    private ListItem<Item> first;
    private ListItem<Item> last;
    List(){
        kol=0;
        first=null;
        last=null;
    }
    List(Item data){
        first=last=new ListItem<Item>(data);
        kol=1;
    }
    public void add(Item data){
        ListItem <Item> li=new ListItem<Item>(data);
        li.setNext(null);
        if(kol>0){
            li.setPrev(last);
            last.setNext(li);
        }
        else{first=li;}
        last=li;
        kol++;
    }
    public ListItem<Item> getFirst(){
        return first;
    }
    public ListItem<Item> getLast(){
        return last;
    }
    public int getquan(){
        return kol;
    }
    public ListItem<Item>get(int i) {
        if (i > kol)
            return null;
        else {
            ListItem<Item> li = first;
            for (int j = 1; j < i; j++)
                li = li.getNext();
            return li;
        }
    }
    void print(){
        ListItem<Item>li=first;
        while(li!=null){
            System.out.print(li.getData()+" ");
            li=li.getNext();
        }
        System.out.println();
    }
    public void remove(int i){
        if(i<=kol){
            ListItem<Item>li=get(i);
            ListItem<Item>prev=li.getPrev();
            ListItem<Item>next=li.getNext();
            if(prev!=null)
                prev.setNext(next);
            if(next!=null)
                next.setPrev(prev);
            if(i==1)
                first=next;
        }
        kol--;
    }
    boolean simm(){
        ListItem<Item>li1=first;
        ListItem<Item>li2=last;
        while(li1.getNext()!=null && li2.getPrev()!=null)
            if(li1.getData()!= li2.getData())
                return false;
        else
            {
                li1=li1.getNext();
                li2=li2.getPrev();
            }
        return true;
    }
    public void removelast(Item data){
        ListItem<Item>li=last;
        int f=0;
        int i=0;
        while(f==0)
        {
            if(li.getData()==data){
                remove(kol-i);
                f=1;
            }
            else{
                i++;
                li=li.getPrev();
            }
        }
    }
    boolean equalelem(){
        ListItem<Item>li1=first;
        ListItem<Item>li2=li1.getNext();
        while(li1.getNext()!=null){
            while(li2.getNext()!=null){
                if(li1.getData()== li2.getData())
                    return true;
                else li2=li2.getNext();
            }
            li1=li1.getNext();
            li2=li1.getNext();
        }
        return false;
    }
}
