public void remove(String s) {
        if (root == null) return;

        if (!exists(s)) return;

        if (s == null ? root.getValue() == null : s.equals(root.getValue())) {
            root = root.getNext();
            return;
        }

        Nodo prev = root;
        Nodo curr = root.getNext();
        while (curr != null) {
            if (s == null ? curr.getValue() == null : s.equals(curr.getValue())) {
                prev.setNext(curr.getNext());
                return;
            }
            prev = curr;
            curr = curr.getNext();
        }
    }


public boolean exists(String s) {
        Nodo temp = root;
        while (temp != null) {
            if (s == null) {
                if (temp.getValue() == null) return true;
            } else {
                if (s.equals(temp.getValue())) return true;
            }
            temp = temp.getNext();
        }
        return false;
}
