package com.example.recyclerviewtutorial;
/*Model Class */
public class ListItem {

    private String head , desc;

    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}
