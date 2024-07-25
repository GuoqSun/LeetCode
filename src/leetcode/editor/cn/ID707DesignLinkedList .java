package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID707DesignLinkedList {
    public static void main(String[] args) {


    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyLinkedList {
        class ListNode{
            int val;
            ListNode prev;
            ListNode next;
            ListNode(int val){
                this.val = val;
            }
        }

        ListNode head;
        ListNode tail;
        int size;

        public MyLinkedList() {
            head = new ListNode(0);
            tail = new ListNode(0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        public int get(int index) {
            if(index<0 || index>size-1) return -1;
            ListNode cur = head;
            for(int i=0;i<=index;i++){
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            ListNode tmp = head.next;
            ListNode newNode = new ListNode(val);
            head.next = newNode;
            newNode.next = tmp;
            newNode.prev = head;
            tmp.prev = newNode;
            size++;
        }

        public void addAtTail(int val) {
            ListNode tmp = tail.prev;
            ListNode newNode = new ListNode(val);
            tmp.next = newNode;
            newNode.next = tail;
            newNode.prev = tmp;
            tail.prev = newNode;
            size++;
        }

        public void addAtIndex(int index, int val) {
            if(index > size) return;
            if(index == size) addAtTail(val);
            else {
                ListNode cur = head;
                for(int i=0;i<index;i++){
                    cur = cur.next;
                }
                ListNode tmp = cur.next;
                ListNode newNode = new ListNode(val);
                cur.next = newNode;
                newNode.next = tmp;
                newNode.prev = cur;
                tmp.prev = newNode;
                size++;
            }
        }

        public void deleteAtIndex(int index) {
            if(size == 0 || index>size-1){
                return;
            }
            ListNode cur = head;
            for(int i=0;i<index;i++){
                cur = cur.next;
            }
            ListNode tmp = cur.next.next;
            cur.next = tmp;
            tmp.prev = cur;
            size--;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
