package compositePattern.composites;

import java.util.Iterator;
import java.util.Stack;

public class CriticalIterator implements Iterator<ReportComponent> {

    Stack<Iterator<ReportComponent>> stack = new Stack<Iterator<ReportComponent>>();

    public CriticalIterator(Iterator<ReportComponent> iterator) {
        stack.push(iterator);
    }


    /**
     * checks if the stack is empty, if yes we dont have any iterator available yet
     * Otherwise we take the Iterator from the stack and check if it has
     * a next Element. If this is false we remove it from the stack and
     * call hasNext recursivly
     * @return
     */
    @Override
    public boolean hasNext() {
        if(stack.empty()) {
            return false;
        } else {
            Iterator<ReportComponent> iterator = stack.peek();
            if(!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    /**
     * If we have a next Element, we take the current iterator from the stack
     * and call its next element. Afterwards the elememts iterator is pushed to the stack.
     * finally we return the aggregate.
     * @return
     */
    @Override
    public ReportComponent next() {

        if(hasNext()) {
            Iterator<ReportComponent> iterator = stack.peek();
            ReportComponent reportComponent = iterator.next();

            stack.push(reportComponent.createIterator());

            return reportComponent;
        } else {
            return null;
        }
    }
}
