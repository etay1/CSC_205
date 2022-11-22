package queue;

import java.util.*;

public class ArrayListQueue<T> implements IQueue<T>
{
    ArrayList<T> body;
    public ArrayListQueue()
    {
        body = new ArrayList<T>();
    }
    public boolean isEmpty()
    {
        return (body.size()== 0);
    }
    public void insert(T item)
    {
        body.add(item);
    }
    public T delete()
    {
        if (isEmpty())
            return null;
        T item = body.get(0);
        body.remove(0);
        return item;
    }
    public T front()
    {
        if (isEmpty())
            return null;
        T item = body.get(0);
        return item;
    }
    public void printQueue()
    {
        for(int i = 0; i < body.size(); i++)
        {
            System.out.print(body.get(i) + "    ");
        }
        System.out.println();
    }


    //PSET STARTS HERE-----------------------------------
    /*
    public boolean equals(ArrayListQueue<T> otherQueue) {

        if(this.size() == otherQueue.size()) {

            for(int i = 0; i<body.size(); i++) {

                T thisElement = body.get(i);
                T otherElement = otherQueue.body.get(i);
                if(thisElement != otherElement)
                    return false;
            }

            return true;

        }
        return false;
    }
*/
    public boolean equals(ArrayListQueue<T> queue) {
        if (this.size() != queue.size() ) {
            //System.out.println("Different size");
            return false;
        }
        for(int i = 0; i < this.size(); i++){
            if (!body.get(i).equals(queue.body.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        int count = 0;

        for(int i =0; i<body.size(); i++) {
            count++;
        }

        return count;
    }
    //PSET ENDS HERE-------------------------------------
}
