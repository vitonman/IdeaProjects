package com.company;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //The list was empty, this item becomes the head of the lsit
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison<0){
                //newitem is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //there os no next, so insert at end of list
                    currentItem.setNext(newItem);
                    return true;
                }
            }else if(comparison>0){
                //newItem is less, insert before
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                }else{
                    //the node with previous is the root
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }else {
                //equal
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        // cant get here, but java complains if theres no return
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem curreItem = this.root;
        ListItem parentItem = curreItem;
        while(curreItem != null){
            int comparison = curreItem.compareTo(item);
            if(comparison < 0){
                //found the item to delete
                parentItem = curreItem;
                curreItem = curreItem.next();
            }else if(comparison>0){
                parentItem = curreItem;
                curreItem = curreItem.previous();
            }else {
                //equal
                performRemoval(curreItem, parentItem);
                return true;
            }
        }
        //We have reached the end of the list
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent){

    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
