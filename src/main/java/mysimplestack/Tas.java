package mysimplestack;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Tas implements SimpleStack {
    private Stack<Item> liste;

    public Tas()
    {
        liste = new Stack<Item>();
    }

    @Override
    public boolean isEmpty() {
        return liste.isEmpty();
    }

    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public void push(Item item) {
        liste.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
            return liste.firstElement();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return liste.pop();
    }
}
